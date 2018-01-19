package com.rebiekong.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.server.environment.JdbcEnvironmentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class JdbcConfig {

    @Bean
    @Autowired
    public JdbcEnvironmentRepository getConfig(JdbcTemplate jdbcTemplate) {
        JdbcEnvironmentRepository r = new JdbcEnvironmentRepository(jdbcTemplate);
        r.setSql("SELECT `config_key`, `config_value` from `properties` where `application`=? and `profile`=? and `label`=?");
        return r;
    }
}
