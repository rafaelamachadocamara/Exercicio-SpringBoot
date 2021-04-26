package com.objetivos.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosAprendizagemController {

	@GetMapping
	public String objetivos() {
		return "O Objetivo é praticar o spring-boot para o Projeto Integrador.";
	}
}
