package Project;
/*
Senaryo
1) https://demoqa.com/browser-windows adresine gidin
2) Alerts’e tiklayin
3) On button click, alert will appear after 5 seconds karsisindaki click me butonuna basin
4) Allert’in gorunur olmasini bekleyin
5) Allert uzerindeki yazinin “This alert appeared after 5 seconds” oldugunu test edin
6) Ok diyerek alerti kapatin
 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Scenario_2 extends BaseDriver {

    @Test
    public void Scenario2(){

        driver.get("https://demoqa.com/browser-windows");

        driver.findElement(By.xpath("//span[text()='Alerts']")).click();
        driver.findElement(By.cssSelector("[id='timerAlertButton']")).click();

        wait.until(ExpectedConditions.alertIsPresent());

        String text=driver.switchTo().alert().getText();

        Assert.assertEquals(text,"This alert appeared after 5 seconds");

        driver.switchTo().alert().accept();


    }
}
