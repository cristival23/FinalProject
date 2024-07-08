package Tests;

import HelperMethods.ElementMethods;
import Pages.HomePageLuma;
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

//        elementMethods.scrollElementByPixel(0, 450);
//        WebElement lumaWebsiteHome = getWebDriver().findElement(By.xpath("//a[contains(text(), 'Luma – Magento eCommerce')]"));
//        elementMethods.waitVisibleElement(lumaWebsiteHome);
//        elementMethods.clickElement(lumaWebsiteHome);
//
//        WebElement stickyBoxHide = getWebDriver().findElement(By.className("ea-stickybox-hide"));
//        elementMethods.waitVisibleElement(stickyBoxHide);
//        elementMethods.clickElement(stickyBoxHide);

        WebElement whatsNewButton = getWebDriver().findElement(By.id("ui-id-3"));
        elementMethods.waitVisibleElement(whatsNewButton);
        elementMethods.clickElement(whatsNewButton);

        WebElement hoodiesButton = getWebDriver().findElement(By.xpath("//div[@class='categories-menu']//ul[contains(@class, 'items')][2]//a[contains(@href, 'hoodies-and-sweatshirts-men.html')]"));
        elementMethods.waitVisibleElement(hoodiesButton);
        elementMethods.clickElement(hoodiesButton);

//        elementMethods.scrollElementByPixel(0, 450);

        WebElement sizeButton = getWebDriver().findElement(By.xpath("//div[@data-role='title' and text()='Size']"));
        elementMethods.waitVisibleElement(sizeButton);
        elementMethods.clickElement(sizeButton);

        WebElement sizeSButton = getWebDriver().findElement(By.xpath("//a[@aria-label='S']//div[@class='swatch-option text ']"));
        elementMethods.waitVisibleElement(sizeSButton);
        elementMethods.clickElement(sizeSButton);

        WebElement colorButton = getWebDriver().findElement(By.xpath("//div[@data-role='title' and text()='Color']"));
        elementMethods.waitVisibleElement(colorButton);
        elementMethods.clickElement(colorButton);


        WebElement blueButton = getWebDriver().findElement(By.xpath("//a[@aria-label='Blue']//div[@class='swatch-option color ']"));
//        elementMethods.clickElemForce(coolButton);
        elementMethods.waitVisibleElement(blueButton);
        elementMethods.clickElement(blueButton);

        WebElement hoodieMarcoButton = getWebDriver().findElement(By.xpath("//a[contains(@href, 'marco-lightweight-active-hoodie.html')]"));
        elementMethods.waitVisibleElement(hoodieMarcoButton);
        elementMethods.clickElement(hoodieMarcoButton);

        WebElement hoodieMarcoSizeSButton = getWebDriver().findElement(By.xpath("//div[@option-label='S' and @role='option']"));
        elementMethods.waitVisibleElement(hoodieMarcoSizeSButton);
        elementMethods.clickElement(hoodieMarcoSizeSButton);

        WebElement hoodieMarcoColorBlueButton = getWebDriver().findElement(By.xpath("//div[@option-label='Blue' and @role='option']"));
        elementMethods.waitVisibleElement(hoodieMarcoColorBlueButton);
        elementMethods.clickElement(hoodieMarcoColorBlueButton);

        WebElement addToCartButton = getWebDriver().findElement(By.id("product-addtocart-button"));
        elementMethods.waitVisibleElement(addToCartButton);
        elementMethods.clickElement(addToCartButton);

    }
}
