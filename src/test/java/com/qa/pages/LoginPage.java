package com.qa.pages;

import appiumPackage.CreateDriverSession;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BasePage{
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup")
     private MobileElement rightSwipe1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[2]/android.view.ViewGroup")
    private MobileElement rightSwipe2;

    @AndroidFindBy(xpath = "//*[@text='GET STARTED']")
    private MobileElement getStartedButton;

    @AndroidFindBy(xpath = "//*[@text='Enter Phone Number']")
    private MobileElement phoneNumber;

    @AndroidFindBy(xpath = "//*[@text='CONTINUE']")
    private MobileElement continueButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[4]")
    private MobileElement enterValidNumberError;

    @AndroidFindBy(xpath = "//*[@text='Submit']")
    private MobileElement submitButton;

    @AndroidFindBy(xpath = "//*[@text='While using the app']")
    private MobileElement whileUsingAppPermission;

    @AndroidFindBy(xpath = "//*[@text='Allow']")
    private MobileElement allowPermission;

    @AndroidFindBy(xpath = "//*[@text='OK']")
    private MobileElement okSecurityAlert;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"IPVOTP\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]")
    private MobileElement getOTPText;

    @AndroidFindBy(accessibility = "OTPinput")
    private MobileElement setOtp;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"IPVOTP\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
    private MobileElement setOtp1;


    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"IPVOTP\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
    private MobileElement setOtp2;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"IPVOTP\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]")
    private MobileElement setOtp3;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"IPVOTP\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[4]")
    private MobileElement setOtp4;


    @AndroidFindBy(xpath = "//*[@text='Invalid OTP']")
    private MobileElement invalidOTP;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Name\"]")
    private MobileElement newUserName;

    @AndroidFindBy(xpath = "//android.widget.Switch[@content-desc=\"Switch\"]")
    private MobileElement referralCode;


    public LoginPage() {

    }

    public LoginPage getStarted(String phNumber){
        click(rightSwipe1,"Left swipe 1 ");
        click(rightSwipe2,"Left swipe 2");
        clickIfExist(getStartedButton);
        return this;
    }
    public LoginPage enterPhoneNumber(String phNumber){
        sendKeys(phoneNumber,phNumber,"Enter mobile number"+phNumber);
        return this;
    }
    public LoginPage clickContinue() {
        click(continueButton, "Click continue button");
        return this;
    }
    public LoginPage enterOtp(){
        waitForVisibility(getOTPText);
        String str = getOTPText.getText();
       String otp = str.split("s ")[1];
        sendKeys(setOtp1, String.valueOf(otp.charAt(0)));
        sendKeys(setOtp2, String.valueOf(otp.charAt(1)));
        sendKeys(setOtp3, String.valueOf(otp.charAt(2)));
        sendKeys(setOtp4, String.valueOf(otp.charAt(3)));
        return this;
    }

    public HomePage clickSubmit() {
        click(submitButton, "Click submit button");
        return new HomePage();
    }
    public HomePage allowPermission() {
//        click(whileUsingAppPermission);
        click(allowPermission);
        return new HomePage();
    }


}
