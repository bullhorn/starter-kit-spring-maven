package com.client.config;

import com.bullhornsdk.data.api.BullhornData;
import com.client.ApplicationSettings;
import com.client.core.scheduledtasks.ScheduledEventProcessing;
import com.client.core.scheduledtasks.config.ScheduledTasksSettings;
import com.client.core.scheduledtasks.service.EventWorkflowFactory;
import org.quartz.CronTrigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Configuration
public class ScheduledEventConfig {

    private final BullhornData bullhornData;

    private final ApplicationSettings appSettings;

    private final EventWorkflowFactory eventWorkflowFactory;

    private final ScheduledTasksSettings scheduledTasksSettings;

    ScheduledEventConfig(BullhornData bullhornData,
                         ApplicationSettings appSettings,
                         EventWorkflowFactory eventWorkflowFactory,
                         ScheduledTasksSettings scheduledTasksSettings) {
        this.bullhornData = bullhornData;
        this.appSettings = appSettings;
        this.eventWorkflowFactory = eventWorkflowFactory;
        this.scheduledTasksSettings = scheduledTasksSettings;
    }

    @Bean
    public SchedulerFactoryBean mainScheduler() {
        SchedulerFactoryBean mainScheduler = new SchedulerFactoryBean();
        mainScheduler.setOverwriteExistingJobs(true);
        mainScheduler.setAutoStartup(true);

        List<CronTrigger> cronTriggers = new ArrayList<>(this.createCustomCronTriggers());
        mainScheduler.setTriggers(cronTriggers.toArray(CronTrigger[]::new));

        return mainScheduler;
    }

    private List<CronTrigger> createCustomCronTriggers() {
        Map<String, String> customSubscriptions = scheduledTasksSettings.customSubscriptions();

        return customSubscriptions.entrySet().stream().map((subscription) -> {
            String subscriptionName = subscription.getKey();
            String cronExpression = subscription.getValue();
            MethodInvokingJobDetailFactoryBean jobDetailFactoryBean;

            try {
                ScheduledEventProcessing eventProcessing = new ScheduledEventProcessing(subscriptionName, bullhornData, appSettings, eventWorkflowFactory);
                jobDetailFactoryBean = this.configureJobDetailFactory(eventProcessing);
                CronTriggerFactoryBean cronTriggerFactoryBean = this.configureCronTriggerFactoryBean(jobDetailFactoryBean, subscriptionName, cronExpression);

                return cronTriggerFactoryBean.getObject();
            } catch (RuntimeException ex) {
                throw new RuntimeException("Could not create Job for subscription " + subscriptionName, ex);
            }
        }).toList();
    }

    private MethodInvokingJobDetailFactoryBean configureJobDetailFactory(Runnable eventProcessing) {
        MethodInvokingJobDetailFactoryBean jobDetailFactoryBean = new MethodInvokingJobDetailFactoryBean();

        jobDetailFactoryBean.setTargetObject(eventProcessing);
        jobDetailFactoryBean.setTargetMethod("run");
        jobDetailFactoryBean.setConcurrent(true);
        try {
            jobDetailFactoryBean.afterPropertiesSet();
        } catch (ClassNotFoundException | NoSuchMethodException ex) {
            throw new RuntimeException(ex);
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
