package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TheInputForm extends SharedData {


    @Test
    public void theInputForm(){
        ElementMethods elementMethods = new ElementMethods(webDriver);


        WebElement formInputPage = webDriver.findElement(By.id("inputvalidation"));
//        formInputPage.click();
        elementMethods.clickElement(formInputPage);

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
//        countryField.click();
        elementMethods.clickElement(countryField);
//        WebElement countryField = webDriver.findElement(By.id("country"));
//        countryField.sendKeys("Romania");
//        countryField.sendKeys(Keys.ENTER);

        WebElement notesField = webDriver.findElement(By.id("notes"));
        String notesValue = "Vacant";
        notesField.sendKeys(notesValue);

        WebElement submitButton = webDriver.findElement(By.xpath("//input[@type='submit']"));
//        submitButton.click();
        elementMethods.clickElement(submitButton);

        WebElement returnButton = webDriver.findElement(By.id("backtoform"));
//        returnButton.click();
        elementMethods.clickElement(returnButton);

//        List<WebElement> labelFields = webDriver.findElements(By.xpath("//ul/li"));
//        List<WebElement> valueFields = webDriver.findElements(By.xpath("//ul/li/ul/li"));
//
//        Assert.assertEquals(labelFields.get(0).getText(),"Firstname");
//        Assert.assertEquals(labelFields.get(0).getText(),firstNameValue);



    }
}
