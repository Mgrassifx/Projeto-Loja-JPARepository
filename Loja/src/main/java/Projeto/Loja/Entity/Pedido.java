package Projeto.Loja.Entity;

import Projeto.Loja.Entity.Enum.STATUSPEDIDO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id" ,  nullable = false)
    private Cliente cliente;

    @Column(name = "data_pedido" , nullable = false)
    private LocalDateTime dataPedido;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_pedido" , nullable = false)
    private STATUSPEDIDO status ;
}
