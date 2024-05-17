package com.navent.pedido.pedido.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PedidoDto {

   private Long id;

   private String nombre;

   private Double monto;

   private Double descuento;
}
