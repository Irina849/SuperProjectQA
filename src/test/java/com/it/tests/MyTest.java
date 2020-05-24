package com.it.tests;

import com.it.helpers.CommonHelper;
import com.it.helpers.LoginHelper;
import com.it.pages.DashboardPage;
import com.it.users.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void test1() {
        System.out.println(UserFactory.getRandomUsers(10));
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getLBUserEmail(), validUser.email);
    }


}
