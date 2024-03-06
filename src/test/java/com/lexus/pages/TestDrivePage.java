package com.lexus.pages;

import com.lexus.util.Elements;
import com.lexus.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TestDrivePage extends TestBase {

    @FindBy(xpath = Elements.btnAcceptCookies)
    public WebElement btnAcceptCookies;
    @FindBy(xpath = Elements.textFirstName)
    public WebElement textFirstName;

    @FindBy(xpath = Elements.textLastName)
    public WebElement textLastName;

    @FindBy(xpath = Elements.txtEmailAddress)
    public WebElement txtEmailAddress;
    @FindBy(xpath = Elements.drpCountryCode)
    public WebElement drpCountryCode;

    @FindBy(xpath = Elements.txtPhoneNumber)
    public WebElement txtPhoneNumber;
    @FindBy(xpath = Elements.calendarPreferredDate)
    public WebElement calendarPreferredDate;

    @FindBy(xpath = Elements.year2025)
    public WebElement year2025;
    @FindBy(xpath = Elements.monthInCalender)
    public WebElement monthInCalender;
    @FindBy(xpath = Elements.DateInCalender)
    public WebElement DateInCalender;
    @FindBy(xpath = Elements.drpPreferredTime)
    public WebElement drpPreferredTime;
    @FindBy(xpath = Elements.preferredTime18)
    public WebElement preferredTime18;
    @FindBy(xpath = Elements.drpPreferredSalesConsultant)
    public WebElement drpPreferredSalesConsultant;
    @FindBy(xpath = Elements.drpNumberOfPax)
    public WebElement drpNumberOfPax;
    @FindBy(xpath = Elements.numberOfPax01)
    public WebElement numberOfPax01;
    @FindBy(xpath = Elements.drpPreferredModels)
    public WebElement drpPreferredModels;
    @FindBy(xpath = Elements.drpTestDriveOptions)
    public WebElement drpTestDriveOptions;
    @FindBy(xpath = Elements.testDrive3RDOption)
    public WebElement testDrive3RDOption;
    @FindBy(xpath = Elements.checkBoxDrivingLicenceAgreement)
    public WebElement checkBoxDrivingLicenceAgreement;
    @FindBy(xpath = Elements.checkBoxLiabilitiesAgreement)
    public WebElement checkBoxLiabilitiesAgreement;

    @FindBy(xpath = Elements.checkboxPrivacyPolicyAgreement)
    public WebElement checkboxPrivacyPolicyAgreement;
    @FindBy(xpath = Elements.checkboxMarketingAgreement)
    public WebElement checkboxMarketingAgreement;
    @FindBy(xpath = Elements.btnSubmit)
    public WebElement btnSubmit;

    //click Cookies
    public void acceptCookies() {
        click(btnAcceptCookies);
    }

    // Enter customer First Name
    public void enterCustomerFirstName(String customerFirstName) {
        clearAndType(textFirstName, customerFirstName);
    }

    // Enter customer Last Name
    public void enterCustomerLastName(String customerLastName) {
        clearAndType(textLastName, customerLastName);
    }

    // Enter customer Email Address
    public void enterCustomerEmailAddress(String customerEmailAddress) {
        clearAndType(txtEmailAddress, customerEmailAddress);
    }

    //select Country Code
    public void selectCountryCode() throws InterruptedException {
        click(drpCountryCode);
        List<WebElement> options = driver.findElements(By.xpath(Elements.singaporeCountryCode));
        for (WebElement option : options) {
            // Perform actions on each option
            option.click(); // Click on the option
        }
    }

    //Enter customer Phone Number
    public void enterCustomerPhoneNumber(String customerPhoneNumber) {
        clearAndType(txtPhoneNumber, customerPhoneNumber);
    }

    //Enter customer preferred date
    public void enterPreferredDate(String preferredMonth) {
        calendarPreferredDate.click();
        year2025.click();
        monthInCalender.click();
        selectByVisibleText(monthInCalender, preferredMonth);
        //click 10th of month
        DateInCalender.click();
    }

    //Enter customer preferred time
    public void selectPreferredTime() {
        drpPreferredTime.click();
        preferredTime18.click();
    }

    public void enterNumberOfPax() {
        drpNumberOfPax.click();
        numberOfPax01.click();
    }


    public String getPreferredModels() {
        String getText = getElementsName(drpPreferredModels);
        String updatedText = getText.substring(0, 7);
        System.out.println("text " + updatedText);
        return updatedText;
    }

    public void selectTestDriveOptions() {
        drpTestDriveOptions.click();
        testDrive3RDOption.click();
    }
    public void clickDrivingLicenceAgreement() {
        click(checkBoxDrivingLicenceAgreement);
    }
    public void clickLiabilitiesAgreement() {
        click(checkBoxLiabilitiesAgreement);
    }

    public void clickTermsAndService() {
        click(checkboxPrivacyPolicyAgreement);
    }

    public void clickMarketingConsent() {
        click(checkboxMarketingAgreement);
    }

    public boolean getAttributeValue() {
        boolean returnValue= false;
        String getText = getAttributeValue(btnSubmit, "class");
        System.out.println("getText =="+getText);
       if(getText.contains("mdc-button mdc-button--unelevated cta__dialog_form")){
           returnValue = true;
       }
        return returnValue;
    }
}
