package com.navent.pedido.pedido.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoRequest {

   private Long id;

   @NonNull
   private String nombre;

   @NonNull
   private Double monto;

   @NonNull
   private Double descuento;
}
