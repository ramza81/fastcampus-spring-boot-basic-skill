package com.bandiera.springbootpractice.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder<?> builder = DataSourceBuilder.create();
        builder.username("");
        builder.password("");
        builder.url("jdbc:h2:mem:test");
        builder.driverClassName("org.h2.Driver");

        return builder.build();
    }
}
