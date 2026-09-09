package Projeto.Loja.Controller;


import Projeto.Loja.DTO.CategoriaRequest;
import Projeto.Loja.DTO.CategoriaResponse;
import Projeto.Loja.DTO.ProdutoRequest;
import Projeto.Loja.DTO.ProdutoResponse;
import Projeto.Loja.Service.CategoriaService;
import Projeto.Loja.Service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/produtos")
public class ProdutoController {



    private final ProdutoService produtoService;

    @GetMapping
    public List<ProdutoResponse> listAll() {
        return produtoService.findAll();
    }

    @GetMapping("/{id}")
    public ProdutoResponse findById(@PathVariable Long id) {

        return produtoService.findById(id);
    }

    @PostMapping
    public ProdutoResponse save(@RequestBody ProdutoRequest produto) {

        return produtoService.save(produto);
    }

    @PutMapping("/{id}")
    public ProdutoResponse update(@PathVariable Long id, @RequestBody ProdutoRequest produto) {

        return produtoService.update(id , produto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        produtoService.delete(id);
    }
}
