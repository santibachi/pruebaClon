package com.pruebas.controles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.pruebas.modelo.Jugador;



@Controller
//@SessionAttributes("jugador") No nos sirve ahora
public class JugadorControl0 {

	@GetMapping("/datos")
	public String formulario(Model model) {
		model.addAttribute("nombre","Nombre");
		model.addAttribute("exname","Escribe tu nombre");
		model.addAttribute("ape1","Primer Apellido");
		model.addAttribute("exape1","Escribe tu primer apellido");
		model.addAttribute("email","Email");
		model.addAttribute("exemail","ejemplo@gmail.com");
		model.addAttribute("hombre","Hombre");
		model.addAttribute("mujer","Mujer");
		model.addAttribute("aleEnf","¿Alergia o Enfermedad o las 2?");
		model.addAttribute("curso","Introduzca su curso");
		model.addAttribute("curso1","2º Bach");
		model.addAttribute("curso2","1º Bach");
		model.addAttribute("curso3","4º Eso");
		return ("datos");
	}
	
	@PostMapping("/recepcionDatos")
	public String procesarDatos(Jugador jugador, Model model) {
		model.addAttribute("jugador",jugador);
		return("recepcionDatos");
	}
	

	
	
}
	
	
	
	

