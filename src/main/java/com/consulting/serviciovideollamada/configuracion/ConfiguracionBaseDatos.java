package com.consulting.serviciovideollamada.configuracion;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.consulting.serviciovideollamada.beans.DataBaseConf;
import com.consulting.serviciovideollamada.utils.Propiedades;
import com.consulting.serviciovideollamada.utils.PropiedadesImpl;
import com.consulting.serviciovideollamada.utils.SistemaOperativo;
import com.consulting.serviciovideollamada.utils.SistemaOperativoImpl;

@Configuration
@EnableTransactionManagement
public class ConfiguracionBaseDatos {

	private Propiedades propiedades = new PropiedadesImpl();
	private SistemaOperativo so = new SistemaOperativoImpl();
	private String path = so.getSistemaOperativo();
	private DataBaseConf conf = new DataBaseConf(propiedades.getProperties(path));

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		System.out.println("conf : " + conf);
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setPackagesToScan("com.consulting.serviciovideollamada.model");
		sessionFactoryBean.setHibernateProperties(hibernetProperties());
		return sessionFactoryBean;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(conf.getDriverClassName());
		dataSource.setUrl(conf.getUrl());
		dataSource.setUsername(conf.getUserName());
		dataSource.setPassword(conf.getPassword());

		return dataSource;
	}

	public Properties hibernetProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", conf.getHibernateDialect());
		properties.put("show_sql", conf.isShowSql());

		return properties;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(sessionFactory().getObject());
		return hibernateTransactionManager;
	}

}
