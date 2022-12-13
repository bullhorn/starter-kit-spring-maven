package com.client.config;

import com.client.ApplicationSettings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.SharedEntityManagerBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Slf4j
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory")
public class JpaConfig {
    // JPA STUFF
    // TODO: Verify what the type of correct datasource should be.
    @Bean
    public DataSource dataSource(ApplicationSettings appSettings) {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(appSettings.getJdbcDriverClassName()); // TODO: Externalize this
        dataSourceBuilder.url(appSettings.getJdbcUrl()); // TODO: Externalize this https://www.baeldung.com/spring-boot-configure-data-source-programmatic
        dataSourceBuilder.username(appSettings.getJdbcUser());
        dataSourceBuilder.password(appSettings.getJdbcPassword());
        return dataSourceBuilder.build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(ApplicationSettings appSettings, DataSource dataSource) {
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
        hibernateJpaVendorAdapter.setShowSql(false); // TODO: fix vars
        hibernateJpaVendorAdapter.setGenerateDdl(true); // TODO: fix vars

        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource(dataSource);
        entityManagerFactory.setJpaVendorAdapter(hibernateJpaVendorAdapter);
        entityManagerFactory.setPackagesToScan();

        entityManagerFactory.setPersistenceUnitName("mainPersistenceUnit"); // TODO: Not sure what this means
        return entityManagerFactory;
    }

    @Bean
    public SharedEntityManagerBean entityManager(LocalContainerEntityManagerFactoryBean entityManagerFactory) {
        SharedEntityManagerBean entityManagerBean = new SharedEntityManagerBean();
        entityManagerBean.setEntityManagerFactory(entityManagerFactory.getObject());
        return entityManagerBean;
    }

    @Bean
    public JpaTransactionManager transactionManager(LocalContainerEntityManagerFactoryBean entityManagerFactory) {
        JpaTransactionManager entityManagerBean = new JpaTransactionManager();
        entityManagerBean.setEntityManagerFactory(entityManagerFactory.getObject());
        return entityManagerBean;
    }
}
