package Projeto.Loja.DTO;

import Projeto.Loja.Entity.Enum.STATUSPEDIDO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


public record PedidoResponse(

         Long id,

         ClienteResponse cliente,

         LocalDateTime dataPedido,

         STATUSPEDIDO status
) {}
