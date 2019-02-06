package br.com.ars.autenticacao.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutenticacaoController {

	@GetMapping("v1/teste")
	public ResponseEntity<String> teste() {
		return new ResponseEntity<String>("Funcionou", HttpStatus.OK);
	}
	
	@GetMapping("v1/nome")
	public ResponseEntity<String> nome(){
		return new ResponseEntity<String>("Vanessa", HttpStatus.OK);
	}
}
