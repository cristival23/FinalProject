package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

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

        //checkbox
        List<String> Checkbox = Arrays.asList("cb1", "cb2");
        List<WebElement> CheckboxList = webDriver.findElements(By.name("checkboxes[]"));
        for (Integer index = 0; index < CheckboxList.size(); index++) {
            String checkboxElementText = CheckboxList.get(index).getText();
            if (Checkbox.contains(checkboxElementText)) {
                CheckboxList.get(index).click();
            }
        }

        //radio
        radioField("rd2");

        //multiple select

        WebElement multipleSelectField = webDriver.findElement(By.name("multipleselect[]"));
        Select select = new Select(multipleSelectField);
        if (select.isMultiple()) {
            select.selectByValue("ms1");
            select.selectByValue("ms2");
            select.selectByValue("ms3");
        }
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        for (WebElement option : selectedOptions) {
            System.out.println("Selected option: " + option.getText());
        }
        select.deselectByValue("ms4");
        selectedOptions = select.getAllSelectedOptions();
        for (WebElement option : selectedOptions) {
            System.out.println("Selected option after deselection: " + option.getText());
        }

        WebElement dropDownField = webDriver.findElement(By.name("dropdown"));
        dropDownField.sendKeys("dd5");
        dropDownField.sendKeys(Keys.ENTER);

//        WebElement submitButton = webDriver.findElement(By.xpath("//input[@type='submit']"));
//        submitButton.click();

    }

    public void radioField(String radio) {
        if (radio == "rd1") {
            WebElement genderField = webDriver.findElement(By.cssSelector("input[name='radioval'][value='rd1']"));
            genderField.click();

        } else if (radio == "rd2") {
            WebElement radioField = webDriver.findElement(By.cssSelector("input[name='radioval'][value='rd2']"));
            radioField.click();

        } else {
            WebElement radioField = webDriver.findElement(By.cssSelector("input[name='radioval'][value='rd3']"));
            radioField.click();

        }
    }

}
