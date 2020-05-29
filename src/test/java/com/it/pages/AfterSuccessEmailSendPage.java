package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterSuccessEmailSendPage extends BasePage {

    @FindBy(xpath = "//div[@class='block_confirmation']/div[last()]")
    private WebElement msgConfirmSend;

    @FindBy(xpath="//li[1][@class='new']/a")
    private WebElement hrefIncominMail;

    public String getmsgConfirmSend() {
        return msgConfirmSend.getText();
    }

    public void hrefClickIncominMail() {
        hrefIncominMail.click();
    }

}
