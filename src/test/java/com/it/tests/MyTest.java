package com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    //@Test
    public void test1() {
        // System.out.println(UserFactory.getRandomUsers(10));
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getLBUserEmail(), validUser.email);
    }

    @Test
    public void newMail() {
        //System.out.println(MailFactory.getRandomMails(10));
        test1();
        app.main.hrefClickCreateMail();
        app.newEmail.createMail(validEmail.whomEmail, validEmail.Subject, validEmail.emailBody);
        Assert.assertEquals(app.afterSuccessEmailSend.getmsgConfirmSend(), "Письмо успешно отправлено адресатам");
        app.afterSuccessEmailSend.hrefClickIncominMail();
        app.incomingList.hrefClickLastComingMail();
        Assert.assertEquals(app.lastIncomingEmail.getSenderEmail(), validUser.email);
        Assert.assertEquals(app.lastIncomingEmail.getRecipientEmail(), validEmail.whomEmail);
        Assert.assertEquals(app.lastIncomingEmail.getMailSubject(), validEmail.Subject);
        Assert.assertTrue(app.lastIncomingEmail.mailBody(validEmail.emailBody));

    }


}
