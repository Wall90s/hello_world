package org.generation.atividadehelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<h3>Lista de BSM’s da Generation Brasil</h3>"
				+ "Persistência <br/>"
				+ "Mentalidade de Crescimento<br/>"
				+ "Orientação ao Futuro<br/>"
				+ "Responsabilidade Pessoal<br/>"
				+ "Trabalho em Equipe<br/>"
				+ "Comunicação<br/>"
				+ "Comunicação Não Violenta<br/>"
				+ "Atenção para Detalhes<br/>"
				+ "Proatividade";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "<h3>Objetivos de aprendizagem desta semana</h3>"
				+ "- Aprender o início de Spring <br/>"
				+ "- Aprender mais técnicas de comunicação<br/>"
				+ "- Aprender o básico de Python";
	}
	
	
}
