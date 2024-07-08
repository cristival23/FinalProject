package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LumaSignInPage extends BasePageLuma{
    public LumaSignInPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(linkText = "Sign In")
    public WebElement signInButton;
    @FindBy(id = "email")
    public WebElement emailField;
    @FindBy(id = "pass")
    public WebElement passwordField;
    @FindBy(css = "button.action.login.primary")
    public WebElement singInButtonField;

    public void clickSignInButton(){
        elementMethods.waitVisibleElement(signInButton);
        elementMethods.clickElement(signInButton);
    }
    public void fillEmailField(String emailValue){
        elementMethods.waitVisibleElement(emailField);
        elementMethods.fillElement(emailField, emailValue);
    }
    public void fillPasswordField(String passwordValue) {
        elementMethods.waitVisibleElement(passwordField);
        elementMethods.fillElement(passwordField,passwordValue);
    }
    public void clickSingInButtonField(){
        elementMethods.waitVisibleElement(singInButtonField);
        elementMethods.clickElement(singInButtonField);
    }
}
