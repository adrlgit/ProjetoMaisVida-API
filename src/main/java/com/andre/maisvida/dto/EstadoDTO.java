package com.andre.maisvida.dto;

public class EstadoDTO {

	private String nome;
	private String sigla;
	
	public EstadoDTO() {
	}

	public EstadoDTO(String nome, String sigla) {
		super();
		this.nome = nome;
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}
