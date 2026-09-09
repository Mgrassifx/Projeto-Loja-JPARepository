package Projeto.Loja.DTO;

import Projeto.Loja.Entity.Categoria;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

public record ProdutoRequest(

         String nome,

         BigDecimal preco,

         int estoque,

         Long categoriaId
){}
