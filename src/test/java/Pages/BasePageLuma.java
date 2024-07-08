package Pages;

import HelperMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageLuma {

    public ElementMethods elementMethods;
    private WebDriver webDriver;

    public BasePageLuma(WebDriver webDriver) {
        this.webDriver = webDriver;
        elementMethods = new ElementMethods(webDriver);
        PageFactory.initElements(webDriver, this);
    }

}
