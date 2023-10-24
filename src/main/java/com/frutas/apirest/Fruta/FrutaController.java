package com.frutas.apirest.Fruta;

import java.util.List;


import org.springframework.web.bind.annotation.*;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/fruta")
@RequiredArgsConstructor
public class FrutaController {

    private final FrutaService frutaService;

    @PostMapping
    private void createFruta(@RequestBody fruta fruta) {
        
        frutaService.createFruta(fruta);

        }
    
    @GetMapping
    public List<fruta> listFrutas() {
        return frutaService.listAllFrutas();
    }

    @GetMapping(path = "/{tipo}")
    public List<fruta> getFrutaBytipoFruta(@PathVariable String tipo) {
        return frutaService.getFrutaBytipoFruta(tipo);
    }

        
    @PutMapping (path = "/{id}")
    public fruta updateFruta(@PathVariable Long id, @RequestBody fruta fruta) {
        return frutaService.updateFruta(id, fruta);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteFruta(@PathVariable Long id) {
        boolean ok = this.frutaService.deleteFruta(id);
        if (ok){
            return "Se elimino la fruta con id: " + id;
        }else{
            return "No se pudo eliminar la fruta con id: " + id;
        }
    }

}
