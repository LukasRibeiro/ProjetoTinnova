package com.example.api.ApiTinnova.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.api.ApiTinnova.Service.FatorialService;

@Controller
public class FatorialController {

	@Autowired
	private FatorialService fs;
	
	
	@RequestMapping(value="/fatorial", method = RequestMethod.GET)
	public String fatorialPage() {
		
		return "fatorial";
	}
	
	
	@RequestMapping(value="/Calculafatorial", method = RequestMethod.POST)
	public ModelAndView faotorial() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("fatorial", fs.fatorial(8));
		
		return mv;
	}
}