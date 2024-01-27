package br.org.com.recode.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.org.com.recode.model.Inscreva;
import br.org.com.recode.repository.InscrevaRepository;

@Controller
public class InscrevaController {
	
	@Autowired
	private InscrevaRepository inscrevaRepository;

	// === CADASTRO DE SOLICITAÇÕES DE inscreva

	// CHAMA A VIEW C E PASSA UM OBJETO VAZIO
	@GetMapping("/inscreva")
	public ModelAndView inscreva() {
		ModelAndView modelAndView = new ModelAndView("site/participar");
		modelAndView.addObject("inscreva", new Inscreva());
		return modelAndView;
	}
	
		
	@PostMapping("/inscreva")
	public ModelAndView contactar(Inscreva inscreva)  throws IOException {
		
		ModelAndView modelAndView = new ModelAndView("sucess/confirm-contato");

		inscrevaRepository.save(inscreva);

		return modelAndView;
	}
}