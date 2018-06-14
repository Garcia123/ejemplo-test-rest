package com.consulting.serviciovideollamada.beans;

import java.util.Properties;

public class DataBaseConf {
	
	private String driverClassName;
	private String url;
	private String userName;
	private String password;
	private String hibernateDialect;
	private boolean ShowSql;
	
	public DataBaseConf(Properties propiedades) {
		this.driverClassName = propiedades.getProperty("setDriverClassName");
		this.url = propiedades.getProperty("setUrl");
		this.userName = propiedades.getProperty("setUsername");
		this.password = propiedades.getProperty("setPassword");
		this.hibernateDialect = propiedades.getProperty("hibernate.dialect");
		this.ShowSql = propiedades.getProperty("show_sql").equals("true");
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getHibernateDialect() {
		return hibernateDialect;
	}

	public boolean isShowSql() {
		return ShowSql;
	}
}
