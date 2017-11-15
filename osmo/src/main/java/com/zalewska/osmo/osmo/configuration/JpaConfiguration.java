package com.zalewska.osmo.osmo.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.zalewska.osmo.osmo.repo",
		entityManagerFactoryRef = "entityManagerFactory",
		transactionManagerRef = "transactionManager")
@EnableTransactionManagement
public class JpaConfiguration {

	@Autowired
	private Environment environment;
	
	@Value("${datasource.osmo.maxPoolSize:10}")
	private int maxPoolSize;
	
	@Bean
	@Primary
	@ConfigurationProperties(prefix = "datasource.osmo")
	public DataSourceProperties dataSourceProperties() {
		return new DataSourceProperties();
	}
	@Bean
	public DataSource dataSource() {
		
	}
}
