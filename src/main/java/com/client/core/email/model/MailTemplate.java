package com.client.core.email.model;

public class MailTemplate {

    private final String fileName;

    private String subject;

    private MailTemplate(String fileName, String subject) {
        this.fileName = fileName;
        this.subject = subject;
    }

    public MailTemplate(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public String getSubject() {
        return subject;
    }

    public MailTemplate withSubject(String subject) {
        return new MailTemplate(this.fileName, subject);
    }

    @Override
    public String toString() {
        return new StringBuilder("MailTemplate {")
                .append("\n\t\"fileName\": ")
                .append("'")
                .append(fileName).append('\'')
                .append(",\n\t\"subject\": ")
                .append("'")
                .append(subject).append('\'')
                .append('}')
                .toString();
    }
}
