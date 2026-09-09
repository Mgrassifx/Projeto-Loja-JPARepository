package Projeto.Loja.Mapper;

import Projeto.Loja.DTO.CategoriaResponse;
import Projeto.Loja.DTO.ProdutoRequest;
import Projeto.Loja.DTO.ProdutoResponse;
import Projeto.Loja.Entity.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

    public Produto toEntity(ProdutoRequest request) {

        Produto produto = new Produto();

        produto.setNome(request.nome());
        produto.setPreco(request.preco());
        produto.setEstoque(request.estoque());

        return produto;
    }

    public ProdutoResponse toResponse(Produto produto) {

        CategoriaResponse categoria = new CategoriaResponse(
                produto.getCategoria().getId(),
                produto.getCategoria().getNome()
        );

        return new ProdutoResponse(
                produto.getId(),
                produto.getNome(),
                produto.getPreco(),
                produto.getEstoque(),
                categoria
        );
    }

    public void updateEntity (ProdutoRequest request , Produto produto) {

        produto.setNome(request.nome());
        produto.setPreco(request.preco());
        produto.setEstoque(request.estoque());
    }
}
