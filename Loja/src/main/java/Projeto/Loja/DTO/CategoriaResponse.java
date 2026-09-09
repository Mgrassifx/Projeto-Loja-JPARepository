package Projeto.Loja.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public record CategoriaResponse(
         Long id,
         String nome
) { }
