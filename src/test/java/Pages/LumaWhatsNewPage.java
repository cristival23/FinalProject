package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LumaWhatsNewPage extends BasePageLuma {
    public LumaWhatsNewPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "ui-id-3")
    public WebElement whatsNewButton;
    @FindBy(xpath = "//div[@class='categories-menu']//ul[contains(@class, 'items')][2]//a[contains(@href, 'hoodies-and-sweatshirts-men.html')]")
    public WebElement hoodiesButton;
    @FindBy(xpath = "//div[@data-role='title' and text()='Size']")
    public WebElement sizeButton;
    @FindBy(xpath = "//a[@aria-label='S']//div[@class='swatch-option text ']")
    public WebElement sizeSButton;
    @FindBy(xpath = "//div[@data-role='title' and text()='Color']")
    public WebElement colorButton;
    @FindBy(xpath = "//a[@aria-label='Blue']//div[@class='swatch-option color ']")
    public WebElement blueButton;
    @FindBy(xpath = "//a[contains(@href, 'marco-lightweight-active-hoodie.html')]")
    public WebElement hoodieMarcoButton;
    @FindBy(xpath = "//div[@option-label='S' and @role='option']")
    public WebElement hoodieMarcoSizeSButton;

    @FindBy(xpath = "//div[@option-label='Blue' and @role='option']")
    public WebElement hoodieMarcoColorBlueButton;
    @FindBy(id ="product-addtocart-button" )
    public WebElement addToCartButton;

    public void clickWhatsNewButton(){
        elementMethods.waitVisibleElement(whatsNewButton);
        elementMethods.clickElement(whatsNewButton);
    }

    public void clickHoodiesButton(){
        elementMethods.waitVisibleElement(hoodiesButton);
        elementMethods.clickElement(hoodiesButton);
    }

    public void clickSizeButton() {
        elementMethods.waitVisibleElement(sizeButton);
        elementMethods.clickElement(sizeButton);
    }

    public void clickSizeSButton() {
        elementMethods.waitVisibleElement(sizeSButton);
        elementMethods.clickElement(sizeSButton);
    }

    public void clickColorButton() {
        elementMethods.waitVisibleElement(colorButton);
        elementMethods.clickElement(colorButton);
    }

    public void clickBlueButton(){
        elementMethods.waitVisibleElement(blueButton);
        elementMethods.clickElement(blueButton);
    }

    public void clickHoodieMarcoButton() {
        elementMethods.waitVisibleElement(hoodieMarcoButton);
        elementMethods.clickElement(hoodieMarcoButton);
    }
    public void clickHoodieMarcoSizeSButton() {
        elementMethods.waitVisibleElement(hoodieMarcoSizeSButton);
        elementMethods.clickElement(hoodieMarcoSizeSButton);
    }

    public void clickHoodieMarcoColorBlueButton() {
        elementMethods.waitVisibleElement(hoodieMarcoColorBlueButton);
        elementMethods.clickElement(hoodieMarcoColorBlueButton);
    }

    public void clickAddToCartButton() {
        elementMethods.waitVisibleElement(addToCartButton);
        elementMethods.clickElement(addToCartButton);
    }
}











