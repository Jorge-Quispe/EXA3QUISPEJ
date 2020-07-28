package com.edu.EXAQUISPEJBACK.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.EXAQUISPEJBACK.Service.LibroService;
import com.edu.EXAQUISPEJBACK.entity.Libro;

@RestController
public class HomeController {
	@Autowired
	private LibroService libroservice;
		@GetMapping("/")
		public List<Libro> mensaje(){
			return libroservice.readAll();
	}
}
