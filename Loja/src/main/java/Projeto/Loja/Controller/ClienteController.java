package Projeto.Loja.Controller;


import Projeto.Loja.DTO.CategoriaRequest;
import Projeto.Loja.DTO.CategoriaResponse;
import Projeto.Loja.DTO.ClienteRequest;
import Projeto.Loja.DTO.ClienteResponse;
import Projeto.Loja.Service.CategoriaService;
import Projeto.Loja.Service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clientes")
@Tag(name = "Clientes" , description = "Operaçoes relacionadas aos clientes")
public class ClienteController {


    private final ClienteService clienteService;

    @GetMapping
    @Operation(
            summary = "Listar Clientes",
            description = "Retorna todos os Clientes cadastrados no sistema "
    )
    public List<ClienteResponse> listAll() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(
            summary = "lista clientes por id",
            description = "lista um cliente referente ao id"
    )
    public ClienteResponse findById(@PathVariable Long id) {

        return clienteService.findById(id);
    }

    @PostMapping
    @Operation(
            summary = "cadastra cliente",
            description = "cadastra cliente dentro do sistema"
    )
    public ClienteResponse save(@RequestBody ClienteRequest cliente) {

        return clienteService.save(cliente);
    }

    @PutMapping("/{id}")
    @Operation(
            summary = "atualiza cliente",
            description = "atualiza um cliente do sistema"
    )
    public ClienteResponse update(@PathVariable Long id, @RequestBody ClienteRequest cliente) {

        return clienteService.update(id , cliente);
    }

    @DeleteMapping("/{id}")
    @Operation(
            summary = "deleta Cliente",
            description = "Deleta um cliente dentro do sistema"
    )
    public void delete(@PathVariable Long id) {

        clienteService.delete(id);
    }
}
