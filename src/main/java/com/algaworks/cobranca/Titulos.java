package com.algaworks.cobranca;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>{

}