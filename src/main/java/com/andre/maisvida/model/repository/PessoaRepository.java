package com.andre.maisvida.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.maisvida.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
