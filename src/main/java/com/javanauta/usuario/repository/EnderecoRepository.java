package com.javanauta.usuario.repository;


import com.javanauta.usuario.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Telefone, Long> {
}
