package com.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017-02-08.
 */
public class Before {
    static String url="http://192.168.102.85:8080/wysebid/website/com.hymake.fjbid.website.SignBuyMaintain.flow?projid=5041&evaid=-2130&ordertype=1";
    static WebDriver driver;
    public static  void before(){
        System.setProperty("webdriver.ie.driver",".\\drivers\\IEDriverServer.exe");
        driver=new InternetExplorerDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

}
