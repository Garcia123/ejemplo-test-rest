package com.consulting.serviciovideollamada.utils;

import java.io.FileReader;
import java.util.Properties;

public class PropiedadesImpl implements Propiedades {

	@Override
	public Properties getProperties(String ruta) {
		Properties propiedades = new Properties();
		try {
			propiedades.load(new FileReader(ruta));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return propiedades;
	}

}
