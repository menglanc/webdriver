package com.method;

import com.page.CreatPage;
import com.page.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017-02-04.
 */
public class LoginBefore {
     static String url="http://192.168.102.85:8080/wysebid/website/index.jsp";
     static WebDriver driver;
    public static  void before(){
        System.setProperty("webdriver.ie.driver",".\\drivers\\IEDriverServer.exe");
        driver=new InternetExplorerDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

}
