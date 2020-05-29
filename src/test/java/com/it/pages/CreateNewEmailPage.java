package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewEmailPage extends BasePage {

    @FindBy(xpath = "//textarea[@name='to']")
    private WebElement inputWhom;

    @FindBy(xpath = "//input[@tabindex='5']")
    private WebElement inputSubject;

    @FindBy(xpath = "//textarea[@id='text']")
    private WebElement inputMailBody;

    @FindBy(xpath = "//p[@class='send_container']/input[@name='send']")
    private WebElement btnSendAtop;

    protected void setInputWhom(String whom) { inputWhom.sendKeys(whom); }

    protected void setInputSubject(String subject) {
        inputSubject.sendKeys(subject);
    }

    protected void setInputMailBody(String mailBody) { inputMailBody.sendKeys(mailBody); }

    protected void btnClickLSendAtop() { btnSendAtop.click(); }





}
