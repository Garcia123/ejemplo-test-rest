package com.consulting.serviciovideollamada.utils;


public class SistemaOperativoImpl implements SistemaOperativo {
	
	private static final String PATH_WINDOW = "C:/servico_video_llamada/conf/database.properties";
	private static final String PATH_LINUX = "/opt/servico_video_llamada/conf/database.properties";
	
	@Override	
	public String getSistemaOperativo() {
		String so = System.getProperty("os.name").toLowerCase(); 
		if(so.indexOf("win")>=0) {
			return SistemaOperativoImpl.PATH_WINDOW;
		}else if(so.indexOf("nux")>=0) {
			return SistemaOperativoImpl.PATH_LINUX;
		}else {
			return null;
		}
	}

}
