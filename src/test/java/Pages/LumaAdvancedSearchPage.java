package Pages;

import HelperMethods.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaAdvancedSearchPage extends BasePageLuma{

    public LumaAdvancedSearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "(//a[@data-action='advanced-search'])[2]")
    public WebElement advancedSearchLink;
    @FindBy(id = "name")
    public WebElement productNameField;
    @FindBy(id = "sku")
    public WebElement skuField;
    @FindBy(id = "description")
    public WebElement descriptionField;
    @FindBy(id = "short_description")
    public WebElement shortDescriptionField;
    @FindBy(xpath = "//input[@name='price[from]']")
    public WebElement priceFromField;
    @FindBy(xpath = "//input[@name='price[to]']")
    public WebElement priceToField;
    @FindBy(xpath = "(//button[@title='Search'])[2]")
    public WebElement searchButton;

    public void fillProductNameField(String productNameValue){
        elementMethods.waitVisibleElement(productNameField);
        elementMethods.fillElement(productNameField, productNameValue);
    }
    public void fillSkuField(String skuValue){
        elementMethods.waitVisibleElement(skuField);
        elementMethods.fillElement(skuField, skuValue);
    }
    public void fillDescriptionField(String descriptionValue){
        elementMethods.waitVisibleElement(descriptionField);
        elementMethods.fillElement(descriptionField, descriptionValue);
    }
    public void fillShortDescriptionField(String shortDescriptionValue){
        elementMethods.waitVisibleElement(shortDescriptionField);
        elementMethods.fillElement(shortDescriptionField, shortDescriptionValue);
    }
    public void fillPriceFromField(String priceFromValue){
        elementMethods.waitVisibleElement(priceFromField);
        elementMethods.fillElement(priceFromField,priceFromValue);
    }
    public void fillPriceToField(String priceToValue){
        elementMethods.waitVisibleElement(priceToField);
        elementMethods.fillElement(priceToField,priceToValue);
    }
    public void PressSearchButton(){
        elementMethods.waitVisibleElement(searchButton);
        elementMethods.clickElement(searchButton);
    }

    public void navigateToAdvancedSearch() {
        elementMethods.scrollElementByPixel(0, 2000);
        elementMethods.waitVisibleElement(advancedSearchLink);
        elementMethods.clickElement(advancedSearchLink);
    }
}
