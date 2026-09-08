package Projeto.Loja.Controller;

import Projeto.Loja.DTO.CategoriaRequest;
import Projeto.Loja.DTO.CategoriaResponse;
import Projeto.Loja.Service.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaResponse> listAll() {
        return categoriaService.findAll();
    }

    @GetMapping("/{id}")
    public CategoriaResponse findById(@PathVariable Long id) {

        return categoriaService.findById(id);
    }

    @PostMapping
    public CategoriaResponse save(@RequestBody CategoriaRequest categoria) {

        return categoriaService.save(categoria);
    }

    @PutMapping("/{id}")
    public CategoriaResponse update(@PathVariable Long id, @RequestBody CategoriaRequest categoria) {

        return categoriaService.update(id , categoria);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        categoriaService.delete(id);
    }
}
