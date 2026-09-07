package Projeto.Loja.Service;

import Projeto.Loja.Repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
}
