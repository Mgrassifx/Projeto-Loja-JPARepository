package Projeto.Loja.DTO;

import Projeto.Loja.Entity.Enum.STATUSPEDIDO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class PedidoRequest {

        private Long clienteId;

        private STATUSPEDIDO status;
    }

