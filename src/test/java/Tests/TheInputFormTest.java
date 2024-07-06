package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class TheInputFormTest extends SharedData {


    @Test
    public void theInputForm(){
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        WebElement seleniumTestWebsite = getWebDriver().findElement(By.xpath("//a[contains(text(), 'Selenium Test Pages')]"));
        elementMethods.clickElement(seleniumTestWebsite);

        WebElement formInputPage = getWebDriver().findElement(By.id("inputvalidation"));
//        formInputPage.click();
        elementMethods.clickElement(formInputPage);

        WebElement firstNameField = getWebDriver().findElement(By.id("firstname"));
        String firstNameValue = "Voicu";
//        firstNameField.sendKeys(firstNameValue);
        elementMethods.fillElement(firstNameField, firstNameValue);


        WebElement sureNameField = getWebDriver().findElement(By.id("surname"));
        String sureNameValue = "Cristian Valentin";
//        sureNameField.sendKeys(sureNameValue);
        elementMethods.fillElement(sureNameField, sureNameValue);

        WebElement ageField = getWebDriver().findElement(By.id("age"));
        String ageValue = "30";
//        ageField.sendKeys(ageValue);
        elementMethods.fillElement(ageField, ageValue);

        WebElement countryField = getWebDriver().findElement(By.id("country"));
//        countryField.click();
        elementMethods.clickElement(countryField);
//        WebElement countryField = webDriver.findElement(By.id("country"));
//        countryField.sendKeys("Romania");
//        countryField.sendKeys(Keys.ENTER);

        WebElement notesField = getWebDriver().findElement(By.id("notes"));
        String notesValue = "Vacant";
//        notesField.sendKeys(notesValue);
        elementMethods.fillElement(notesField,notesValue);

        WebElement submitButton = getWebDriver().findElement(By.xpath("//input[@type='submit']"));
//        submitButton.click();
        elementMethods.clickElement(submitButton);

        WebElement returnButton = getWebDriver().findElement(By.id("backtoform"));
//        returnButton.click();
        elementMethods.clickElement(returnButton);

//        List<WebElement> labelFields = webDriver.findElements(By.xpath("//ul/li"));
//        List<WebElement> valueFields = webDriver.findElements(By.xpath("//ul/li/ul/li"));
//
//        Assert.assertEquals(labelFields.get(0).getText(),"Firstname");
//        Assert.assertEquals(labelFields.get(0).getText(),firstNameValue);



    }
}
