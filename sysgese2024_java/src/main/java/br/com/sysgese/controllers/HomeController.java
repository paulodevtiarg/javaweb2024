package br.com.sysgese.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("/home/Index");
		mv.addObject("versao", "1.0.29_2024");
		
		
		return mv;
	}

}
