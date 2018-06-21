package com.consulting.serviciovideollamada.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.consulting.serviciovideollamada.dao.LlamadaDao;
import com.consulting.serviciovideollamada.model.Llamada;

public class LlamadaServiceImpl implements LlamadaService {

	@Autowired
	LlamadaDao _llamadaDao;

	@Override
	public void insertarLlamada(Llamada llamada) {
		// TODO Auto-generated method stub
		_llamadaDao.insertarLlamada(llamada);
	}

	@Override
	public Llamada buscarLlamadaPorId(Long id) {
		// TODO Auto-generated method stub
		return _llamadaDao.buscarLlamadaPorId(id);
	}

	@Override
	public void eliminarLlamada(Long id) {
		// TODO Auto-generated method stub
		_llamadaDao.eliminarLlamada(id);
	}

	@Override
	public Llamada buscarLlamadaPorIdReceptor(int idReceptor) {
		// TODO Auto-generated method stub
		return _llamadaDao.buscarLlamadaPorIdReceptor(idReceptor);
	}

}
