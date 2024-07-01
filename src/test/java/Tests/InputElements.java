package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class InputElements {
    public WebDriver webDriver;

    @Test
    public void theInputForm() {
        webDriver = new ChromeDriver();
        webDriver.get("https://testpages.eviltester.com/styled/index.html");
        webDriver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,450)", "");

        WebElement htmlFormTestPage = webDriver.findElement(By.id("htmlformtest"));
        htmlFormTestPage.click();

        WebElement userNameField = webDriver.findElement(By.name("username"));
        String userNameValue = "cristival";
        userNameField.sendKeys(userNameValue);

        WebElement passwordField = webDriver.findElement(By.name("password"));
        String passwordValue = "minion";
        passwordField.sendKeys(passwordValue);

        WebElement textCommentField = webDriver.findElement(By.name("comments"));
        String textCommentValue = "Ana are mere si nu vinde pere:))";
        textCommentField.sendKeys(textCommentValue);

        WebElement fileField = webDriver.findElement((By.name("filename")));
        fileField.sendKeys(new File("src/test/resources/3d render.jpg").getAbsolutePath());

        WebElement dropDownField = webDriver.findElement(By.name("dropdown"));
        dropDownField.sendKeys("dd5");
        dropDownField.sendKeys(Keys.ENTER);


//
//        WebElement submitButton = webDriver.findElement(By.xpath("//input[@type='submit']"));
//        submitButton.click();


    }

}
