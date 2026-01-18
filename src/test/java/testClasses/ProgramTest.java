package testClasses;

import org.example.PageClasses.HomePage;
import org.example.PageClasses.ProgramPage;
import org.example.testBase.NewWebBasedClass;
import org.testng.annotations.BeforeMethod;

public class ProgramTest extends NewWebBasedClass {
    HomePage homePage;
    ProgramPage programPage;

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage= new HomePage();
        programPage = new ProgramPage();
    }
    public ProgramTest(){
        super();
    }
}
