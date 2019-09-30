package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;

public class Git_Github3 {
    static WebDriver driver=Driver.getDriver();
    @Test
    public void testAmazon(){
        driver.get("https://www.amazon.com");
        driver.close();
    }
}
