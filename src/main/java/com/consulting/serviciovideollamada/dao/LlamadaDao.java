package com.consulting.serviciovideollamada.dao;

import com.consulting.serviciovideollamada.model.Llamada;

public interface LlamadaDao {
	
	void insertarLlamada(Llamada llamada);
	
	Llamada  buscarLlamadaPorId(Long id);
	
	void eliminarLlamada(Long id);
	
}
