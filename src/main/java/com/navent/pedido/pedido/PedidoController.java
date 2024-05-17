package com.navent.pedido.pedido;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navent.pedido.pedido.dto.PedidoDto;
import com.navent.pedido.pedido.dto.PedidoRequest;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/v1/pedido")
@AllArgsConstructor
public class PedidoController {

   private final PedidoService pedidoService;

   @PostMapping
   public void crearUpdatePedido(@Validated @RequestBody PedidoRequest pedidoRequest) {
      pedidoService.crearUpdatePedido(pedidoRequest);
   }

   @PatchMapping
   @CacheEvict(value = "pedidos", key = "#pedidoRequest.id")
   public void updatePedido(@Validated @RequestBody PedidoRequest pedidoRequest) {
      //servicio update
      //implementar una estrategia de bloqueo de forma de no permitir acceder a un dato cuando este se esta modificando
      //      lock()
      //      se modifica el pedido
      //      se libera el lock()

   }

   @GetMapping("/{pedidoId}")
   @Cacheable(value = "pedidos", key = "#pedidoId")
   public PedidoDto getPedido(@PathVariable Long pedidoId) {
      return pedidoService.getPedidoById(pedidoId);
   }
}
