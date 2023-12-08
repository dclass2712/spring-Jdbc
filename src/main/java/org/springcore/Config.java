package org.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.AbstractDriverBasedDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.DriverManager;

//This File is for Configuration of the Databases
@Configuration
public class Config {

    @Bean(name = {"dataSource"})
    public DriverManagerDataSource getDriverManagerDataSource(){
        DriverManagerDataSource driverManager  = new DriverManagerDataSource();
        driverManager.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManager.setUrl("jdbc:mysql://localhost:3306/spring_jdbc?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT");
        driverManager.setUsername("root");
        driverManager.setPassword("rootroot");
        return driverManager;
    }

    @Bean(name = {"jdbcTemplate"})
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(this.getDriverManagerDataSource());
    }

}
