package org.example.UtilityClasses;


import org.example.testBase.NewWebBasedClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtil extends NewWebBasedClass {
    public static Actions actions;

    public static void moveToTheElement(WebElement element){
        actions = new Actions(driver);
        actions.moveToElement(element)
                .perform();
    }

    public static void dragAndDropToTheElement(WebElement srcElement,WebElement descElement){
        actions = new Actions(driver);
        actions.dragAndDrop(srcElement,descElement)
                .perform();

    }
}
