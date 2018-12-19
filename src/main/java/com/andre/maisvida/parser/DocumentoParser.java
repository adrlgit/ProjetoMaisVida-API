package com.andre.maisvida.parser;

import com.andre.maisvida.dto.DocumentoDTO;
import com.andre.maisvida.model.Documento;

public class DocumentoParser {

	public static DocumentoDTO toDTO(Documento documento) {
		return new DocumentoDTO(documento.getId(), documento.getNome(), documento.getTipo());
	}
}
