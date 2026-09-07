package Projeto.Loja.Service;

import Projeto.Loja.DTO.CategoriaResponse;
import Projeto.Loja.DTO.ClienteRequest;
import Projeto.Loja.DTO.ClienteResponse;
import Projeto.Loja.Entity.Categoria;
import Projeto.Loja.Entity.Cliente;
import Projeto.Loja.Mapper.CategoriaMapper;
import Projeto.Loja.Mapper.ClienteMapper;
import Projeto.Loja.Repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;

    public ClienteResponse save(ClienteRequest request) {

        Cliente cliente = clienteMapper.toEntity(request);

        Cliente clienteSalva = clienteRepository.save(cliente);

        return clienteMapper.toResponse(clienteSalva);
    }

    public List<ClienteResponse> findAll () {

        List<Cliente> lista = clienteRepository.findAll();

        return lista.stream()
                .map(clienteMapper :: toResponse)
                .toList();

    }

    public ClienteResponse findById(Long id) {

        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow();

        return clienteMapper.toResponse(cliente);

    }

    public ClienteResponse update (Long id, ClienteRequest request) {

        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow();

        clienteMapper.updateEntity(request , cliente);

        Cliente clienteAtualizado = clienteRepository.save(cliente);

        return clienteMapper.toResponse(clienteAtualizado);

    }

    public void delete (Long id) {

        clienteRepository.deleteById(id);

    }
}
