package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TheInputForm {
    public WebDriver webDriver;

    @Test
    public void theInputForm(){
        webDriver = new ChromeDriver();
        webDriver.get("https://testpages.eviltester.com/styled/index.html");
        webDriver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,450)", "");

        WebElement formInputPage = webDriver.findElement(By.id("inputvalidation"));
        formInputPage.click();

        WebElement firstNameField = webDriver.findElement(By.id("firstname"));
        String firstNameValue = "Voicu";
        firstNameField.sendKeys(firstNameValue);

        WebElement sureNameField = webDriver.findElement(By.id("surname"));
        String sureNameValue = "Cristian Valentin";
        sureNameField.sendKeys(sureNameValue);

        WebElement ageField = webDriver.findElement(By.id("age"));
        String ageValue = "30";
        ageField.sendKeys(ageValue);

        WebElement countryField = webDriver.findElement(By.id("country"));
        countryField.click();
//        WebElement countryField = webDriver.findElement(By.id("country"));
//        countryField.sendKeys("Romania");
//        countryField.sendKeys(Keys.ENTER);

        WebElement notesField = webDriver.findElement(By.id("notes"));
        String notesValue = "Vacant";
        notesField.sendKeys(notesValue);

        WebElement submitButton = webDriver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

        WebElement returnButton = webDriver.findElement(By.id("backtoform"));
        returnButton.click();


    }
}
