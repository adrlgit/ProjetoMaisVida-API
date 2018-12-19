package com.andre.maisvida.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.maisvida.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
