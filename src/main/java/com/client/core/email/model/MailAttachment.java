package com.client.core.email.model;

import javax.activation.FileDataSource;

/**
 * Object used to represent an attachment on an email message
 */
public class MailAttachment {

	private String location;
	private String contentTypeText;
	private String fileName;

    /**
     * Returns the location of the file to be attached to the email.  Will be passed to {@link FileDataSource#FileDataSource(String)}
     * to retrieve the binary data for the file
     *
     * @return the location of the file to be attached to the email
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Returns the content type of the file to be attached to the email.  Will be used as the contentType
     * in {@link FileDataSource#getContentType()}
     *
     * @return the content type of the file to be attached to the email
     */
    public String getContentTypeText() {
        return contentTypeText;
    }

    public void setContentTypeText(String contentTypeText) {
        this.contentTypeText = contentTypeText;
    }

    /**
     * Returns the name of the file to be attached to the email.  Is passed to the {@link javax.mail.internet.MimeBodyPart} for the
     * attachment for this file.
     *
     * @return the name of the file to be attached to the email
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
