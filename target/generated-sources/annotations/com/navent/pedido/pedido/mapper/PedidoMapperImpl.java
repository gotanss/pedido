package com.navent.pedido.pedido.mapper;

import com.navent.pedido.pedido.PedidoEntity;
import com.navent.pedido.pedido.dto.PedidoDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-17T11:45:03-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
public class PedidoMapperImpl implements PedidoMapper {

    @Override
    public PedidoDto toDto(PedidoEntity pedidoEntity) {
        if ( pedidoEntity == null ) {
            return null;
        }

        PedidoDto.PedidoDtoBuilder pedidoDto = PedidoDto.builder();

        pedidoDto.nombre( pedidoEntity.getNombre() );
        pedidoDto.monto( pedidoEntity.getMonto() );
        pedidoDto.descuento( pedidoEntity.getDescuento() );
        pedidoDto.id( pedidoEntity.getId() );

        return pedidoDto.build();
    }
}
