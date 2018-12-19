package com.andre.maisvida.service;

import org.springframework.stereotype.Service;

import com.andre.maisvida.model.Estado;
import com.andre.maisvida.model.repository.EstadoRepository;

@Service
public class EstadoService {

	private EstadoRepository estadoRepository;
	
	public Estado salvar(Estado estado) {
		return this.estadoRepository.save(estado);
	}
	
	public void excluir(Long id) {
		this.estadoRepository.deleteById(id);
	}
}
