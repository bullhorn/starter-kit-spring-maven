package com.client.config;

import com.bullhornsdk.data.api.BullhornData;
import com.client.ApplicationSettings;
import com.client.core.scheduledtasks.ScheduledEventProcessing;
import com.client.core.scheduledtasks.service.EventWorkflowFactory;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventTask;
import com.client.custom.scheduledtasks.TestTask;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.text.ParseException;
import java.util.List;

@Configuration
public class ScheduledEventConfig {

    private List<AbstractEventTask> eventTasks;

    private BullhornData bullhornData;

    private ApplicationSettings appSettings;

    private EventWorkflowFactory eventWorkflowFactory;

    private ApplicationContext applicationContext;

    @Value("${testTaskOneCronExpression}")
    private String testTaskOneCronExpression;

    @Value("${testTaskTwoCronExpression}")
    private String testTaskTwoCronExpression;

    ScheduledEventConfig(List<AbstractEventTask> eventTasks,
                         BullhornData bullhornData,
                         ApplicationSettings appSettings,
                         EventWorkflowFactory eventWorkflowFactory,
                         ApplicationContext applicationContext) {
        this.eventTasks = eventTasks;
        this.bullhornData = bullhornData;
        this.appSettings = appSettings;
        this.eventWorkflowFactory = eventWorkflowFactory;
        this.applicationContext = applicationContext;
    }

    @Bean
    SchedulerFactoryBean mainScheduler(@Qualifier("testTaskTrigger") CronTrigger testTaskTrigger, @Qualifier("testTaskTwoTrigger") CronTrigger testTaskTwoTrigger) {
        SchedulerFactoryBean mainScheduler = new SchedulerFactoryBean();
        mainScheduler.setOverwriteExistingJobs(true);
        mainScheduler.setAutoStartup(true);

        mainScheduler.setTriggers(
                testTaskTrigger,
                testTaskTwoTrigger
        );

        return mainScheduler;
    }

    @Bean("testTaskTrigger")
    public CronTrigger factoryBeanTestTaskOne(@Qualifier("jobDetailTestTaskOne") MethodInvokingJobDetailFactoryBean jobDetail) throws ParseException {
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setCronExpression(this.testTaskOneCronExpression);
        cronTriggerFactoryBean.setStartDelay(3000);
        cronTriggerFactoryBean.setJobDetail(jobDetail.getObject());
        cronTriggerFactoryBean.afterPropertiesSet();

        return cronTriggerFactoryBean.getObject();
    }

    @Bean("testTaskTwoTrigger")
    public CronTrigger factoryBeanTestTaskTwo(@Qualifier("jobDetailTestTaskTwo") MethodInvokingJobDetailFactoryBean jobDetail) throws ParseException {
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setCronExpression("0 0/1 * 1/1 * ? *");
        cronTriggerFactoryBean.setStartDelay(3000);
        cronTriggerFactoryBean.setJobDetail(jobDetail.getObject());
        cronTriggerFactoryBean.afterPropertiesSet();

        return cronTriggerFactoryBean.getObject();
    }

    @Bean("jobDetailTestTaskOne")
    public MethodInvokingJobDetailFactoryBean createJobDetailFactoryBeanTestTask() {
        MethodInvokingJobDetailFactoryBean factoryBean = new MethodInvokingJobDetailFactoryBean();

        factoryBean.setTargetBeanName("scheduledProcessingTaskOne");
        factoryBean.setTargetMethod("run");
        factoryBean.setConcurrent(true);

        return factoryBean;
    }

    @Bean("jobDetailTestTaskTwo")
    public MethodInvokingJobDetailFactoryBean createJobDetailFactoryBeanTestTaskTwo() {
        MethodInvokingJobDetailFactoryBean factoryBean = new MethodInvokingJobDetailFactoryBean();

        factoryBean.setTargetBeanName("scheduledProcessingTaskTwo");
        factoryBean.setTargetMethod("run");
        factoryBean.setConcurrent(true);

        return factoryBean;
    }

    @Bean("scheduledProcessingTaskOne")
    ScheduledEventProcessing scheduledEventProcessingTaskOne() {
        return new ScheduledEventProcessing("add_company_file_staging", bullhornData, appSettings, eventWorkflowFactory);
    }

    @Bean("scheduledProcessingTaskTwo")
    ScheduledEventProcessing scheduledEventProcessingTaskTwo() {
        return new ScheduledEventProcessing("add_company_file_staging", bullhornData, appSettings, eventWorkflowFactory);
    }
}
