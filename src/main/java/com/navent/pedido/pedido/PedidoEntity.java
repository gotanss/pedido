package com.navent.pedido.pedido;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PedidoEntity {

   @Id
   @GeneratedValue
   private Long id;

   private String nombre;

   private Double monto;

   private Double descuento;

}
