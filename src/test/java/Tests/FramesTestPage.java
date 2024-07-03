package Tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesTestPage extends SharedData {

    @Test
    public void theInputForm() {
        ElementMethods elementMethods = new ElementMethods(webDriver);
        AlertMethods alertMethods = new AlertMethods(webDriver);

        WebElement framesTestPage = webDriver.findElement(By.id("alerttest"));
//        framesTestPage.click();
        elementMethods.clickElement(framesTestPage);

//        js.executeScript("window.scrollBy(0,450)", "");
        WebElement alertBoxButton = webDriver.findElement(By.id("alertexamples"));
//        alertBoxButton.click();
        elementMethods.clickElement(alertBoxButton);
//        Alert firstAlert = webDriver.switchTo().alert();
//        firstAlert.accept();
        alertMethods.acceptAlert();

        WebElement confirmBoxButton = webDriver.findElement(By.id("confirmexample"));
//        confirmBoxButton.click();
        elementMethods.clickElement(confirmBoxButton);
//        Alert secondAlert = webDriver.switchTo().alert();
//        secondAlert.dismiss();
        alertMethods.cancelAlert();


        WebElement promptBoxButton = webDriver.findElement(By.id("promptexample"));
//        promptBoxButton.click();
        elementMethods.clickElement(promptBoxButton);
        String text = "Confirm";
//        Alert thirdAlert = webDriver.switchTo().alert();
//        thirdAlert.sendKeys(text);
//        thirdAlert.accept();
        alertMethods.fillAlert(text);
    }
}
