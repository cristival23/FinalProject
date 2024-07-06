package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class InputElementsTest extends SharedData {
//    public WebDriver webDriver;



    @Test
    public void theInputForm() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());
//        WindowMethods windowMethods = new WindowMethods(webDriver);

//        elementMethods.scrollElementByPixel(0,450);
//        webDriver = new ChromeDriver();
//        webDriver.get("https://testpages.eviltester.com/styled/index.html");
//        webDriver.manage().window().maximize();
//        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement seleniumTestWebsite = getWebDriver().findElement(By.xpath("//a[contains(text(), 'Selenium Test Pages')]"));
        elementMethods.clickElement(seleniumTestWebsite);

        elementMethods.scrollElementByPixel(0,450);
        WebElement htmlFormTestPage = getWebDriver().findElement(By.id("htmlformtest"));
//        htmlFormTestPage.click();
        elementMethods.clickElement(htmlFormTestPage);

        WebElement userNameField = getWebDriver().findElement(By.name("username"));
        String userNameValue = "cristival";
//        userNameField.sendKeys(userNameValue);
        elementMethods.fillElement(userNameField, userNameValue);

        WebElement passwordField = getWebDriver().findElement(By.name("password"));
        String passwordValue = "minion";
//        passwordField.sendKeys(passwordValue);
//        elementMethods.fillElement(passwordField,passwordValue);

        WebElement textCommentField = getWebDriver().findElement(By.name("comments"));
        String textCommentValue = "Ana are mere si nu vinde pere:))";
//        textCommentField.sendKeys(textCommentValue);
        elementMethods.fillElement(textCommentField,textCommentValue);

        String filePatch = "src/test/resources/3d render.jpg";
        WebElement fileField = getWebDriver().findElement((By.name("filename")));
//        fileField.sendKeys(new File("src/test/resources/3d render.jpg").getAbsolutePath());
//        fileField.sendKeys(new File(filePatch).getAbsolutePath());
        elementMethods.fillElement(passwordField,new File(filePatch).getAbsolutePath());



        //checkbox
        List<String> Checkbox = Arrays.asList("cb1", "cb2");
        List<WebElement> CheckboxList = getWebDriver().findElements(By.name("checkboxes[]"));
        for (Integer index = 0; index < CheckboxList.size(); index++) {
            String checkboxElementText = CheckboxList.get(index).getText();
            if (Checkbox.contains(checkboxElementText)) {
                CheckboxList.get(index).click();
            }
        }

        //radio
        radioField("rd2");

        //multiple select

        WebElement multipleSelectField = getWebDriver().findElement(By.name("multipleselect[]"));
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

        String dropDownValue= "ddr5";
        WebElement dropDownField = getWebDriver().findElement(By.name("dropdown"));
//        dropDownField.sendKeys("dd5");
//        dropDownField.sendKeys(Keys.ENTER);
        elementMethods.fillPressElement(dropDownField,dropDownValue,Keys.ENTER);

//        WebElement submitButton = webDriver.findElement(By.xpath("//input[@type='submit']"));
//        submitButton.click();

    }

    public void radioField(String radio) {
        if (radio == "rd1") {
            WebElement genderField = getWebDriver().findElement(By.cssSelector("input[name='radioval'][value='rd1']"));
            genderField.click();

        } else if (radio == "rd2") {
            WebElement radioField = getWebDriver().findElement(By.cssSelector("input[name='radioval'][value='rd2']"));
            radioField.click();

        } else {
            WebElement radioField = getWebDriver().findElement(By.cssSelector("input[name='radioval'][value='rd3']"));
            radioField.click();

        }

    }

}
