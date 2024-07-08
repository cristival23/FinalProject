package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class TheInputFormTest extends SharedData {


    @Test
    public void theInputForm() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        WebElement seleniumTestWebsite = getWebDriver().findElement(By.xpath("//a[contains(text(), 'Selenium Test Pages')]"));
        elementMethods.clickElement(seleniumTestWebsite);

        WebElement formInputPage = getWebDriver().findElement(By.id("inputvalidation"));
        elementMethods.clickElement(formInputPage);

        WebElement firstNameField = getWebDriver().findElement(By.id("firstname"));
        String firstNameValue = "Voicu";
        elementMethods.fillElement(firstNameField, firstNameValue);

        WebElement sureNameField = getWebDriver().findElement(By.id("surname"));
        String sureNameValue = "Cristian Valentin";
        elementMethods.fillElement(sureNameField, sureNameValue);

        WebElement ageField = getWebDriver().findElement(By.id("age"));
        String ageValue = "30";
        elementMethods.fillElement(ageField, ageValue);

        WebElement countryField = getWebDriver().findElement(By.id("country"));
        elementMethods.clickElement(countryField);

        WebElement notesField = getWebDriver().findElement(By.id("notes"));
        String notesValue = "Vacant";
        elementMethods.fillElement(notesField, notesValue);

        WebElement submitButton = getWebDriver().findElement(By.xpath("//input[@type='submit']"));
        elementMethods.clickElement(submitButton);

        WebElement returnButton = getWebDriver().findElement(By.id("backtoform"));
        elementMethods.clickElement(returnButton);
    }
}
