package com.client.core.email.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import com.client.core.email.MailSettings;
import com.client.core.email.model.MailAttachment;
import com.client.core.email.model.MailInfo;
import com.client.core.email.service.Emailer;
import com.google.common.collect.Lists;

/**
 * A standard implementation of {@link Emailer}, using JDK libraries in
 * {@link javax.mail}
 */
@Service
public class StandardEmailer implements Emailer {

    private final Logger log = LogManager.getLogger(StandardEmailer.class);

    private final MailSettings mailSettings;

    @Autowired
    public StandardEmailer(MailSettings mailSettings) {
        this.mailSettings = mailSettings;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void sendEmail(String subject, String mailTo, String message) throws MessagingException {
        sendEmail(subject, Lists.newArrayList(mailTo), message);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void sendEmail(String subject, Collection<String> mailTo, String message) throws MessagingException {
        MailInfo mailInfo = new MailInfo();
        mailInfo.setBody(message);
        mailInfo.setSubject(subject);
        mailInfo.setTo(mailTo);

        mailInfo.setSender(mailSettings.getSender());
        mailInfo.setSenderName(mailSettings.getSenderName());

        sendEmail(mailInfo);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void sendEmail(MailInfo mailInfo) throws MessagingException {
        send(mailInfo);
    }

    public void send(MailInfo mail) throws MessagingException {
        if(mailSettings.getDisabled()) {
            if(mailSettings.getRouteToWhenDisabled() != null && !mailSettings.getRouteToWhenDisabled().isEmpty()) {
                mail.setTo(mailSettings.getRouteToWhenDisabled());
                mail.setCc(Collections.emptyList());
                mail.setBcc(Collections.emptyList());
            } else {
                return;
            }
        }

        MimeMessage message = new MimeMessage(getSession());

        message.setSentDate(new Date());

        if(StringUtils.isEmpty(mail.getSender())) {
            mail.setSender(mailSettings.getSender());
        }

        if(StringUtils.isEmpty(mail.getSenderName())) {
            mail.setSenderName(mailSettings.getSenderName());
        }

        String sender = mail.getSender();
        String senderName = mail.getSenderName();

        if(StringUtils.isBlank(senderName)){
            message.setFrom(new InternetAddress(sender));
        } else{
            try {
                message.setFrom(new InternetAddress(sender, senderName));
            } catch (UnsupportedEncodingException e) {
                message.setFrom(new InternetAddress(sender));
            }
        }

        setRecipients(message, Message.RecipientType.TO, mail.getTo());
        setRecipients(message, Message.RecipientType.CC, mail.getCc());
        setRecipients(message, Message.RecipientType.BCC, mail.getBcc());

        message.setSubject(mail.getSubject());

        MimeBodyPart messageBodyPart = new MimeBodyPart();

        if (mail.getMimeType() == null || mail.getMimeType().equals(MediaType.TEXT_PLAIN_VALUE)) {
            messageBodyPart.setText(mail.getBody());
        } else {
            messageBodyPart.setContent(mail.getBody(), mail.getMimeType());
        }

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        message.setHeader("Content-Type", "text/html");

        setAttachments(multipart, mail.getAttachments());

        message.setContent(multipart);

        Transport.send(message);
    }


    private void setAttachments(Multipart multipart, Collection<MailAttachment> attachments) throws MessagingException {
        if (attachments == null || attachments.isEmpty()) {
            return;
        }

        for(final MailAttachment attachment : attachments){
            MimeBodyPart attachmentPart = new MimeBodyPart();

            FileDataSource fileDataSource = new FileDataSource(attachment.getLocation()) {
                @Override
                public String getContentType() {
                    return attachment.getContentTypeText();
                }
            };

            attachmentPart.setDataHandler(new DataHandler(fileDataSource));
            attachmentPart.setFileName(attachment.getFileName());

            multipart.addBodyPart(attachmentPart);
        }
    }

    private void setRecipients(Message message, Message.RecipientType type, Collection<String> addresses) throws MessagingException {
        if (addresses == null || addresses.isEmpty()) {
            return;
        }

        List<Address> recipients = Lists.newArrayList();

        for(String address : addresses){
            try {
                recipients.addAll(Arrays.asList(InternetAddress.parse(address, false)));
            } catch (AddressException e) {
                log.error("Error occurred parsing email address '" + address + "', not adding to recipients.");
            } catch (Exception e) {
                log.error("Unknown error occurred parsing email address '" + address + "', not adding to recipients.", e);
            }
        }

        message.addRecipients(type, recipients.toArray(new Address[recipients.size()]));
    }

    private Session getSession() {
        Authenticator authenticator = new Authenticator(mailSettings.getUsername(), mailSettings.getPassword());

        Properties properties = new Properties();
        properties.setProperty("mail.smtp.submitter", authenticator.getPasswordAuthentication().getUserName());
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.host", mailSettings.getHost());
        properties.setProperty("mail.smtp.port", mailSettings.getPort());

        properties.put("mail.smtp.socketFactory.port", mailSettings.getPort());
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "false");

        return Session.getInstance(properties, authenticator);
    }

    private class Authenticator extends javax.mail.Authenticator {
        private PasswordAuthentication authentication;

        public Authenticator(String username, String password) {
            this.authentication = new PasswordAuthentication(username, password);
        }

        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return authentication;
        }
    }

}
