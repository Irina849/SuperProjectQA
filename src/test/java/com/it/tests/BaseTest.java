package com.it.tests;

import com.it.App;
import com.it.mail.Email;
import com.it.mail.EmailFactory;
import com.it.users.User;
import com.it.users.UserFactory;

import org.testng.annotations.*;

public class BaseTest {
    protected App app = new App();
    protected User validUser = UserFactory.getValidUser();
    protected Email validEmail = EmailFactory.getValidMail();


    @BeforeSuite
    public void beforeSuite() {

    }


    @AfterSuite
    public void afterSuite() {
        app.common.appStop();
    }



}
