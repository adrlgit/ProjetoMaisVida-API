package com.andre.maisvida.parser;

import com.andre.maisvida.dto.PessoaDTO;
import com.andre.maisvida.model.Pessoa;

public class PessoaParser {

	public static PessoaDTO toDTO(Pessoa pessoa) {
		return new PessoaDTO(pessoa.getId(), pessoa.getNome(), pessoa.getDataCadastro(), pessoa.getEstado(), pessoa.getDocumento());
	}
	
	public static  Pessoa toEntity(PessoaDTO pessoaDTO) {
		return new Pessoa(pessoaDTO.getId(), pessoaDTO.getNome(), pessoaDTO.getDataCadastro(), pessoaDTO.getEstado(), pessoaDTO.getDocumento());
	}
}
