package com.client.config;

import com.client.ApplicationSettings;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.SharedEntityManagerBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

/**
 * Configuration for JPA/Hibernate beans.
 */
@Configuration
@EnableJpaRepositories(basePackages = {"com.client.custom.jpa.repositories"})
@ConditionalOnProperty(value = "spring.autoconfigure.exclude", havingValue = "*", matchIfMissing = true)
public class JpaConfig {
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(ApplicationSettings appSettings, DataSource dataSource) {
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
        hibernateJpaVendorAdapter.setShowSql(appSettings.hibernate().showSql());
        hibernateJpaVendorAdapter.setGenerateDdl(appSettings.hibernate().generateDdl());

        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource(dataSource);
        entityManagerFactory.setJpaVendorAdapter(hibernateJpaVendorAdapter);
        entityManagerFactory.setPackagesToScan("com.client.custom.jpa.model");

        entityManagerFactory.setPersistenceUnitName("mainPersistenceUnit");
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
