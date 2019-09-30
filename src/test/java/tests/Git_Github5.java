package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Git_Github5 {
    static WebDriver driver=Driver.getDriver();
    @Test
    public void testAmazon(){
        driver.get("https://www.yahoo.com");
        driver.get("https://www.google.com");
        driver.close();
    }
}
