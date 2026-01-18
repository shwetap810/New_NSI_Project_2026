package org.example.UtilityClasses;


import org.example.testBase.NewWebBasedClass;
import org.openqa.selenium.WebElement;

public class WebElementUtil extends NewWebBasedClass
{
    public static void sendKeyToElement(WebElement element,String text){
        element.sendKeys(text);
    }
    public  static void clickOnElement(WebElement element){
        element.click();


    }
    public static String getTextElement(WebElement element){
        return element.getText();
    }

    public static boolean getElementDisplayed(WebElement element){
        return element.isDisplayed();
    }


   }



