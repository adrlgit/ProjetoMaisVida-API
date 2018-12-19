package com.andre.maisvida.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.andre.maisvida.dto.PessoaDTO;
import com.andre.maisvida.model.Pessoa;
import com.andre.maisvida.model.repository.PessoaRepository;
import com.andre.maisvida.parser.PessoaParser;

@Service
public class PessoaService {

	private PessoaRepository pessoaRepository;
	
	public PessoaDTO salvar(PessoaDTO pessoaDTO) {
		Pessoa pessoa = PessoaParser.toEntity(pessoaDTO);
		return PessoaParser.toDTO(pessoaRepository.save(pessoa));
	}
	
	public void excluir(Long id) {
		this.pessoaRepository.deleteById(id);
	}
	
	public List<PessoaDTO> encontrarTodos() {
		List<Pessoa> pessoas = pessoaRepository.findAll();
		return pessoas.stream().map(PessoaParser::toDTO).collect(Collectors.toList());
	}
	
	public PessoaDTO encontrarById(Long id) {
		Pessoa pessoa = pessoaRepository.findById(id).orElse(null);
		return PessoaParser.toDTO(pessoa);
	}
	
	public List<PessoaDTO> buscaPaginada(Pageable pageable) {
		Page<Pessoa> pessoas = pessoaRepository.findAll(pageable);
		return pessoas.stream().map(PessoaParser::toDTO).collect(Collectors.toList());
	}
}
