package br.com.xavecoding.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.servlet.ModelAndView;

import br.com.xavecoding.models.Professor;
import br.com.xavecoding.models.StatusProfessor;
import ch.qos.logback.core.util.StatusPrinter;

@Controller
public class ProfessorController {
	
	
	//Action para retornar a listagem do professor
	@GetMapping("/professores")
	public ModelAndView index() {
		//Cria os objetos
		Professor batman = new Professor("BATMAN", new BigDecimal(5000.0), StatusProfessor.ATIVO);
		batman.setId(1L);
		Professor coringa = new Professor("CORINGA", new BigDecimal(2000.0), StatusProfessor.INATIVO);
		coringa.setId(2L);
		Professor maravilha = new Professor("MULHER MARAVILHA", new BigDecimal(15000.0), StatusProfessor.APOSENTADO);
		maravilha.setId(3L);
		//Adiciona a lista
		List<Professor> professores = Arrays.asList(batman, coringa, maravilha);
		
		//Cira o objeto do modelo e encaminha para determinada view
		ModelAndView mv = new ModelAndView("professores/index");
		
		//Adiciona a lista ao objeto
		mv.addObject("professores", professores);
		
		//retorna o objeto
		return mv;
		
	}

}
