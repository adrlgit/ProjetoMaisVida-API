package com.andre.maisvida.parser;

import com.andre.maisvida.dto.EstadoDTO;
import com.andre.maisvida.model.Estado;

public class EstadoParser {

	public static EstadoDTO toDto(Estado estado) {
		return new EstadoDTO(estado.getNome(), estado.getSigla());
	}
}
