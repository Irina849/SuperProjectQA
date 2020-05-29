package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//p[@class='make_message']/a")
    private WebElement hrefCreateMail;

    public void hrefClickCreateMail() {
        hrefCreateMail.click();
    }

}
