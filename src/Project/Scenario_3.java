package Project;
/*
Senaryo

1) https://demoqa.com/dynamic-properties adresine gidin
2) “Will enable 5 seconds” butonunun enable olmasini bekleyin
3) “Will enable 5 seconds” butonunun enable oldugunu test edin
 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Scenario_3 extends BaseDriver {

    @Test
    public void Scenario3(){

        driver.get("https://demoqa.com/dynamic-properties ");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='enableAfter']")));

        WebElement enabled= driver.findElement(By.cssSelector("[id='enableAfter']"));

        Assert.assertTrue(enabled.isEnabled());

    }
}
