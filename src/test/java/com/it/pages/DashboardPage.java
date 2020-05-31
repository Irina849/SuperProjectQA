package com.it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement ldUserEmail;

    public String getLBUserEmail() {
//        WebDriverWait webDriverWait = new WebDriverWait(driver,20);
//        WebElement element = webDriverWait.until(s-> s.findElement(By.xpath("//span[@class='sn_menu_title']")));
//        return element.getText();

        return ldUserEmail.getText();
    }


}
