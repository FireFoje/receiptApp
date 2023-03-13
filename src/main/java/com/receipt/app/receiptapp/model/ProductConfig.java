package com.receipt.app.receiptapp.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class ProductConfig {

    @Value("${db.classDriver}")
    private String driverClass;
    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.name}")
    private String dbName;
    @Value("${db.password}")
    private String dbPassword;


    @Bean
    public DriverManagerDataSource productConfig() {
        System.out.println(driverClass + " " + dbUrl + " " + dbName + " " + dbPassword);
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName(driverClass);
        source.setUsername(dbName);
        source.setPassword(dbPassword);
        source.setUrl(dbUrl);
        return source;
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(){
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.productConfig());
        return namedParameterJdbcTemplate;
    }
}
