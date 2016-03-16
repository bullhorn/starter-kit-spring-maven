package com.client.core.email;

import com.google.common.base.Objects;

/**
 * Object used to represent settings used for emailing.  Values should be provided via a properties file and injected
 * using a Spring {@link org.springframework.beans.factory.config.PropertyPlaceholderConfigurer}, either in
 * applicationContext.xml or using {@link org.springframework.beans.factory.annotation.Value} annotations
 *
 * @author johnsully83
 */
public class MailSettings {
    private String host;
    private String port;
    private String username;
    private String password;

    private String sender;
    private String senderName;

    /**
     * Returns the SMTP host used for email authentication
     *
     * @return the SMTP host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Returns the SMTP password used for email authentication
     *
     * @return the SMTP password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the SMTP port used for email authentication
     *
     * @return the SMTP port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    /**
     * Returns the email address used as the sender for all emails
     *
     * @return the sending user's email address
     */
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Returns the name of the sender used for all emails
     *
     * @return the sending user's name
     */
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * Returns the SMTP username used for email authentication
     *
     * @return the SMTP username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MailSettings)) return false;

        MailSettings that = (MailSettings) o;

        if (host != null ? !host.equals(that.host) : that.host != null) return false;
        if (port != null ? !port.equals(that.port) : that.port != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (sender != null ? !sender.equals(that.sender) : that.sender != null) return false;
        return !(senderName != null ? !senderName.equals(that.senderName) : that.senderName != null);

    }

    @Override
    public int hashCode() {
        int result = host != null ? host.hashCode() : 0;
        result = 31 * result + (port != null ? port.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (sender != null ? sender.hashCode() : 0);
        result = 31 * result + (senderName != null ? senderName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("host", host)
                .add("port", port)
                .add("username", username)
                .add("password", password)
                .add("sender", sender)
                .add("senderName", senderName)
                .toString();
    }

}
