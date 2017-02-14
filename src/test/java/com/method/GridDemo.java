package com.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017-02-08.
 */
public class GridDemo {
    static String huburl="http://192.168.100.107:6666/wd/hub";
    static String url="http://192.168.102.85:8080/wysebid/website/com.hymake.fjbid.website.SignBuyMaintain.flow?projid=5041&evaid=-2130&ordertype=1";
    static WebDriver driver;
    @Test
    public static void gridMethod() throws MalformedURLException {
        DesiredCapabilities iedc=DesiredCapabilities.internetExplorer();
        driver=new RemoteWebDriver(new URL(huburl),iedc);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
