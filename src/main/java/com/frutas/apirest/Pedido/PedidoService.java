package com.frutas.apirest.Pedido;

import java.time.LocalDateTime;
import java.util.*;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    
    
    public pedido createPedido(PedidoRequest pedidoRequest) {
        pedido pedido = new pedido();
        pedido.setFechaCreacion(LocalDateTime.now());
        pedido.setFechaActualizacion(LocalDateTime.now());
        
        BigDecimal valorTotal = BigDecimal.ZERO;
        Map<String, Integer> frutasCantidad = pedidoRequest.getFrutasCantidad();
        List<String> frutas = new ArrayList<>(frutasCantidad.keySet());
        for (String tipo : frutas) {
            
            valorTotal = valorTotal.add(precioDeFrutaPorTipo(tipo).multiply(BigDecimal.valueOf(frutasCantidad.get(tipo))));
        }
        
        pedido.setValorTotal(valorTotal);
        pedido.setListaDeFrutas(new Gson().toJson(frutasCantidad));
        
        return pedidoRepository.save(pedido);
    }
}
