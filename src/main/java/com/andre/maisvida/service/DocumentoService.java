package com.andre.maisvida.service;

import org.springframework.stereotype.Service;

import com.andre.maisvida.model.Documento;
import com.andre.maisvida.model.repository.DocumentoRepository;

@Service
public class DocumentoService {

	private DocumentoRepository documentoRepository;
	
	public Documento salvar(Documento documento) {
		return this.documentoRepository.save(documento);
	}
	
	public void excluir(Long id) {
		this.documentoRepository.deleteById(id);
	}
}
