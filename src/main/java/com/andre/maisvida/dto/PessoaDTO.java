package com.andre.maisvida.dto;

import java.time.LocalDate;
import java.util.List;

import com.andre.maisvida.model.Documento;
import com.andre.maisvida.model.Estado;

public class PessoaDTO {

	private Long id;
	
	private String nome;
	
	private LocalDate dataCadastro;
	
	private Estado estado;
	
	private List<Documento> documento;

	public PessoaDTO(Long id, String nome, LocalDate dataCadastro, Estado estado,
			List<Documento> documento) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.estado = estado;
		this.documento = documento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Documento> getDocumento() {
		return documento;
	}

	public void setDocumento(List<Documento> documento) {
		this.documento = documento;
	}

	
}
