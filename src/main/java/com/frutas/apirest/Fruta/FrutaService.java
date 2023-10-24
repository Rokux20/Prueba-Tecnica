package com.frutas.apirest.Fruta;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FrutaService {
        
    private final FrutaRepository frutaRepo;
    
    public void createFruta(fruta fruta) {
        
        frutaRepo.save(fruta);

        }


        public List<fruta> listAllFrutas() {
            return frutaRepo.findAll();
        }

        public List<fruta> getFrutaBytipoFruta(String tipo) {
            List<fruta> frutas = frutaRepo.findByTipo(tipo);
            return frutas;

                   
                   
        }


    public fruta updateFruta(Long id, fruta fruta) {
        fruta existingFruta = frutaRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Fruta not found with id: " + id));

        existingFruta.setTipo(fruta.getTipo());
        existingFruta.setCantidad(fruta.getCantidad());
        existingFruta.setPrecio(fruta.getPrecio());
        existingFruta.setFechaActualizacion(LocalDateTime.now());

        return frutaRepo.save(existingFruta);
    }

    public boolean deleteFruta(Long id) {
        try {
            frutaRepo.deleteById(id);
            return true;

        } catch (Exception err) {
            throw new ResourceNotFoundException("Fruta not found with id: " + id);
        }
        }
    
}


