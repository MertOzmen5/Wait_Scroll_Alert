package Project;

/*
1-
Senaryo
1- google.com ile sayfayı açınız.
2- Daha sonra Yeni bir TAB (ctrl+T) açınız.
3- Bu açılan yeni sayfada facebook.com u açınız.
4- Bu sayfanın açıldığını URL sinden kontrol ediniz.
4- Daha sonra facebook.com sayfasını kapatınız.
 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Scenario_1 extends BaseDriver {

    @Test
    public void Scenario1(){

        driver.get("https://www.google.com.tr/");

        wait.until(ExpectedConditions.urlContains("google"));
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.facebook.com/");

        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/"));
        driver.close();





    }
}
