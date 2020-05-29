package com.it.helpers;

import com.it.pages.CreateNewEmailPage;

public class CreateNewEmailHelper extends CreateNewEmailPage {

    public void createMail(String whom, String subject, String emailBody){
        setInputWhom(whom);
        setInputSubject(subject);
        setInputMailBody(emailBody);
        btnClickLSendAtop();
    }

}
