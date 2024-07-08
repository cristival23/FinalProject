package Tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class FramesTest extends SharedData {

    @Test
    public void theInputForm() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        AlertMethods alertMethods = new AlertMethods(getWebDriver());

        WebElement seleniumTestWebsite = getWebDriver().findElement(By.xpath("//a[contains(text(), 'Selenium Test Pages')]"));
        elementMethods.clickElement(seleniumTestWebsite);

        WebElement framesTestPage = getWebDriver().findElement(By.id("alerttest"));
        elementMethods.clickElement(framesTestPage);

        WebElement alertBoxButton = getWebDriver().findElement(By.id("alertexamples"));
        elementMethods.clickElement(alertBoxButton);
        alertMethods.acceptAlert();

        WebElement confirmBoxButton = getWebDriver().findElement(By.id("confirmexample"));
        elementMethods.clickElement(confirmBoxButton);
        alertMethods.cancelAlert();

        WebElement promptBoxButton = getWebDriver().findElement(By.id("promptexample"));
        elementMethods.clickElement(promptBoxButton);
        String text = "Confirm";
        alertMethods.fillAlert(text);
    }
}
