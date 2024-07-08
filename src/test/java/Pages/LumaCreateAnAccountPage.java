package Pages;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LumaCreateAnAccountPage extends BasePageLuma {
    public LumaCreateAnAccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(linkText = "Create an Account")
    public WebElement createAccountButton;
    @FindBy(className = "ea-stickybox-hide")
    public WebElement stickyBoxHide2;
    @FindBy(id = "firstname")
    public WebElement firstNameField;
    @FindBy(id = "lastname")
    public WebElement lastNameField;
    @FindBy(id = "email_address")
    public WebElement emailField;
    @FindBy(id = "password")
    public WebElement passwordField;
    @FindBy(id = "password-confirmation")
    public WebElement confirmPasswordField;
    @FindBy(css = "button.action.submit.primary")
    public WebElement submitButtonField;

    public void clickCreateAccountButton() {
        elementMethods.waitVisibleElement(createAccountButton);
        elementMethods.clickElement(createAccountButton);
    }

    public void clickStickyBoxHide2() {
        elementMethods.waitVisibleElement(stickyBoxHide2);
        elementMethods.clickElement(stickyBoxHide2);
    }

    public void fillFirstNameField(String firstNameValue) {
        elementMethods.scrollElementByPixel(0, 450);
        elementMethods.waitVisibleElement(firstNameField);
        elementMethods.fillElement(firstNameField, firstNameValue);
    }

    public void fillLastNameField(String lastNameValue) {
        elementMethods.waitVisibleElement(lastNameField);
        elementMethods.fillElement(lastNameField, lastNameValue);
    }

    public void fillEmailField(String emailValue) {
        elementMethods.waitVisibleElement(emailField);
        elementMethods.fillElement(emailField, emailValue);
    }

    public void fillPasswordField(String passwordValue) {
        elementMethods.waitVisibleElement(passwordField);
        elementMethods.fillElement(passwordField, passwordValue);
    }

    public void fillConfirmPasswordField(String confirmPasswordValue) {
        elementMethods.scrollElementByPixel(0, 2000);
        elementMethods.waitVisibleElement(confirmPasswordField);
        elementMethods.fillElement(confirmPasswordField, confirmPasswordValue);

    }

    public void clickSubmitButtonField() {
        elementMethods.waitVisibleElement(submitButtonField);
        elementMethods.clickElement(submitButtonField);
    }
}
