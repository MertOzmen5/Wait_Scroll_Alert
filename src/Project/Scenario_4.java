package Project;
/*
Senaryo

https://demoqa.com/dynamic-properties adresine gidin
1) “Visible After 5 seconds” butonunun gorunur olmasini bekleyin
2) “Visible After 5 seconds” butonunun gorunur oldugunu test edin
 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Scenario_4 extends BaseDriver {

    @Test
    public void Scenario4(){
        driver.get("https://demoqa.com/dynamic-properties ");



        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='visibleAfter']")));

        WebElement visible= driver.findElement(By.cssSelector("[id='visibleAfter']"));

        Assert.assertTrue(visible.isDisplayed());


    }
}
