package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Git_Gitub01 {
    static WebDriver driver=Driver.getDriver();
    @Test
    public void test01(){
        driver.get("https://www.google.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.getDriver().close();
    }
}
