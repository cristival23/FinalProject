package HelperMethods;

import org.openqa.selenium.WebDriver;

public class WindowMethods {

    public WebDriver webDriver;

    public WindowMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

//    public void switchSpecificTabWindow(Integer index){
//
//    }

    public void closeCurentTabWindow(){
        webDriver.close();
    }
}
