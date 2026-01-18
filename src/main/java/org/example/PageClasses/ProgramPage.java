package org.example.PageClasses;

import org.example.UtilityClasses.WebElementUtil;
import org.example.testBase.NewWebBasedClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramPage extends NewWebBasedClass {
    @FindBy(xpath = "//span[text()='Master In-Demand Skills.']")
    WebElement successLandingText;

    public ProgramPage(){
        PageFactory.initElements(driver,this);
    }

    public boolean setSuccessLandingText(){
        WebElementUtil.getElementDisplayed(successLandingText);
        return true;
    }
}

