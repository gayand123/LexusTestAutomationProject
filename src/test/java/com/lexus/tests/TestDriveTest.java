package com.lexus.tests;

import com.lexus.pages.TestDrivePage;
import com.lexus.util.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDriveTest extends TestBase {

    @Test
    public void validateSubmitButtonEnableAfterEnteringDataInTestDrive() throws InterruptedException {
        TestDrivePage testDrivePage = PageFactory.initElements(driver, TestDrivePage.class);
        testDrivePage.acceptCookies();
        testDrivePage.enterCustomerFirstName("CPL");
        testDrivePage.enterCustomerLastName("Test");
        testDrivePage.enterCustomerEmailAddress("qa@convertium.com");
        testDrivePage.selectCountryCode();
        testDrivePage.enterCustomerPhoneNumber("91234567");
        testDrivePage.enterPreferredDate("January"); //10th of Current month
        testDrivePage.selectPreferredTime();
        testDrivePage.enterNumberOfPax();
        Assert.assertEquals(testDrivePage.getPreferredModels(), "UX 300e");
        testDrivePage.selectTestDriveOptions();
        testDrivePage.clickDrivingLicenceAgreement();
        testDrivePage.clickLiabilitiesAgreement();
        testDrivePage.clickTermsAndService();
        testDrivePage.clickMarketingConsent();
        Assert.assertEquals(testDrivePage.getAttributeValue(), true);
    }
}
