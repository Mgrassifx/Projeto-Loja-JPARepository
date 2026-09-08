package Projeto.Loja.Mapper;

import Projeto.Loja.DTO.ClienteResponse;
import Projeto.Loja.DTO.PedidoRequest;
import Projeto.Loja.DTO.PedidoResponse;
import Projeto.Loja.Entity.Cliente;
import Projeto.Loja.Entity.Pedido;
import org.springframework.stereotype.Component;

@Component
public class PedidoMapper {

    public Pedido toEntity(PedidoRequest request) {

        Pedido pedido = new Pedido();

        pedido.setStatus(request.getStatus());

        return pedido;
    }

    public PedidoResponse toResponse (Pedido pedido) {

        ClienteResponse cliente = new ClienteResponse(
                pedido.getCliente().getId(),
                pedido.getCliente().getNome(),
                pedido.getCliente().getEmail(),
                pedido.getCliente().getTelefone()
        );

        return new PedidoResponse(
                pedido.getId(),
                cliente,
                pedido.getDataPedido(),
                pedido.getStatus()

        );
    }

    public void updateEntity(PedidoRequest request , Pedido pedido) {

        pedido.setStatus(request.getStatus());
    }
}
