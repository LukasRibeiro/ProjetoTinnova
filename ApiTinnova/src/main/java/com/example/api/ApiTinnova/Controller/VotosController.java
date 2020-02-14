package com.example.api.ApiTinnova.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.api.ApiTinnova.Service.VotosService;

@Controller
public class VotosController {
	
	@Autowired
	private VotosService vs;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String votosPage() {
		return "votos";
	}
	
	@RequestMapping(value = "/votosValidos", method = RequestMethod.POST)
	public ModelAndView votosValidos() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("voto", vs.votosValidos());
		
		return mv;
	}
	
	@RequestMapping(value = "/votosBrancos", method = RequestMethod.POST)
	public ModelAndView votosBrancos() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("voto", vs.VotosBrancos());
		
		return mv;
	}
	
	@RequestMapping(value = "/votosNulos", method = RequestMethod.POST)
	public ModelAndView votosNulos() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("voto", vs.votosNulos());
		
		return mv;
	}
}
