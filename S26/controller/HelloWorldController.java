package com.example.helloWorld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/bsm")
	public List<String> BSM() {
		List<String> lista = new ArrayList<String>();
		lista.add("Persistência");
		lista.add("Mentalidade de Crescimento");
		lista.add("Orientação ao Futuro");
		lista.add("Responsabilidade Pessoal");
		lista.add("Trabalhon em Equipe");
		lista.add("Comunicação");
		lista.add("Orientação ao Detalhe");
		lista.add("Proatividade");
		
		return lista;
	}

	@GetMapping("/aprendizado")
	public List<String> aprendizado() {
		List<String> lista = new ArrayList<String>();
		lista.add("MySQL - Criação de banco de dados e modificação do mesmo.");
		lista.add("Introdução a Back(Spring Boot)");
		
		return lista;
	}
}