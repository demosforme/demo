package com.example.demo.config;

import com.example.demo.properties.DataSourceProperties;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DatasourceConfiguration {
    private HikariConfig hikariConfig;
    private DataSourceProperties dataSourceProperties;

    public DatasourceConfiguration(HikariConfig hikariConfig, DataSourceProperties dataSourceProperties) {
        this.hikariConfig = hikariConfig;
    }

    @Bean
    public DataSource dataSource() throws SQLException {
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser(dataSourceProperties.getUserName());
        dataSource.setPassword(dataSourceProperties.getPassword());
        dataSource.setURL(dataSourceProperties.getUrl());
        dataSource.setImplicitCachingEnabled(true);
        hikariConfig.setDataSource(dataSource);
        hikariConfig.setDriverClassName(dataSourceProperties.getDriverClassName());
        hikariConfig.setConnectionTestQuery(dataSourceProperties.getConnectionTestQuery());
        hikariConfig.setMinimumIdle(dataSourceProperties.getMinimumIdle());
        hikariConfig.setMaximumPoolSize(dataSourceProperties.getMaxPoolSize());
        return new HikariDataSource(hikariConfig);
    }
}
