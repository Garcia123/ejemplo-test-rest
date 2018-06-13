package com.consulting.serviciovideollamada.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.consulting.serviciovideollamada.model.Doctor;
import com.consulting.serviciovideollamada.service.DoctorService;

@Controller
@RequestMapping("/v1")
public class DoctorController {

	@Autowired
	DoctorService _doctoresService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/doctor", method = RequestMethod.GET, 	headers = "Accept=application/json")
	public ResponseEntity<List<Doctor>> getDoctor() {

		List<Doctor> doctores = new ArrayList<Doctor>();
		doctores = _doctoresService.findAllDoctor();

		if (doctores.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Doctor>>(doctores, HttpStatus.OK);
	}

}
