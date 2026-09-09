package Projeto.Loja.Service;

import Projeto.Loja.DTO.CategoriaRequest;
import Projeto.Loja.DTO.CategoriaResponse;
import Projeto.Loja.Entity.Categoria;
import Projeto.Loja.Mapper.CategoriaMapper;
import Projeto.Loja.Repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;
    private final CategoriaMapper categoriaMapper;

    public CategoriaResponse save(CategoriaRequest request) {

        Categoria categoria = categoriaMapper.toEntity(request);

        Categoria categoriaSalva = categoriaRepository.save(categoria);

        return categoriaMapper.toResponse(categoriaSalva);
    }

    public List<CategoriaResponse> findAll () {

        return categoriaRepository.findAll()
                .stream()
                .map(categoriaMapper::toResponse)
                .toList();
    }
    public CategoriaResponse findById(Long id) {

        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow();

        return categoriaMapper.toResponse(categoria);
    }

    public CategoriaResponse update (Long id, CategoriaRequest request) {

        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow();

        categoriaMapper.updateEntity(request, categoria);

        Categoria categoriaAtualizada = categoriaRepository.save(categoria);

        return categoriaMapper.toResponse(categoriaAtualizada);
    }

    public void delete (Long id) {

        categoriaRepository.deleteById(id);
    }
}
