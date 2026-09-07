package Projeto.Loja.Repository;

import Projeto.Loja.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria , Long> {

}
