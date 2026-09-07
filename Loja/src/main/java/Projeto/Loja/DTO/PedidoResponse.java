package Projeto.Loja.DTO;

import Projeto.Loja.Entity.Enum.STATUSPEDIDO;

import java.time.LocalDateTime;

public class PedidoResponse {

    private Long id;

    private ClienteResponseDTO cliente;

    private LocalDateTime dataPedido;

    private STATUSPEDIDO status;
}
