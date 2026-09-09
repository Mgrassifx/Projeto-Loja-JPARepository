package Projeto.Loja.Controller;


import Projeto.Loja.DTO.CategoriaRequest;
import Projeto.Loja.DTO.CategoriaResponse;
import Projeto.Loja.DTO.ClienteRequest;
import Projeto.Loja.DTO.ClienteResponse;
import Projeto.Loja.Service.CategoriaService;
import Projeto.Loja.Service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClienteController {


    private final ClienteService clienteService;

    @GetMapping
    public List<ClienteResponse> listAll() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public ClienteResponse findById(@PathVariable Long id) {

        return clienteService.findById(id);
    }

    @PostMapping
    public ClienteResponse save(@RequestBody ClienteRequest cliente) {

        return clienteService.save(cliente);
    }

    @PutMapping("/{id}")
    public ClienteResponse update(@PathVariable Long id, @RequestBody ClienteRequest cliente) {

        return clienteService.update(id , cliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        clienteService.delete(id);
    }
}
