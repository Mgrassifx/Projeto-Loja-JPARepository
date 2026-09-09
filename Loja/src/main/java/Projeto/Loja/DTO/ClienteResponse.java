package Projeto.Loja.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public record ClienteResponse(

         Long id,

         String nome,

         String email,

         String telefone
) {}
