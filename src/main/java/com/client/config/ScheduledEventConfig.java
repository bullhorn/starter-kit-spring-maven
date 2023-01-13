package com.client.config;

import com.bullhornsdk.data.api.BullhornData;
import com.client.ApplicationSettings;
import com.client.core.scheduledtasks.ScheduledEventProcessing;
import com.client.core.scheduledtasks.service.EventWorkflowFactory;
import org.quartz.CronTrigger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.text.ParseException;
import java.util.List;

/**
 * TODO: The scheduled action configured will fail on first startup
 */
@Configuration
public class ScheduledEventConfig {

    private BullhornData bullhornData;

    private ApplicationSettings appSettings;

    private EventWorkflowFactory eventWorkflowFactory;

    ScheduledEventConfig(BullhornData bullhornData,
                         ApplicationSettings appSettings,
                         EventWorkflowFactory eventWorkflowFactory) {
        this.bullhornData = bullhornData;
        this.appSettings = appSettings;
        this.eventWorkflowFactory = eventWorkflowFactory;
    }

    @Bean
    SchedulerFactoryBean mainScheduler(List<CronTrigger> triggers) {
        SchedulerFactoryBean mainScheduler = new SchedulerFactoryBean();
        mainScheduler.setOverwriteExistingJobs(true);
        mainScheduler.setAutoStartup(true);

        mainScheduler.setTriggers(triggers.toArray(new CronTrigger[triggers.size()]));

        return mainScheduler;
    }

    @Bean
    public CronTrigger standardCronTriggerBean(
            MethodInvokingJobDetailFactoryBean standardFactoryBean,
            @Value("${standardCronExpression}") String cronExpression) throws ParseException {

        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setCronExpression(cronExpression);
        cronTriggerFactoryBean.setJobDetail(standardFactoryBean.getObject());
        cronTriggerFactoryBean.afterPropertiesSet();

        return cronTriggerFactoryBean.getObject();
    }

    @Bean
    public MethodInvokingJobDetailFactoryBean standardFactoryBean() {
        MethodInvokingJobDetailFactoryBean factoryBean = new MethodInvokingJobDetailFactoryBean();

        factoryBean.setTargetBeanName("standardSubscriptionScheduledEventProcessing");
        factoryBean.setTargetMethod("run");
        factoryBean.setConcurrent(true);

        return factoryBean;
    }

    @Bean
    ScheduledEventProcessing standardSubscriptionScheduledEventProcessing(@Value("${standardSubscriptionName}") String subName) {
        return new ScheduledEventProcessing(subName, bullhornData, appSettings, eventWorkflowFactory);
    }
}
