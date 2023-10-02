package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/novo")

public class ControllerCv {


	@GetMapping("/cv")

	public ModelAndView curriculo() {

		ModelAndView mv = new ModelAndView("curriculo");


		mv.addObject("nome", "Murilo Lima Dos Santos");


		mv.addObject("dataNascimento", "04/09/1998");

		mv.addObject("linkedin", "https://www.linkedin.com/in/murilolima98");
		mv.addObject("email", "murilolimaa1998@gmail.com");
		mv.addObject("gitHub", "https://github.com/MuriloLima98");

		return mv;

	}
}