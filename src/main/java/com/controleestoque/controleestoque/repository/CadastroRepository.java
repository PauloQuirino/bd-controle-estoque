package com.controleestoque.controleestoque.repository;

import com.controleestoque.controleestoque.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Usuario, Long> {
}
