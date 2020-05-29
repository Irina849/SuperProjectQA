package com.it.helpers;

import com.it.pages.LastIcomingEmailPage;

public class LastIncomingEmailHelper extends LastIcomingEmailPage {

    public boolean mailBody(String mail){
        return mailBody.getText().contains(mail);
    }
}
