package com.it.helpers;

import com.it.pages.LoginPage;
import com.it.users.User;
import io.qameta.allure.Step;

public class LoginHelper extends LoginPage {

    public void login(String login, String password) {
        setInputLogin(login);
        setInputPassword(password);
        btnClickLogin();
    }
    @Step("login user name - {user.userName}, password - {user.password}")
    public void login(User user) {
        log.info(String.format("login user name - %s , password - %s .", user.userName, user.password));

        login(user.userName, user.password);
    }
}
