package com.client.core.email.service;

import com.client.core.email.model.MailInfo;

import javax.mail.MessagingException;
import java.util.Collection;

/**
 * Interface used to send email messages.
 */
public interface Emailer {

    /**
     * Sends an email to a single email address, using the sender from {@link com.client.core.email.MailSettings}
     *
     * @param subject the subject of the email to be sent
     * @param mailTo the email address to which we want to send the email
     * @param message the content/body of the email to be sent
     *
     * @throws MessagingException when the email is malformed or SMTP setup is not correct.
     */
	void sendEmail(String subject, String mailTo, String message) throws MessagingException;

    /**
     * Sends an email to a collection of email addresses, using the sender from {@link com.client.core.email.MailSettings}
     *
     * @param subject the subject of the email to be sent
     * @param mailTo the email addresses to which we want to send the email
     * @param message the content/body of the email to be sent
     *
     * @throws MessagingException when the email is malformed or SMTP setup is not correct.
     */
	void sendEmail(String subject, Collection<String> mailTo, String message) throws MessagingException;

    /**
     * Sends an email to the email addresses provided in the {@link MailInfo}, using the sender from the passed in {@link MailInfo},
     * or if not provided, the one in {@link com.client.core.email.MailSettings}.  Provides much more functionality than
     * either {@link #sendEmail(String, Collection, String)} or {@link #sendEmail(String, String, String)}
     *
     * @param mailInfo the object containing all the information about the email to be sent
     *
     * @throws MessagingException when the email is malformed or SMTP setup is not correct.
     */
    void sendEmail(MailInfo mailInfo) throws MessagingException;

}
