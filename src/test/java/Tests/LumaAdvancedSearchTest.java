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


//        elementMethods.scrollElementByPixel(0, 450);
//        WebElement lumaWebsiteHome = getWebDriver().findElement(By.xpath("//a[contains(text(), 'Luma – Magento eCommerce')]"));
//        elementMethods.waitVisibleElement(lumaWebsiteHome);
//        elementMethods.clickElement(lumaWebsiteHome);
//
//        WebElement stickyBoxHide = getWebDriver().findElement(By.className("ea-stickybox-hide"));
//        elementMethods.waitVisibleElement(stickyBoxHide);
//        elementMethods.clickElement(stickyBoxHide);

//        elementMethods.scrollElementByPixel(0, 2000);
//        WebElement advancedSearchLink = getWebDriver().findElement(By.xpath("(//a[@data-action='advanced-search'])[2]"));
//        elementMethods.waitVisibleElement(advancedSearchLink);
//        elementMethods.clickElement(advancedSearchLink);

//        WebElement productNameField = getWebDriver().findElement(By.id("name"));
//        elementMethods.waitVisibleElement(productNameField);
//        String productNameValue="Bags";
//        elementMethods.fillElement(productNameField, productNameValue);
//
//        WebElement skuField = getWebDriver().findElement(By.id("sku"));
//        elementMethods.waitVisibleElement(skuField);
//        String skuValue="24-UB02";
//        elementMethods.fillElement(skuField, skuValue);
//
//        WebElement descriptionField = getWebDriver().findElement(By.id("description"));
//        elementMethods.waitVisibleElement(descriptionField);
//        String descriptionValue="Impulse";
//        elementMethods.fillElement(descriptionField, descriptionValue);
//
//        WebElement shortDescriptionField = getWebDriver().findElement(By.id("short_description"));
//        elementMethods.waitVisibleElement(shortDescriptionField);
//        String shortDescriptionValue="Dual carry handles";
//        elementMethods.fillElement(shortDescriptionField, shortDescriptionValue);
//
//        WebElement priceFromField = getWebDriver().findElement(By.xpath("//input[@name='price[from]']"));
//        elementMethods.waitVisibleElement(priceFromField);
//        String priceFromValue = "10";
//        elementMethods.fillElement(priceFromField,priceFromValue);
//
//        WebElement priceToField = getWebDriver().findElement(By.xpath("//input[@name='price[to]']"));
//        elementMethods.waitVisibleElement(priceToField);
//        String priceToValue = "50";
//        elementMethods.fillElement(priceToField,priceToValue);
//
//        WebElement searchButton = getWebDriver().findElement(By.xpath("(//button[@title='Search'])[2]"));
//        elementMethods.waitVisibleElement(searchButton);
//        elementMethods.clickElement(searchButton);


    }
}
