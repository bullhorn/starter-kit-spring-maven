package com.client.config;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.api.mock.MockBullhornData;
import com.client.core.base.tools.test.TestEntities;
import com.client.core.base.tools.test.TestUtil;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.SharedEntityManagerBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import java.util.Properties;

public class TestConfig {

    @Bean
    TestEntities testEntities() {
        TestEntities testEntities = new TestEntities();
        testEntities.setAppointmentId(1);
        testEntities.setAppointmentAttendeeId(1);
        testEntities.setBusinessSectorId(1);
        testEntities.setCandidateId(1);
        testEntities.setCandidateEducationId(1);
        testEntities.setCandidateReferenceId(1);
        testEntities.setCandidateWorkHistoryId(1);
        testEntities.setCategoryId(1);
        testEntities.setCertificationId(1);
        testEntities.setClientContactId(1);
        testEntities.setClientCorporationId(1);
        testEntities.setCorporateUserId(1);
        testEntities.setCorporationDepartmentId(1);
        testEntities.setCountryId(1);
        testEntities.setHousingComplexId(1);
        testEntities.setJobOrderId(1);
        testEntities.setJobSubmissionId(1);
        testEntities.setJobSubmissionHistoryId(1);
        testEntities.setNoteId(1);
        testEntities.setNoteEntityId(1);
        testEntities.setPlacementId(1);
        testEntities.setPlacementChangeRequestId(1);
        testEntities.setPlacementCommissionId(1);
        testEntities.setSendoutId(1);
        testEntities.setSkillId(1);
        testEntities.setSpecialtyId(1);
        testEntities.setStateId(1);
        testEntities.setTaskId(1);
        testEntities.setTimeUnitId(1);
        return testEntities;
    }

    @Bean
    TestUtil testUtil() {
        return new TestUtil();
    }

    @Bean
    EmbeddedDatabase dataSource() {
        return new EmbeddedDatabaseBuilder().build();
    }

    @Bean("entityManagerFactory")
    LocalContainerEntityManagerFactoryBean entityManagerFactory(EmbeddedDatabase db, HibernateJpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "create");
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.format_sql", "true");
        factoryBean.setJpaProperties(properties);

        factoryBean.setPackagesToScan();
        factoryBean.setDataSource(db);
        return factoryBean;
    }

    @Bean("entityManager")
    SharedEntityManagerBean sharedEntityManagerBean(@Qualifier("entityManagerFactory") LocalContainerEntityManagerFactoryBean entityManagerFactory) {
        SharedEntityManagerBean sharedEntityManagerBean = new SharedEntityManagerBean();
        sharedEntityManagerBean.setEntityManagerFactory(entityManagerFactory.getObject());
        return sharedEntityManagerBean;
    }

    @Bean
    HibernateJpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.HSQLDialect");
        jpaVendorAdapter.setShowSql(true);
        jpaVendorAdapter.setGenerateDdl(false);
        jpaVendorAdapter.setDatabase(Database.HSQL);
        return jpaVendorAdapter;
    }

    @Bean("abstractEntityFactory")
    LocalContainerEntityManagerFactoryBean abstractEntityFactory(HibernateJpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "create");
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.format_sql", "true");
        factoryBean.setJpaProperties(properties);
        factoryBean.setPackagesToScan();
        return factoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager(@Qualifier("entityManagerFactory") LocalContainerEntityManagerFactoryBean entityManagerFactory) {
        JpaTransactionManager entityManagerBean = new JpaTransactionManager();
        entityManagerBean.setEntityManagerFactory(entityManagerFactory.getObject());
        return entityManagerBean;
    }
}
