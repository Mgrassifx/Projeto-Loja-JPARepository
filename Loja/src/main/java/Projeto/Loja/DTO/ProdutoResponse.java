package Projeto.Loja.DTO;

import Projeto.Loja.Entity.Categoria;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoResponse {

    private Long id;

    private String nome;

    private BigDecimal preco;

    private int estoque;

    private CategoriaResponse categoriaID;
}
