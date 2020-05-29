package com.it.mail;

public class Mail {
    public String whomEmail;
    public String Subject;
    public String emailBody;

    public Mail(String whomEmail, String subject, String emailBody) {
        this.whomEmail = whomEmail;
        this.Subject = subject;
        this.emailBody = emailBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mail mail = (Mail) o;

        if (whomEmail != null ? !whomEmail.equals(mail.whomEmail) : mail.whomEmail != null) return false;
        if (Subject != null ? !Subject.equals(mail.Subject) : mail.Subject != null) return false;
        return emailBody != null ? emailBody.equals(mail.emailBody) : mail.emailBody == null;
    }

    @Override
    public int hashCode() {
        int result = whomEmail != null ? whomEmail.hashCode() : 0;
        result = 31 * result + (Subject != null ? Subject.hashCode() : 0);
        result = 31 * result + (emailBody != null ? emailBody.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Email{" +
                "whomEmail='" + whomEmail + '\'' +
                ", Subject='" + Subject + '\'' +
                ", mailBody='" + emailBody + '\'' +
                '}';
    }
}
