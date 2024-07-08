package Tests;

import HelperMethods.ElementMethods;
import Pages.HomePageLuma;
import Pages.LumaCreateAnAccountPage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LumaCreateAnAccountTest extends SharedData {

    @Test
    public void LumaCreateAnAccount(){
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        HomePageLuma homePageLuma = new HomePageLuma(getWebDriver());
        homePageLuma.navidateToHomePageLuma();

        LumaCreateAnAccountPage lumaCreateAnAccountPage = new LumaCreateAnAccountPage(getWebDriver());
        lumaCreateAnAccountPage.clickCreateAccountButton();
        lumaCreateAnAccountPage.clickStickyBoxHide2();

        String firstNameValue = "Voicu";
        String lastNameValue = "Cristian Valentin";
        String emailValue = "voicucristianvalentin1993@gmail.com";
        String passwordValue =  "Parola23!";
        String confirmPasswordValue =  "Parola23!";

        lumaCreateAnAccountPage.fillFirstNameField(firstNameValue);
        lumaCreateAnAccountPage.fillLastNameField(lastNameValue);
        lumaCreateAnAccountPage.fillEmailField(emailValue);
        lumaCreateAnAccountPage.fillPasswordField(passwordValue);
        lumaCreateAnAccountPage.fillConfirmPasswordField(confirmPasswordValue);
        lumaCreateAnAccountPage.clickSubmitButtonField();

    }
}
