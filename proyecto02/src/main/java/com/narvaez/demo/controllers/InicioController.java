package com.narvaez.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.narvaez.demo.model.Usuario;

@Controller
public class InicioController {

	@RequestMapping("/")
	public String inicio(Model model) {
		List<Usuario> listaUsuarios = new ArrayList<>();
		
		int n1 = 15;
		int n2 = 18;
		
		String alumno = "Juan Perez";
		int promedio = (n1 + n2)/2;
		
		Usuario usu1 = new Usuario();
		usu1.setNombre("Carmen");
		usu1.setApellido("Romero");
		
		listaUsuarios.add(usu1);
		
		Usuario usu2 = new Usuario();
		usu2.setNombre("Pedro");
		usu2.setApellido("Otiniano");
		
		listaUsuarios.add(usu2);
		
		Usuario usu3 = new Usuario();
		usu3.setNombre("Maria");
		usu3.setApellido("Castro");
		
		listaUsuarios.add(usu3);
		
		
		model.addAttribute("alu", alumno);
		model.addAttribute("prom", promedio);
		model.addAttribute("usuario1", usu1);
		model.addAttribute("lista", listaUsuarios);
		return "inicio";
	}
}
