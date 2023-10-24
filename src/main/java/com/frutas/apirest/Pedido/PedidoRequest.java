package com.frutas.apirest.Pedido;

import java.util.Map;

public class PedidoRequest {
    private Map<String, Integer> frutasCantidad; 
    public Map<String, Integer> getFrutasCantidad() {
        return frutasCantidad;
    }

    public void setFrutasCantidad(Map<String, Integer> frutasCantidad) {
        this.frutasCantidad = frutasCantidad;
    }

    
}
