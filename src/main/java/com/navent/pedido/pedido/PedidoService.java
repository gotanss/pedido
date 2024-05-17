package com.navent.pedido.pedido;

import org.springframework.stereotype.Service;

import com.navent.pedido.pedido.dto.PedidoDto;
import com.navent.pedido.pedido.dto.PedidoRequest;
import com.navent.pedido.pedido.mapper.PedidoMapper;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PedidoService {

   private final PedidoRepository pedidoRepository;

   public PedidoDto crearUpdatePedido(PedidoRequest pedidoRequest) {
      PedidoEntity pedido = PedidoEntity
            .builder()
            .monto(pedidoRequest.getMonto())
            .descuento(pedidoRequest.getDescuento())
            .nombre(pedidoRequest.getNombre())
            .build();
      return PedidoMapper.INSTANCE.toDto(pedidoRepository.save(pedido));
   }

   public PedidoDto getPedidoById(Long id) {
      //check si esta en la cache
      // instanciación de BumexMemcached
      // bumexMemcached.get (id);
      // sino se busca en base
      PedidoEntity pedidoEntity = pedidoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entidad no encontrada: " + id));
      // y se agrega a la cache
      // bumexMemcached.get (id, pedidoEntity);
      return PedidoMapper.INSTANCE.toDto(pedidoEntity);
   }

   public void borrarPedido(Long id) {
   //borra pedido
   }
}
