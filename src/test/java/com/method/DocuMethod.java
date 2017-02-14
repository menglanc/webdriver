package com.method;

import com.page.ZbPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017-02-10.
 */
public class DocuMethod extends LoginBefore {
    public static void zbjd(String sh,String jd,String xm){
        driver.findElement(ZbPage.zb).click();
        driver.findElement(ZbPage.xmtype).click();
        driver.findElement(ZbPage.sh).sendKeys(sh);
        driver.findElement(ZbPage.jd).sendKeys(jd);
        selectMethod(ZbPage.pb,"1");
        driver.findElement(ZbPage.hyfl).sendKeys(xm);
        selectMethod(ZbPage.zylb,"10");
        selectMethod(ZbPage.gclb,"3");
        driver.findElement(ZbPage.qd).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    public static void itemInformation(){
       driver.findElement(ZbPage.xz).click();

    }
    public static  void selectMethod(By a,String b){
        WebElement element=driver.findElement(a);
        Select select=new Select(element);
        select.selectByValue(b);


    }
}
