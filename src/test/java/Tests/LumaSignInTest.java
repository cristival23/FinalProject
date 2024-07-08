package Tests;

import HelperMethods.ElementMethods;
import Pages.HomePageLuma;
import Pages.LumaSignInPage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LumaSignInTest extends SharedData {

    @Test
    public void LumaSignIn() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        HomePageLuma homePageLuma = new HomePageLuma(getWebDriver());
        homePageLuma.navidateToHomePageLuma();


        LumaSignInPage lumaSignInPage = new LumaSignInPage(getWebDriver());
        lumaSignInPage.clickSignInButton();

        String emailValue = "voicucristianvalentin1993@gmail.com";
        String passwordValue = "Parola23!";

        lumaSignInPage.fillEmailField(emailValue);
        lumaSignInPage.fillPasswordField(passwordValue);
        lumaSignInPage.clickSingInButtonField();

    }
}
