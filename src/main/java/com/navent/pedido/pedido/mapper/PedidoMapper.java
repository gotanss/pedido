package com.navent.pedido.pedido.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingInheritanceStrategy;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.navent.pedido.pedido.PedidoEntity;
import com.navent.pedido.pedido.dto.PedidoDto;

@Mapper(mappingInheritanceStrategy = MappingInheritanceStrategy.EXPLICIT)
public interface PedidoMapper {

   PedidoMapper INSTANCE = Mappers.getMapper(PedidoMapper.class);

   @Mappings({ @Mapping(source = "nombre", target = "nombre"), @Mapping(source = "monto", target = "monto"),
         @Mapping(source = "descuento", target = "descuento")

   })
   PedidoDto toDto(PedidoEntity pedidoEntity);
}
