package Tests;

import HelperMethods.ElementMethods;
import Pages.HomePageLuma;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LumaCreateAnAccountTest extends SharedData {

    @Test
    public void LumaCreateAnAccount(){
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        HomePageLuma homePageLuma = new HomePageLuma(getWebDriver());
        homePageLuma.navidateToHomePageLuma();

//        elementMethods.scrollElementByPixel(0,450);
//        WebElement lumaWebsiteHome = getWebDriver().findElement(By.xpath("//a[contains(text(), 'Luma – Magento eCommerce')]"));
//        elementMethods.waitVisibleElement(lumaWebsiteHome);
//        elementMethods.clickElement(lumaWebsiteHome);
//
//        WebElement stickyBoxHide = getWebDriver().findElement(By.className("ea-stickybox-hide"));
//        elementMethods.waitVisibleElement(stickyBoxHide);
//        elementMethods.clickElement(stickyBoxHide);

        WebElement createAccountButton = getWebDriver().findElement(By.linkText("Create an Account"));
        elementMethods.waitVisibleElement(createAccountButton);
        elementMethods.clickElement(createAccountButton);

        WebElement stickyBoxHide2 = getWebDriver().findElement(By.className("ea-stickybox-hide"));
        elementMethods.waitVisibleElement(stickyBoxHide2);
        elementMethods.clickElement(stickyBoxHide2);

        elementMethods.scrollElementByPixel(0,450);
        WebElement firstNameField = getWebDriver().findElement(By.id("firstname"));
        String firstNameValue = "Voicu";
        elementMethods.waitVisibleElement(firstNameField);
        elementMethods.fillElement(firstNameField, firstNameValue);

        WebElement lastNameField = getWebDriver().findElement(By.id("lastname"));
        String lastNameValue = "Cristian Valentin";
        elementMethods.waitVisibleElement(lastNameField);
        elementMethods.fillElement(lastNameField, lastNameValue);

        WebElement emailField = getWebDriver().findElement(By.id("email_address"));
        String emailValue = "voicucristianvalentin1993@gmail.com";
        elementMethods.waitVisibleElement(emailField);
        elementMethods.fillElement(emailField, emailValue);

        WebElement passwordField = getWebDriver().findElement(By.id("password"));
        String passwordValue =  "Parola23!";
        elementMethods.waitVisibleElement(passwordField);
        elementMethods.fillElement(passwordField,passwordValue);

        WebElement confirmPasswordField = getWebDriver().findElement(By.id("password-confirmation"));
        String confirmPasswordValue =  "Parola23!";
        elementMethods.waitVisibleElement(confirmPasswordField);
        elementMethods.fillElement(confirmPasswordField,confirmPasswordValue);

        WebElement submitButtonField = getWebDriver().findElement(By.cssSelector("button.action.submit.primary"));
        elementMethods.waitVisibleElement(submitButtonField);
        elementMethods.clickElement(submitButtonField);

    }
}
