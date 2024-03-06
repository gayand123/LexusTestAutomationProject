package com.lexus.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    public static WebDriver driver;  // initialize the  driver

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
        //create web driver object
        driver = new ChromeDriver();
        // maximizing the window
        driver.manage().window().maximize();
        driver.get(DomainConstants.BASE_URL);

    }

    @AfterSuite
    public void afterSuite() {
        //driver.close();
    }

    public void clearAndType(WebElement txtElement, String inputText) {
        try {
            txtElement.clear();
            txtElement.sendKeys(inputText);
        } catch (Exception e) {

        }
    }

    public void click(WebElement webElement) {
        try {
            webElement.click();
        } catch (Exception E) {

        }
    }

    public String getElementsName(WebElement wb) {
        return wb.getText();
    }

    public String getAttributeValue(WebElement element, String attributevalue) {
        String attibutevalue = element.getAttribute(attributevalue);
        return attibutevalue;
    }

    public static void selectByVisibleText (WebElement dropdown, String visibleText) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(visibleText);
    }

}
