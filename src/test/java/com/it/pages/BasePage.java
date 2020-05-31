package com.it.pages;

import com.it.driver.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;
import static com.it.common.Constants.*;

public class BasePage {
    protected static MyDriver driver = MyDriver.getMyDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
    protected Logger log = Logger.getLogger(this.getClass().getCanonicalName());

}
