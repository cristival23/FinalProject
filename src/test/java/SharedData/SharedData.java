package SharedData;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {

    private WebDriver webDriver;

    @BeforeMethod
    public void prepareDriver(){

//        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        webDriver = new ChromeDriver();

//        webDriver.get("https://testpages.eviltester.com/styled/index.html");
        webDriver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");

        webDriver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,450)", "");

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
//    public void clearDriver(){
//        webDriver.quit();
//    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
