package br.org.com.recode.controller;


import org.springframework.stereotype.Controller;   
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RotasSite {

	// ROTAS PRINCIPAIS	

	@GetMapping("/")
	// INICIALIZA A APLICAÇÃO
	public String index() {
		return "index";
	}

	@GetMapping("/participar")
	// PÁGINA PROMOÇÕES
	public ModelAndView participar() {
		ModelAndView modelAndView = new ModelAndView("site/participar");
		return modelAndView;
	}
	
	@GetMapping("/sobre")
	// PÁGINA PROMOÇÕES
	public ModelAndView sobre() {
		ModelAndView modelAndView = new ModelAndView("site/sobre");
		return modelAndView;
	}
	
	@GetMapping("/contatos")
	// PÁGINA DESTINOS
	public ModelAndView contatos() {
		ModelAndView modelAndView = new ModelAndView("site/contato");
		return modelAndView;
	}
		
	
	
	
	
		
}
