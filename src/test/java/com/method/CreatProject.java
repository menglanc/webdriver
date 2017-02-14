package com.method;

import com.page.CreatPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017-02-08.
 */
public class CreatProject extends LoginBefore{
    public static void clickDev(){
//        点击建设工程
        driver.findElement(CreatPage.xm).click();
        driver.manage().window().maximize();

    }
    public static void clickPrj(){
        driver.findElement(CreatPage.creat).click();
    }

    public static void creatPrj(String code,String name,String comp,String phone){

        driver.findElement(CreatPage.prjc).sendKeys(code);
        driver.findElement(CreatPage.prjn).sendKeys(name);
        driver.findElement(CreatPage.compn).sendKeys(comp);
        driver.findElement(CreatPage.tel).sendKeys(phone);
        driver.findElement(CreatPage.upfil).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



    }
    public static void upFile(String url){
        DocuMethod.selectMethod(CreatPage.filtype,"1");
        driver.findElement(CreatPage.fil).sendKeys(url);
        driver.findElement(CreatPage.kep).click();
        driver.findElement(CreatPage.sub).click();
    }

}
