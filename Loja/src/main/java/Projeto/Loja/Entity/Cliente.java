package Projeto.Loja.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_cliente" , nullable = false , length = 100)
    private String nome ;

    @Column(name = "email" , unique = true , length = 150)
    private String email;

    @Column(name = "telefone" , nullable = false , length = 20)
    private String telefone;
}
