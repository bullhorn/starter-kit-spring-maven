package com.client.config;

import com.bullhornsdk.data.api.BullhornData;
import com.client.ApplicationSettings;
import com.client.core.scheduledtasks.ScheduledEventProcessing;
import com.client.core.scheduledtasks.config.CustomSubscriptionSettings;
import com.client.core.scheduledtasks.service.EventWorkflowFactory;
import org.quartz.CronTrigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.text.ParseException;
import java.util.Map;
import java.util.Objects;

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
    public SchedulerFactoryBean mainScheduler() {
        SchedulerFactoryBean mainScheduler = new SchedulerFactoryBean();
        mainScheduler.setOverwriteExistingJobs(true);
        mainScheduler.setAutoStartup(true);

        CronTrigger[] cronTriggers = createCustomCronTriggers();
        mainScheduler.setTriggers(cronTriggers);

        return mainScheduler;
    }

    private CronTrigger[] createCustomCronTriggers() {
        Map<String, String> customSubscriptions = customSubscriptionSettings.customSubscriptions();
        return customSubscriptions.entrySet().stream().map((subscription) -> {
            String subscriptionName = subscription.getKey();
            String cronExpression = subscription.getValue();

            ScheduledEventProcessing eventProcessing = new ScheduledEventProcessing(subscriptionName, bullhornData, appSettings, eventWorkflowFactory);
            MethodInvokingJobDetailFactoryBean jobDetailFactoryBean = this.configureJobDetailFactory(eventProcessing);
            CronTriggerFactoryBean cronTriggerFactoryBean = this.configureCronTriggerFactoryBean(jobDetailFactoryBean, subscriptionName, cronExpression);

            return cronTriggerFactoryBean.getObject();
        }).toArray(CronTrigger[]::new);
    }

    private MethodInvokingJobDetailFactoryBean configureJobDetailFactory(ScheduledEventProcessing eventProcessing) {
        MethodInvokingJobDetailFactoryBean jobDetailFactoryBean = new MethodInvokingJobDetailFactoryBean();

        jobDetailFactoryBean.setTargetObject(eventProcessing);
        jobDetailFactoryBean.setTargetMethod("run");
        jobDetailFactoryBean.setConcurrent(true);
        try {
            jobDetailFactoryBean.afterPropertiesSet();
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException("Could not create Job for subscription " + eventProcessing.getSubscriptionName(), e);
        }

        return jobDetailFactoryBean;
    }

    private CronTriggerFactoryBean configureCronTriggerFactoryBean(MethodInvokingJobDetailFactoryBean jobDetailFactoryBean, String subscriptionName, String cronExpression) {
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setDescription(subscriptionName);
        cronTriggerFactoryBean.setCronExpression(cronExpression);
        cronTriggerFactoryBean.setJobDetail(Objects.requireNonNull(jobDetailFactoryBean.getObject(), "JobDetail was null for subscription " + subscriptionName));
        try {
            cronTriggerFactoryBean.afterPropertiesSet();
        } catch (ParseException e) {
            throw new RuntimeException("Could not parse cron expression " + cronExpression + " (subscriptionName=" + subscriptionName + ")", e);
        }

        return cronTriggerFactoryBean;
    }
}
