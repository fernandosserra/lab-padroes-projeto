package com.fernandosserra.pprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Módulos selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * @author fernandosserra
 */
@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoApplication.class, args);
	}

}
