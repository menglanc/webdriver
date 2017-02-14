package com.method;

import com.page.CreatPage;
import com.page.PlacePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Administrator on 2017-02-10.
 */
public class PlaceMethod extends LoginBefore {
    public static void place(String pep,String phone){
        driver.findElement(PlacePage.cd).click();
        //driver.findElement(PlacePage.kstime).sendKeys("2017-02-10 12:00:00");
        WindowMethod.ifrTest(CreatPage.frax);
        driver.findElement(PlacePage.kb).click();
        driver.findElement(PlacePage.kb1).click();
        driver.findElement(PlacePage.pb).click();
        driver.findElement(PlacePage.pb1).click();
        driver.findElement(PlacePage.pep).sendKeys(pep);
        driver.findElement(PlacePage.phone).sendKeys(phone);
        driver.findElement(PlacePage.keep).click();


    }

}
