package Pages;

import HelperMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private ElementMethods elementMethods;
    private WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

//    private void navidateToAlertFrameWindowPage(){
//        elementMethods.scrollElementByPixel(0,450);
//        elementMethods.clickElement(consentField);
//        elementMethods.clickElement(formsField);
//    }
}
