package Projeto.Loja.Mapper;

import Projeto.Loja.DTO.ClienteRequest;
import Projeto.Loja.DTO.ClienteResponse;
import Projeto.Loja.Entity.Cliente;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public Cliente toEntity(ClienteRequest request) {

        Cliente cliente = new Cliente();

        cliente.setNome(request.getNome());
        cliente.setEmail(request.getEmail());
        cliente.setTelefone(request.getTelefone());

        return cliente;
    }

    public ClienteResponse toResponse(Cliente cliente) {

        return new ClienteResponse(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getTelefone()
        );
    }
    public void updateEntity(ClienteRequest request , Cliente cliente) {

        cliente.setNome(request.getNome());
        cliente.setEmail(request.getEmail());
        cliente.setTelefone(request.getTelefone());
    }
}
