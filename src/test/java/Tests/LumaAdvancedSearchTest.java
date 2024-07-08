package Tests;

import HelperMethods.ElementMethods;
import Pages.HomePageLuma;
import Pages.LumaAdvancedSearchPage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LumaAdvancedSearchTest extends SharedData {

    @Test
    public void LumaCreateAnAccount() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        HomePageLuma homePageLuma = new HomePageLuma(getWebDriver());
        homePageLuma.navidateToHomePageLuma();

        LumaAdvancedSearchPage lumaAdvancedSearchPage = new LumaAdvancedSearchPage(getWebDriver());
        lumaAdvancedSearchPage.navigateToAdvancedSearch();

        String productNameValue="Bags";
        String skuValue="24-UB02";
        String descriptionValue="Impulse";
        String shortDescriptionValue="Dual carry handles";
        String priceFromValue = "10";
        String priceToValue = "50";

        lumaAdvancedSearchPage.fillProductNameField(productNameValue);
        lumaAdvancedSearchPage.fillSkuField(skuValue);
        lumaAdvancedSearchPage.fillDescriptionField(descriptionValue);
        lumaAdvancedSearchPage.fillShortDescriptionField(shortDescriptionValue);
        lumaAdvancedSearchPage.fillPriceFromField(priceFromValue);
        lumaAdvancedSearchPage.fillPriceToField(priceToValue);
        lumaAdvancedSearchPage.PressSearchButton();



    }
}
