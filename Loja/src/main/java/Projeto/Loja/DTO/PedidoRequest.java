package Projeto.Loja.DTO;

import Projeto.Loja.Entity.Enum.STATUSPEDIDO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public record PedidoRequest(

        Long clienteId,

        STATUSPEDIDO status
){}

