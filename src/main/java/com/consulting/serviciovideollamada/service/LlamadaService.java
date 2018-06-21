package com.consulting.serviciovideollamada.service;

import com.consulting.serviciovideollamada.model.Llamada;

public interface LlamadaService {

	void insertarLlamada(Llamada llamada);

	Llamada buscarLlamadaPorId(Long id);

	void eliminarLlamada(Long id);
	
	Llamada buscarLlamadaPorIdReceptor(int idReceptor);

}
