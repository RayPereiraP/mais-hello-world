package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")

public class BsmController {
	@GetMapping
	public String bsm() {
		return "Orientação aos detalhes,\n"
				+ "Orientação ao futuro,\n"
				+ "Persistência,\n"
				+ "Trabalho em equipe,\n"
				+ "Mentalidade de crescimento,\n"
				+ "Responsabilidade pessoal,\n"
				+ "Comunicação,\n"
				+ "Proatividade\n"
				+ "e podemos adicionar mais depois";
	}
}
