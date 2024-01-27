package br.org.com.recode.controller;

import java.io.IOException;     
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.org.com.recode.model.FaleConosco;
import br.org.com.recode.repository.FaleConoscoRepository;

@Controller
public class FaleConoscoController {

	@Autowired
	private FaleConoscoRepository faleConoscoRepository;

	// === CADASTRO DE SOLICITAÇÕES DE CONTATO

	// CHAMA A VIEW C E PASSA UM OBJETO VAZIO
	@GetMapping("/contato")
	public ModelAndView contactar() {
		ModelAndView modelAndView = new ModelAndView("site/contato");
		modelAndView.addObject("faleConosco", new FaleConosco());
		return modelAndView;
	}
	
		
	@PostMapping("/contato")
	public ModelAndView contactar(FaleConosco faleConosco)  throws IOException {
		
		ModelAndView modelAndView = new ModelAndView("sucess/confirm-contato");

		faleConoscoRepository.save(faleConosco);

		return modelAndView;
	}

	
	
	
}
