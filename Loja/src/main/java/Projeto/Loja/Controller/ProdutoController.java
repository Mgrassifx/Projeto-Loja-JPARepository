package Projeto.Loja.Controller;


import Projeto.Loja.DTO.CategoriaRequest;
import Projeto.Loja.DTO.CategoriaResponse;
import Projeto.Loja.DTO.ProdutoRequest;
import Projeto.Loja.DTO.ProdutoResponse;
import Projeto.Loja.Service.CategoriaService;
import Projeto.Loja.Service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/produtos")
@Tag(name = "Produtos", description = "Operaçoes relacionadas aos produtos")
public class ProdutoController {



    private final ProdutoService produtoService;

    @GetMapping
    @Operation(
            summary = "Listar Produtos",
            description = "Listar todos os produtos caadastrados no sistema"
    )
    public List<ProdutoResponse> listAll() {
        return produtoService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(
            summary = "Lista produto por Id",
            description = "Lista um produto referente ao id"
    )
    public ProdutoResponse findById(@PathVariable Long id) {

        return produtoService.findById(id);
    }

    @PostMapping
    @Operation(
            summary = "Cadastrar produto",
            description = "cadastra um novo produto no sistema"
    )
    public ProdutoResponse save(@RequestBody ProdutoRequest produto) {

        return produtoService.save(produto);
    }

    @PutMapping("/{id}")
    @Operation(
            summary = "Atualiza Produto",
            description = "Atualiza um produto no sistema"
    )
    public ProdutoResponse update(@PathVariable Long id, @RequestBody ProdutoRequest produto) {

        return produtoService.update(id , produto);
    }

    @DeleteMapping("/{id}")
    @Operation(
            summary = "Deleta Produto",
            description = "Deleta um produto do sistema"
    )
    public void delete(@PathVariable Long id) {

        produtoService.delete(id);
    }
}
