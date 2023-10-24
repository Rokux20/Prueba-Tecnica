package com.frutas.apirest.Pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public pedido createPedido(@RequestBody PedidoRequest pedidoRequest) {
        return pedidoService.createPedido(pedidoRequest);
    }
}
