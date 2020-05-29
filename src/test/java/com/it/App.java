package com.it;

import com.it.helpers.*;


public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashboardHelper dashboard;
    public CreateNewEmailHelper newEmail;
    public MainPageHelper main;
    public AfterSuccessEmailSendHelper afterSuccessEmailSend;
    public IncomingEmailListHelper incomingList;
    public LastIncomingEmailHelper lastIncomingEmail;

    public App() {
        common = new CommonHelper();
        login = new LoginHelper();
        dashboard = new DashboardHelper();
        newEmail = new CreateNewEmailHelper();
        main = new MainPageHelper();
        afterSuccessEmailSend = new AfterSuccessEmailSendHelper();
        incomingList = new IncomingEmailListHelper();
        lastIncomingEmail = new LastIncomingEmailHelper();
    }
}
