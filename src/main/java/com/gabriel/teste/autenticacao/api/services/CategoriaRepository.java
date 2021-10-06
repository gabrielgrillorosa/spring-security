package com.gabriel.teste.autenticacao.api.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.teste.autenticacao.api.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
}
