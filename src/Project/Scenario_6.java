package Project;
/*
Senaryo
1- https://www.youtube.com/ adresine gidiniz
2- "Selenium" kelimesi ile video aratınız.
3- Listelenen sonuçlarda 80 videoya kadar listeyi uzatınız.
4- Son videonun title ını yazdırınız.
 */

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Scenario_6 extends BaseDriver {

    @Test
    public void Scenario6() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement text;

        driver.get("https://www.youtube.com/");

        driver.findElement(By.cssSelector("[id='search'][name='search_query']")).sendKeys("Selenium");
        driver.findElement(By.cssSelector("[id='search-icon-legacy']")).click();


        for (int i = 1; i < 81; i++) {

            text = driver.findElement(By.xpath("(//*[@id='video-title']/yt-formatted-string)[" + i + "]"));
            wait.until(ExpectedConditions.visibilityOf(text));
            js.executeScript("arguments[0].scrollIntoView(true);", text);
            if (i == 80) {

                System.out.println(i + ". Title = " + text.getText());

            }
        }
    }
}