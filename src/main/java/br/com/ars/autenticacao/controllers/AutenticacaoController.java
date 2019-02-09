package br.com.ars.autenticacao.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutenticacaoController {

	@GetMapping("v1/teste/{teste}")
	public ResponseEntity<String> teste(@RequestParam String teste) {
		return new ResponseEntity<String>("Funcionou", HttpStatus.OK);
	}

	@GetMapping("v1/nome")
	public ResponseEntity<Pessoa> nome() {
		
		Pessoa pessoa = new Pessoa("Adilson","Silva");

		return new ResponseEntity<Pessoa>(pessoa, HttpStatus.OK);
	}

	public class Pessoa {
		private String nome;
		private String sobreNome;

		public Pessoa(String nome, String sobreNome) {
			super();
			this.nome = nome;
			this.sobreNome = sobreNome;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobreNome() {
			return sobreNome;
		}

		public void setSobreNome(String sobreNome) {
			this.sobreNome = sobreNome;
		}

	}
}
