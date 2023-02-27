package com.client.config;

import com.bullhornsdk.data.api.BullhornData;
import com.client.ApplicationSettings;
import com.client.core.scheduledtasks.ScheduledEventProcessing;
import com.client.core.scheduledtasks.config.CustomSubscriptionSettings;
import com.client.core.scheduledtasks.service.EventWorkflowFactory;
import org.quartz.CronTrigger;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

// TODO: Maybe make scheduled tasks in multiple different folders
@Configuration
public class ScheduledEventConfig {

    private final BullhornData bullhornData;

    private final ApplicationSettings appSettings;

    private final EventWorkflowFactory eventWorkflowFactory;

    private final CustomSubscriptionSettings customSubscriptionSettings;

    ScheduledEventConfig(BullhornData bullhornData,
                         ApplicationSettings appSettings,
                         EventWorkflowFactory eventWorkflowFactory,
                         CustomSubscriptionSettings customSubscriptionSettings) {
        this.bullhornData = bullhornData;
        this.appSettings = appSettings;
        this.eventWorkflowFactory = eventWorkflowFactory;
        this.customSubscriptionSettings = customSubscriptionSettings;
    }

    @Bean
    SchedulerFactoryBean mainScheduler() {
        SchedulerFactoryBean mainScheduler = new SchedulerFactoryBean();
        mainScheduler.setOverwriteExistingJobs(true);
        mainScheduler.setAutoStartup(true);

        CronTrigger[] cronTriggers = getCustomCronTriggers();
        mainScheduler.setTriggers(cronTriggers);

        return mainScheduler;
    }

    private CronTrigger[] getCustomCronTriggers() {
        Map<String, String> customSubscriptions = customSubscriptionSettings.customSubscriptions();
        return customSubscriptions.entrySet().stream().map((subscription) -> {
            String subscriptionName = subscription.getKey();
            String cronExpression = subscription.getValue();
            ScheduledEventProcessing eventProcessing = new ScheduledEventProcessing(subscriptionName, bullhornData, appSettings, eventWorkflowFactory);
            MethodInvokingJobDetailFactoryBean factoryBean = new MethodInvokingJobDetailFactoryBean();

            factoryBean.setTargetObject(eventProcessing);
            factoryBean.setTargetMethod("run");
            factoryBean.setConcurrent(true);
            try {
                factoryBean.afterPropertiesSet();
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                throw new RuntimeException("Could not create Job for subscription " + subscriptionName, e);
            }

            CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
            cronTriggerFactoryBean.setCronExpression(cronExpression);
            cronTriggerFactoryBean.setJobDetail(Objects.requireNonNull(factoryBean.getObject(), "JobDetail was null for subscription " + subscriptionName));
            try {
                cronTriggerFactoryBean.afterPropertiesSet();
            } catch (ParseException e) {
                throw new RuntimeException("Could not parse cron expression " + cronExpression + " (subscriptionName=" + subscriptionName + ")", e);
            }

            return cronTriggerFactoryBean.getObject();
        }).collect(Collectors.toSet()).toArray(new CronTrigger[customSubscriptions.size()]);
    }
}
