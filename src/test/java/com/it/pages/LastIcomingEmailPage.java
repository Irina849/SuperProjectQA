package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LastIcomingEmailPage extends BasePage {

	@FindBy(xpath="//div[@class = 'from']/div[@class = 'field_value']/a")
	private WebElement senderEmail;

	@FindBy(xpath="//div[@class = 'to']/div[@class = 'field_value']")
	private WebElement recipientEmail;

	@FindBy(xpath="//div[@class = 'message_header clear']/h3")
	private WebElement mailSubject;

	@FindBy(xpath="//div[@class = 'message_body']/pre")
	protected WebElement mailBody;


	public String getSenderEmail() {
		return senderEmail.getText();
	}

	public String getRecipientEmail() {
		return recipientEmail.getText();
	}

	public String getMailSubject() {
		return mailSubject.getText();
	}
	public String getMailBody() {
		return mailBody.getText();
	}

}
