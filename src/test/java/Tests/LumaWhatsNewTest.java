package Tests;

import HelperMethods.ElementMethods;
import Pages.HomePageLuma;
import Pages.LumaWhatsNewPage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LumaWhatsNewTest extends SharedData {
    @Test
    public void WhatsNew() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        HomePageLuma homePageLuma = new HomePageLuma(getWebDriver());
        homePageLuma.navidateToHomePageLuma();

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
    }
}
