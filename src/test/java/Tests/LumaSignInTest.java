package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LumaSignInTest extends SharedData {

    @Test
    public void LumaSignIn() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        elementMethods.scrollElementByPixel(0, 450);
        WebElement lumaWebsiteHome = getWebDriver().findElement(By.xpath("//a[contains(text(), 'Luma – Magento eCommerce')]"));
        elementMethods.waitVisibleElement(lumaWebsiteHome);
        elementMethods.clickElement(lumaWebsiteHome);

        WebElement stickyBoxHide = getWebDriver().findElement(By.className("ea-stickybox-hide"));
        elementMethods.waitVisibleElement(stickyBoxHide);
        elementMethods.clickElement(stickyBoxHide);

        WebElement SignInButton = getWebDriver().findElement(By.linkText("Sign In"));
        elementMethods.waitVisibleElement(SignInButton);
        elementMethods.clickElement(SignInButton);

        WebElement emailField = getWebDriver().findElement(By.id("email"));
        String emailValue = "voicucristianvalentin1993@gmail.com";
        elementMethods.waitVisibleElement(emailField);
        elementMethods.fillElement(emailField, emailValue);

        WebElement passwordField = getWebDriver().findElement(By.id("pass"));
        String passwordValue =  "Parola23!";
        elementMethods.waitVisibleElement(passwordField);
        elementMethods.fillElement(passwordField,passwordValue);

        WebElement SingInButtonField = getWebDriver().findElement(By.cssSelector("button.action.login.primary"));
        elementMethods.waitVisibleElement(SingInButtonField);
        elementMethods.clickElement(SingInButtonField);
    }
}
