package com.mutante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonElement;
import com.mutante.entity.Mutante;
import com.mutante.service.MutanteService;

@RestController
@RequestMapping("/v1")
public class MutanteController {
	
	@Autowired
	MutanteService mutanteService;
	
	@PostMapping(value="/mutant")
	public  HttpStatus postIsMutant(@RequestBody Mutante mutante) {
		
		if(mutanteService.isMutant(mutante.getAdn())) {
			return HttpStatus.OK;
		}
		
		return HttpStatus.FORBIDDEN;
	}

	@GetMapping(value="/stats")
	public String getStats() {
		
		return "Hola";
	}
}
