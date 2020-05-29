package com.it.tests;

import com.it.mail.MailFactory;
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
        app.newEmail.createMail(validMail.whomEmail, validMail.Subject, validMail.emailBody);
        Assert.assertEquals(app.afterSuccessEmailSend.getmsgConfirmSend(), "Письмо успешно отправлено адресатам");
        app.afterSuccessEmailSend.hrefClickIncominMail();
        app.incomingList.hrefClickLastComingMail();
        Assert.assertEquals(app.lastIncomingEmail.getSenderEmail(), validUser.email);
        Assert.assertEquals(app.lastIncomingEmail.getRecipientEmail(), validMail.whomEmail);
        Assert.assertEquals(app.lastIncomingEmail.getMailSubject(), validMail.Subject);
        Assert.assertTrue(app.lastIncomingEmail.mailBody(validMail.emailBody));

    }


}
