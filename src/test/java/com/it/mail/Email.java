package com.it.mail;

public class Email {
    public String whomEmail;
    public String Subject;
    public String emailBody;

    public Email(String whomEmail, String subject, String emailBody) {
        this.whomEmail = whomEmail;
        this.Subject = subject;
        this.emailBody = emailBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (whomEmail != null ? !whomEmail.equals(email.whomEmail) : email.whomEmail != null) return false;
        if (Subject != null ? !Subject.equals(email.Subject) : email.Subject != null) return false;
        return emailBody != null ? emailBody.equals(email.emailBody) : email.emailBody == null;
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
