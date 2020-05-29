package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncomingEmailListPage extends BasePage {


	@FindBy(xpath="//div[1][@class='row new']/a")
	private WebElement hrefLastComingMail;

    public void hrefClickLastComingMail() {
        hrefLastComingMail.click();
    }


}
