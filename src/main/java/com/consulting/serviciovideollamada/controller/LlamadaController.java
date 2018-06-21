package com.consulting.serviciovideollamada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/llamada", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<Llamada> ObtenerLlamadaReceptor(@RequestParam(value = "idReceptor") int idReceptor) {

		Llamada llamada = _llamadaService.buscarLlamadaPorIdReceptor(idReceptor);
		if (llamada == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Llamada>(llamada, HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/llamada", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<?> crearLlamada(@RequestBody Llamada llamada) {

		if (!llamada.camposCompletos()) {
			return new ResponseEntity("para hacer una llamada requieres todos los campos", HttpStatus.CONFLICT);
		}

		_llamadaService.insertarLlamada(llamada);

		return new ResponseEntity<Llamada>(llamada, HttpStatus.CREATED);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/llamada/{id}", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<?> eliminarLlamada(@PathVariable("id") Long id) {

		if (id == null || id <= 0)
			return new ResponseEntity("el id es requerido", HttpStatus.CONFLICT);

		if (_llamadaService.buscarLlamadaPorId(id) == null)
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		_llamadaService.eliminarLlamada(id);

		return new ResponseEntity<Llamada>(HttpStatus.OK);
	}

}
