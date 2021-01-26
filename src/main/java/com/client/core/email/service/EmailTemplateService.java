package com.client.core.email.service;

import com.client.core.email.model.MailTemplate;
import com.client.core.email.model.MailTemplateInfo;

import javax.mail.MessagingException;
import java.util.Collection;
import java.util.Map;

public interface EmailTemplateService {

    /**
     * Sends an email to a single email address, using the sender from {@link com.client.core.email.MailSettings}
     *
     * @param mailTo the email address to which we want to send the email
     * @param mailTemplate the email template to be rendered into the body for the email
     * @param parameters the parameters to inject into the email template to be rendered
     *
     * @throws MessagingException when the email is malformed or SMTP setup is not correct.
     */
    void sendEmail(String mailTo, MailTemplate mailTemplate, Map<String, Object> parameters) throws MessagingException;

    /**
     * Sends an email to a collection of email addresses, using the sender from {@link com.client.core.email.MailSettings}
     *
     * @param mailTo the email addresses to which we want to send the email
     * @param mailTemplate the email template to be rendered into the body for the email
     * @param parameters the parameters to inject into the email template to be rendered
     *
     * @throws MessagingException when the email is malformed or SMTP setup is not correct.
     */
    void sendEmail(Collection<String> mailTo, MailTemplate mailTemplate, Map<String, Object> parameters) throws MessagingException;

    /**
     * Sends an email to the email addresses provided in the {@link com.client.core.email.model.MailInfo}, using the sender from the passed in {@link com.client.core.email.model.MailInfo},
     * or if not provided, the one in {@link com.client.core.email.MailSettings}.  Provides much more functionality than
     * either {@link #sendEmail(Collection, MailTemplate, Map)} or {@link #sendEmail(String, MailTemplate, Map)}
     *
     * Note if the body is provided in the {@link com.client.core.email.model.MailInfo} it will be overwritten by the result of rendering the {@link MailTemplate}.
     * Similarly if the subject is provided in the {@link com.client.core.email.model.MailInfo} it will be overwritten by the subject in the {@link MailTemplate}
     *
     * @param mailInfo the object containing all the information about the email to be sent
     * @param mailTemplate the email template to be rendered into the body for the email
     * @param parameters the parameters to inject into the email template to be rendered
     *
     * @throws MessagingException when the email is malformed or SMTP setup is not correct.
     */
    void sendEmail(MailTemplateInfo mailInfo, MailTemplate mailTemplate, Map<String, Object> parameters) throws MessagingException;

}
