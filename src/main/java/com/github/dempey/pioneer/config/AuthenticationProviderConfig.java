package com.github.dempey.pioneer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

@Configuration
public class AuthenticationProviderConfig {

    private static final String HOST = "ec2-54-243-185-99.compute-1.amazonaws.com";
    private static final String PORT = "5432";
    private static final String DATABASE_NAME = "de1dgsr8kdafg2";
    private static final String SSL_MODE = "require";

    //TODO - These must be placed in a file outside the bytecode and loaded once at startup
    private static final String USER = System.getenv("DB_USERNAME");
    private static final String PASSWORD = System.getenv("DB_PASSWORD");


    @Bean(name = "dataSource")
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://" + HOST +
                ":" + PORT +
                "/" + DATABASE_NAME +
                "?sslmode=" + SSL_MODE +
                "&user=" + USER +
                "&password=" + PASSWORD);
        return dataSource;

    }

    @Bean(name = "userDetailsService")
    public UserDetailsService userDetailsService() {
        JdbcDaoImpl jdbcImpl = new JdbcDaoImpl();
        jdbcImpl.setDataSource(dataSource());
        jdbcImpl.setUsersByUsernameQuery("select username, password, enabled from users where username=?");
        jdbcImpl.setAuthoritiesByUsernameQuery("select b.username, a.role from user_roles a, users b where b.username=? and a.userid=b.userid");
        return jdbcImpl;
    }
}
