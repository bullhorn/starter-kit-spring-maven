package com.client.core.email.service.impl;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.client.core.email.model.MailTemplate;
import com.client.core.email.model.MailTemplateInfo;
import com.client.core.email.service.EmailTemplateService;
import com.client.core.email.service.Emailer;
import com.google.common.collect.Lists;

/**
 * Created by john.sullivan on 10/1/2017.
 */
@Service
public class StandardEmailTemplateService implements EmailTemplateService {

    private final TemplateEngine templateEngine;
    private final Emailer emailer;

    @Autowired
    public StandardEmailTemplateService(TemplateEngine templateEngine, Emailer emailer) {
        this.templateEngine = templateEngine;
        this.emailer = emailer;
    }

    @Override
    public void sendEmail(String mailTo, MailTemplate mailTemplate, Map<String, Object> parameters) throws MessagingException {
        MailTemplateInfo mailInfo = new MailTemplateInfo();

        mailInfo.setTo(Lists.newArrayList(mailTo));

        sendEmail(mailInfo, mailTemplate, parameters);
    }

    @Override
    public void sendEmail(List<String> mailTo, MailTemplate mailTemplate, Map<String, Object> parameters) throws MessagingException {
        MailTemplateInfo mailInfo = new MailTemplateInfo();

        mailInfo.setTo(mailTo);

        sendEmail(mailInfo, mailTemplate, parameters);
    }

    @Override
    public void sendEmail(MailTemplateInfo mailInfo, MailTemplate mailTemplate, Map<String, Object> parameters) throws MessagingException {
        String body = getBody(mailTemplate.getFileName(), parameters);

        emailer.sendEmail(mailInfo.toMailInfo(body, mailTemplate.getSubject()));
    }

    private String getBody(String templateName, Map<String, Object> parameters) {
        Context context = new Context(Locale.US, parameters);

        return templateEngine.process(templateName, context);
    }

}
