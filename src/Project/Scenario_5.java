package Project;
/*
Senaryo

https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
1) “Add Element” butona basin
2) “Delete” butonu gorunur oluncaya kadar bekleyin
3) “Delete” butonunun gorunur oldugunu test edin
4) Delete butonuna basarak butonu silin
 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.io.IOException;

public class Scenario_5 extends BaseDriver {

    @Test
    public void Scenario5() throws IOException {

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.cssSelector("[onclick='addElement()']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick='deleteElement()']")));
        WebElement delete= driver.findElement(By.cssSelector("[onclick='deleteElement()']"));

        Assert.assertTrue(delete.isDisplayed());
        delete.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[onclick='deleteElement()']")));









    }
}
