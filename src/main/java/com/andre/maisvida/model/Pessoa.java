package com.andre.maisvida.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String genero;
	
	private LocalDate dataCadastro;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Estado estado;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Documento> documento = new ArrayList<>();
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(Long id, String nome, String genero, LocalDate dataCadastro, Estado estado,
			List<Documento> documento) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
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
