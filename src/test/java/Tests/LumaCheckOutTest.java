package Tests;

import HelperMethods.ElementMethods;
import Pages.*;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class LumaCheckOutTest extends SharedData {
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

        LumaWhatsNewPage lumaWhatsNewPage = new LumaWhatsNewPage(getWebDriver());
        lumaWhatsNewPage.clickWhatsNewButton();
        lumaWhatsNewPage.clickHoodiesButton();
        lumaWhatsNewPage.clickSizeButton();
        lumaWhatsNewPage.clickSizeSButton();
        lumaWhatsNewPage.clickColorButton();
        lumaWhatsNewPage.clickBlueButton();
        lumaWhatsNewPage.clickHoodieMarcoButton();
        lumaWhatsNewPage.clickHoodieMarcoSizeSButton();
        lumaWhatsNewPage.clickHoodieMarcoColorBlueButton();
        lumaWhatsNewPage.clickAddToCartButton();

        LumaCheckOutPage lumaCheckOutPage =new LumaCheckOutPage(getWebDriver());
        lumaCheckOutPage.clickCartButton();
        lumaCheckOutPage.clickCheckOutButton();

    }

}
