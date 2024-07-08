package Pages;

import HelperMethods.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLuma extends BasePageLuma {
    public HomePageLuma(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[contains(text(), 'Luma – Magento eCommerce')]")
    private WebElement lumaWebsiteHome;
    @FindBy(className = "ea-stickybox-hide")
    private WebElement stickyBoxHide;


    public void navidateToHomePageLuma() {
        elementMethods.scrollElementByPixel(0, 450);
        elementMethods.clickElement(lumaWebsiteHome);
        elementMethods.clickElement(stickyBoxHide);
    }
}
