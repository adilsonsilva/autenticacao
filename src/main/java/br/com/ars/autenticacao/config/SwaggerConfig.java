package br.com.ars.autenticacao.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Classe de configuração do SWAGGER 2
 * 
 * @author adilson
 *
 */
@Configuration
@EnableSwagger2
@ComponentScan("br.com.ars.autenticacao.controllers")
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(
				RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}
	
	/**
	 * Metode informação da API
	 * 
	 * @return
	 */
	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "API de autenticação OAUTH", 
	      "Descrição da API de autenticação.", 
	      "API Autenticador", 
	      "Termos de Serviço", 
	      new Contact("Adilson Silva", "www.ars.com.br", "adilson.ro.silva@gmail.com.br"), 
	      "Licença da API", "Lincença da API URL", Collections.emptyList());
	}

}
