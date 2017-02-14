package com.method;

import com.page.CreatPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


/**
 * Created by Administrator on 2017-02-06.
 */
public class WindowMethod extends LoginBefore {

    public static void  winTest() {
        String hadle = driver.getWindowHandle();
        for (String hadles : driver.getWindowHandles()) {
            if (hadles.equals(hadle)) {
                continue;
            }
            driver.switchTo().window(hadles);

        }



    }
    public static void ifrTest(By frame){
        WebElement fran=driver.findElement(frame);
        driver.switchTo().frame(fran);

    }
    public static void sfIfr(){

        driver.switchTo().defaultContent();
    }

}
