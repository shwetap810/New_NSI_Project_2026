package org.example.PageClasses;

import org.example.UtilityClasses.CommonWaits;
import org.example.UtilityClasses.WebElementUtil;
import org.example.testBase.NewWebBasedClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends NewWebBasedClass {
    @FindBy(className = "text-sm")
    WebElement signUpText;

    @FindBy(name="email")
    WebElement emailTextBox;

    public SignInPage(){
        PageFactory.initElements(driver,this);
    }
    public void setSignUpText(){
        CommonWaits.waitUntilElementToBeClickable(signUpText);
    }
    public void setEmailTextBox(String email_id){
        WebElementUtil.sendKeyToElement(emailTextBox,email_id);


    }

}


