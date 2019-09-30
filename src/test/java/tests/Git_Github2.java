package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Git_Github2 {
    static WebDriver driver=Driver.getDriver();
    @Test
    public void test01(){
        driver.get("https://www.google.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement search_box=driver.findElement(By.xpath("//*[@title='Search']"));
        search_box.sendKeys(("github"+ Keys.ENTER));
        Driver.getDriver().close();
    }
}
