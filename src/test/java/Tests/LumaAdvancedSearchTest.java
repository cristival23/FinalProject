package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LumaAdvancedSearchTest extends SharedData {

    @Test
    public void LumaCreateAnAccount() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        elementMethods.scrollElementByPixel(0, 450);
        WebElement lumaWebsiteHome = getWebDriver().findElement(By.xpath("//a[contains(text(), 'Luma – Magento eCommerce')]"));
        elementMethods.waitVisibleElement(lumaWebsiteHome);
        elementMethods.clickElement(lumaWebsiteHome);

        WebElement stickyBoxHide = getWebDriver().findElement(By.className("ea-stickybox-hide"));
        elementMethods.waitVisibleElement(stickyBoxHide);
        elementMethods.clickElement(stickyBoxHide);

        elementMethods.scrollElementByPixel(0, 2000);
        WebElement advancedSearchLink = getWebDriver().findElement(By.xpath("//a[@data-action='advanced-search']"));
//        elementMethods.waitVisibleElement(advancedSearchLink);
        elementMethods.clickElement(advancedSearchLink);

        WebElement productNameField = getWebDriver().findElement(By.id("name"));
        elementMethods.waitVisibleElement(productNameField);
        String productNameValue="Bags";
        elementMethods.fillElement(productNameField, productNameValue);

        WebElement skuField = getWebDriver().findElement(By.id("sku"));
        elementMethods.waitVisibleElement(skuField);
        String skuValue="24-UB02";
        elementMethods.fillElement(skuField, skuValue);

        WebElement descriptionField = getWebDriver().findElement(By.id("description"));
        elementMethods.waitVisibleElement(descriptionField);
        String descriptionValue="Impulse";
        elementMethods.fillElement(descriptionField, descriptionValue);

        WebElement shortDescriptionField = getWebDriver().findElement(By.id("short_description"));
        elementMethods.waitVisibleElement(shortDescriptionField);
        String shortDescriptionValue="Dual carry handles";
        elementMethods.fillElement(shortDescriptionField, shortDescriptionValue);

        WebElement priceField = getWebDriver().findElement(By.id("price"));
        elementMethods.waitVisibleElement(priceField);
        String priceValue="Bags";
        elementMethods.fillElement(priceField, priceValue);


    }
}
