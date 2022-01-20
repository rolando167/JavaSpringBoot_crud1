package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Persona;
import com.example.demo.interfaceService.IPersonaService;

@Controller
@RequestMapping
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Persona>personas = service.listarPersona();
		model.addAttribute("personas", personas);
		return "index";
	}
}
