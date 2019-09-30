package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Git_Github6 {
    static WebDriver driver=Driver.getDriver();
    @Test
    public void testAmazon(){
        driver.get("https://www.yahoo.com");
        driver.get("https://www.google.com");
        driver.get("https://www.amazon.com");
        driver.close();
    }
}
