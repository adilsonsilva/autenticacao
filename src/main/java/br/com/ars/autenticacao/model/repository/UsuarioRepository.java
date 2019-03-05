/**
 * 
 */
package br.com.ars.autenticacao.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ars.autenticacao.model.entitys.Usuario;

/**
 * @author adilson
 *
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	
}
