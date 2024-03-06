package com.lexus.util;

public class Elements {
    //Add xpath elements locations of the Book Test Drive Page
    public static final String btnAcceptCookies = "//*[@id='consent_prompt_submit']/span";
    public static final String textFirstName = "//input[@id='input_first_name']";
    public static final String textLastName = "//input[@id='input_last_name']";
    public static final String txtEmailAddress = "//input[@id='input_email_address']";
    public static final String drpCountryCode = "//div[@class='iti__selected-dial-code']";
    public static final String singaporeCountryCode = "//*[@id='iti-0__item-sg']/span[2]";
    public static final String txtPhoneNumber = "//input[@id='input_phone_number']";
    public static final String calendarPreferredDate = "//input[@id='datepicker_preferred_date']";
    public static final String year2025 = "//span[@class='arrowUp']";
    public static final String monthInCalender = "//select[@class='flatpickr-monthDropdown-months']";
    public static final String DateInCalender = "//div[@class='dayContainer']/span[12]"; //10th day in a Calendar
    public static final String drpPreferredTime = "//div/label[@for='select_preferred_time']";
    public static final String preferredTime18 = "//*[@id='choices--select_preferred_time-item-choice-11']";
    public static final String drpPreferredSalesConsultant = "//div[@class='choices__item choices__placeholder choices__item--selectable' and @data-value='Preferred sales consultant (optional)']";
    public static final String drpNumberOfPax = "//*[@id='wrapper']/main/article/section/section/div/form/div[8]/div/div[1]/div[1]/div/div";
    public static final String numberOfPax01 = "//*[@id='choices--select_pax-item-choice-2']"; //One in number of Pax dropdown
    public static final String drpPreferredModels = "//div[@class='choices__item choices__item--selectable' and @data-value='UX 300e']";
    public static final String drpTestDriveOptions = "//*[@id='wrapper']/main/article/section/section/div/form/div[10]/div/div[1]/div[1]/div/div";
    public static final String testDrive3RDOption = "//*[@id='choices--select_test_drive_option-item-choice-4']";
    public static final String checkBoxDrivingLicenceAgreement = "//input[@id='checkbox_driving_license']";
    public static final String checkBoxLiabilitiesAgreement = "//input[@id='checkbox_terms_conditions']";
    public static final String checkboxPrivacyPolicyAgreement = "//input[@id='checkbox_privacy_policy']";
    public static final String checkboxMarketingAgreement = "//input[@id='checkbox_marketing']";
    public static final String btnSubmit = "//button[@type='submit']";

}
