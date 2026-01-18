package testClasses;

import org.example.PageClasses.HomePage;
import org.example.PageClasses.SignInPage;
import org.example.testBase.NewWebBasedClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends NewWebBasedClass {
    HomePage homePage;
    SignInPage signInPage;

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        signInPage= new SignInPage();
    }
    public SignInTest(){
        super();
    }

    @Test(description = "verify signup text is clickable")
    public void verifySignUpText(){
        homePage.setSignInButton();
        signInPage.setSignUpText();
    }


}
