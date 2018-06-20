package com.consulting.serviciovideollamada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.consulting.serviciovideollamada.model.Llamada;
import com.consulting.serviciovideollamada.service.LlamadaService;

@Controller
@RequestMapping("/v1")
@CrossOrigin("*")
public class LlamadaController {

	@Autowired
	LlamadaService _llamadaService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/llamada/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<Llamada> getDoctor(@PathVariable("id") Long id) {

		if (id == null)
			return new ResponseEntity(HttpStatus.NO_CONTENT);

		Llamada llamada = _llamadaService.buscarLlamadaPorId(id);

		if (llamada == null)
			return new ResponseEntity(HttpStatus.NO_CONTENT);

		return new ResponseEntity<Llamada>(llamada, HttpStatus.OK);
	}

}	
