package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class main_url {
    private static WebElement element = null;
    public static WebElement textbox_search(WebDriver driver){
        WebElement element = driver.findElement(By.linkText("https://qavalidation.com/demo-form/"));
        return element;
    }
}
