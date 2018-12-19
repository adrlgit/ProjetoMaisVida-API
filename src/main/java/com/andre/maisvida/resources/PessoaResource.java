package com.andre.maisvida.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andre.maisvida.dto.PessoaDTO;
import com.andre.maisvida.model.repository.PessoaRepository;
import com.andre.maisvida.service.PessoaService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "pessoas")
public class PessoaResource {

	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@PostMapping
	public ResponseEntity<PessoaDTO> cadastrar(@Valid @RequestBody PessoaDTO pessoaDTO){
		PessoaDTO novaPessoa = pessoaService.salvar(pessoaDTO);
		return ResponseEntity.ok(novaPessoa);
	}
	
	@DeleteMapping(value = "{id}")
	public void excluir(@PathVariable Long id) {
		this.pessoaService.excluir(id);
	}
	
	@GetMapping
	public ResponseEntity<List<PessoaDTO>> encontreTodos(){
		List<PessoaDTO> pessoas = pessoaService.encontrarTodos();
		
		return ResponseEntity.ok(pessoas);
	}
	
	@GetMapping(value = "/paginado")
	public ResponseEntity<?> list(Pageable page) {
		return ResponseEntity.ok(pessoaRepository.findAll(page));
	}
	
	@GetMapping(value = "{id}")
	public ResponseEntity<PessoaDTO> buscaId(@PathVariable Long id) {
		PessoaDTO pessoaDTO = pessoaService.encontrarById(id);
		return ResponseEntity.ok(pessoaDTO);
	}
	
	@PutMapping
	public ResponseEntity<PessoaDTO> edite(@Valid @RequestBody PessoaDTO pessoaDTO){
		PessoaDTO novaPessoa = pessoaService.salvar(pessoaDTO);
		return ResponseEntity.ok(novaPessoa);
	}
}
