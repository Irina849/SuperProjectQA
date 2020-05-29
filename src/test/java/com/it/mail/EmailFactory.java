package com.it.mail;

import com.it.utils.QAUtils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmailFactory {
    private static ResourceBundle mail = ResourceBundle.getBundle("user");

    public static Email getValidMail(){
        return new Email(mail.getString("whomEmail"),
                mail.getString("Subject"),
                mail.getString("emailBody"));
    }

    public static List<Email> getRandomMails(int count) {
        return Stream.generate(
                () -> new Email(
                        QAUtils.getRandomString(10)+"@i.ua",
                        QAUtils.getRandomString(10),
                        QAUtils.getRandomString(20)
                )).limit(count)
                .collect(Collectors.toList());
    }
}
