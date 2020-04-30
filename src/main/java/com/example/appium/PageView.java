package com.example.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class PageView {
    AppiumDriver<MobileElement> driver;

    // TODO define textField MobileElement using @FindBy kind of annotations for iOS and Android

    public PageView(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getTextField() {
        // TODO return text from the textField element
        return "";
    }

    public PageView setTextField(String text) {
        // TODO set text to the textField element
        return this;
    }
}
