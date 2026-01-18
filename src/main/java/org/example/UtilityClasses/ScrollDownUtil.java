package org.example.UtilityClasses;


import org.example.testBase.NewWebBasedClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class ScrollDownUtil extends NewWebBasedClass {

    public static JavascriptExecutor javascriptExecutor;

    public static void scrollDownPage(WebElement element) {
        javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments [0].scrollIntoView()", element);
    }
}
