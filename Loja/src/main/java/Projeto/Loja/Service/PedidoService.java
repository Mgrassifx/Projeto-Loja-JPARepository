package Projeto.Loja.Service;

import Projeto.Loja.DTO.PedidoRequest;
import Projeto.Loja.DTO.PedidoResponse;
import Projeto.Loja.Entity.Cliente;
import Projeto.Loja.Entity.Pedido;
import Projeto.Loja.Mapper.PedidoMapper;
import Projeto.Loja.Repository.ClienteRepository;
import Projeto.Loja.Repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PedidoService {

    private final ClienteRepository clienteRepository;
    private final PedidoRepository pedidoRepository;
    private final PedidoMapper pedidoMapper;

    public PedidoResponse save(PedidoRequest request) {

        Pedido pedido = pedidoMapper.toEntity(request);

        Cliente cliente = clienteRepository.findById(request.clienteId())
                .orElseThrow();

        pedido.setCliente(cliente);

        Pedido pedidoSalvo = pedidoRepository.save(pedido);

        return pedidoMapper.toResponse(pedidoSalvo);

    }

    public List<PedidoResponse> findAll () {

        List<Pedido> lista = pedidoRepository.findAll();


        return pedidoRepository.findAll()
                .stream()
                .map(pedidoMapper :: toResponse)
                .toList();
    }
    public PedidoResponse findById(Long id) {

        Pedido pedido = pedidoRepository.findById(id)
                .orElseThrow();

        return pedidoMapper.toResponse(pedido);
    }

    public PedidoResponse update (Long id , PedidoRequest request) {

        Pedido pedido = pedidoRepository.findById(id)
                        .orElseThrow();

        Cliente cliente = clienteRepository.findById(request.clienteId())
                        .orElseThrow();

        pedidoMapper.updateEntity(request , pedido);

        pedido.setCliente(cliente);

        Pedido pedidoSalvo = pedidoRepository.save(pedido);

        return pedidoMapper.toResponse(pedidoSalvo);
    }

    public void delete (Long id) {

        pedidoRepository.deleteById(id);
    }
}
