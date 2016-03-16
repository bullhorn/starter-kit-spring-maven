package com.client.core.email.model;


import java.io.Serializable;
import java.util.Collection;

import org.springframework.http.MediaType;

/**
 * <p>
 *     Object used to represent information required to send an email.  Can be passed to the
 *     {@link com.client.core.email.service.Emailer} to specify more than the typical amount of
 *     information required for an email (i.e. attachments, cc, bcc).
 * </p>
 * <p>
 *     Can also be used to override which email address emails are being sent from.  Providing a sender/senderName
 *     in this object will override the application-wide from email settings.
 * </p>
 */
public class MailInfo implements Serializable {

    private String sender;
    private String senderName;

    private String body;
    private String subject;
    private String replyTo;

    private Collection<String> to;
    private Collection<String> cc;
    private Collection<String> bcc;

    private Collection<MailAttachment> attachments;
    
    private String mimeType;

    public MailInfo(){
    	this.mimeType = MediaType.TEXT_HTML.getType();
    }

    /**
     * <p>
     *     Returns the email address of the user sending the email.  Is optional
     *     when used in conjunction with {@link com.client.core.email.service.Emailer#sendEmail(MailInfo)},
     *     if provided will override the sender from {@link com.client.core.email.MailSettings}
     * </p>
     *
     * @return email address of the user sending the email
     */
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }


    /**
     * <p>
     *     Returns the name of the user sending the email.  Is optional
     *     when used in conjunction with {@link com.client.core.email.service.Emailer#sendEmail(MailInfo)},
     *     if provided will override the sender from {@link com.client.core.email.MailSettings}
     * </p>
     *
     * @return name of the user sending the email
     */
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * Optional collection of {@link MailAttachment}s to be sent with the email.
     *
     * @return the collection of attachments
     */
    public Collection<MailAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(Collection<MailAttachment> attachments) {
        this.attachments = attachments;
    }

    /**
     * Optional collection of email addresses to send as blind carbon copy recipients
     *
     * @return the collection of bcc email addresses
     */
    public Collection<String> getBcc() {
        return bcc;
    }

    public void setBcc(Collection<String> bcc) {
        this.bcc = bcc;
    }

    /**
     * Returns the content of the body of the email address to be sent.  Can be plain text or HTML.  Use {@link #setMimeType(String)}
     * to specify what kind of content it is.
     *
     * @return
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Optional collection of email addresses to send as carbon copy recipients
     *
     * @return the collection of cc email addresses
     */
    public Collection<String> getCc() {
        return cc;
    }

    public void setCc(Collection<String> cc) {
        this.cc = cc;
    }

    /**
     * Returns the {@link String} representation of the mime type being used for the body of the email to be sent.  Defaults to HTML.
     *
     * @return the mime type of the email body.
     */
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * Returns the optional reply to email address for the email to be sent
     *
     * @return the email address of the reply to user on the email
     */
    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    /**
     * Returns the subject line for the email to be sent
     *
     * @return the subject of the email
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Returns the collection of email addresses to which the email is to be sent
     *
     * @return the collection of addresses the email will be sent to
     */
    public Collection<String> getTo() {
        return to;
    }

    public void setTo(Collection<String> to) {
        this.to = to;
    }
}