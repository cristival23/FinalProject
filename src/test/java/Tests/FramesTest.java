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
//        framesTestPage.click();
        elementMethods.clickElement(framesTestPage);

//        js.executeScript("window.scrollBy(0,450)", "");
        WebElement alertBoxButton = getWebDriver().findElement(By.id("alertexamples"));
//        alertBoxButton.click();
        elementMethods.clickElement(alertBoxButton);
//        Alert firstAlert = webDriver.switchTo().alert();
//        firstAlert.accept();
        alertMethods.acceptAlert();

        WebElement confirmBoxButton = getWebDriver().findElement(By.id("confirmexample"));
//        confirmBoxButton.click();
        elementMethods.clickElement(confirmBoxButton);
//        Alert secondAlert = webDriver.switchTo().alert();
//        secondAlert.dismiss();
        alertMethods.cancelAlert();


        WebElement promptBoxButton = getWebDriver().findElement(By.id("promptexample"));
//        promptBoxButton.click();
        elementMethods.clickElement(promptBoxButton);
        String text = "Confirm";
//        Alert thirdAlert = webDriver.switchTo().alert();
//        thirdAlert.sendKeys(text);
//        thirdAlert.accept();
        alertMethods.fillAlert(text);
    }
}
