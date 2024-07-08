package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaCheckOutPage extends BasePageLuma {
    public LumaCheckOutPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = "a.action.showcart")
    public WebElement cartButton;
    @FindBy(xpath = "//button[contains(@class, 'action primary checkout')]")
    public WebElement checkoutButton;

    public void clickCartButton() {
        elementMethods.waitVisibleElement(cartButton);
        elementMethods.clickElement(cartButton);

    }

    public void clickCheckOutButton() {
        elementMethods.waitVisibleElement(checkoutButton);
        elementMethods.clickElement(checkoutButton);
    }
}
