package br.com.ars.autenticacao.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ars.autenticacao.model.entitys.Usuario;
import br.com.ars.autenticacao.model.repository.UsuarioRepository;

@RestController
public class AutenticacaoController {

	private Logger logger = LogManager.getLogger(AutenticacaoController.class);

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("v1/usuarios")
	public ResponseEntity<List<Usuario>> teste() {
		
		Usuario u = new Usuario();
		u.setAtivo(Boolean.TRUE);
		u.setDataCadastro(LocalDateTime.now());
		u.setDataExpiracao(LocalDateTime.of(2020, 03, 05, 23, 59, 00));
		u.setEmail("adilson.ro.silva@gmail.com");
		u.setNome("Adilson Rodrigues da Silva");
		u.setSenha("adilson");
		
		usuarioRepository.save(u);
		
		List<Usuario> usuarios = usuarioRepository.findAll();
		
		return new ResponseEntity<>(usuarios, HttpStatus.OK);
	}
}
