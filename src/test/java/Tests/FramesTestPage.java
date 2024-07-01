package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesTestPage {
    public WebDriver webDriver;

    @Test
    public void theInputForm() {
        webDriver = new ChromeDriver();
        webDriver.get("https://testpages.eviltester.com/styled/index.html");
        webDriver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,450)", "");

        WebElement framesTestPage = webDriver.findElement(By.id("alerttest"));
        framesTestPage.click();

        js.executeScript("window.scrollBy(0,450)", "");
        WebElement alertBoxButton = webDriver.findElement(By.id("alertexamples"));
        alertBoxButton.click();
        Alert firstAlert = webDriver.switchTo().alert();
        firstAlert.accept();

        WebElement confirmBoxButton = webDriver.findElement(By.id("confirmexample"));
        confirmBoxButton.click();
        Alert secondAlert = webDriver.switchTo().alert();
//        secondAlert.dismiss();
        secondAlert.accept();

        WebElement promptBoxButton = webDriver.findElement(By.id("promptexample"));
        promptBoxButton.click();
        String text = "Confirm";
        Alert thirdAlert = webDriver.switchTo().alert();
        thirdAlert.sendKeys(text);
        thirdAlert.accept();
    }
}
