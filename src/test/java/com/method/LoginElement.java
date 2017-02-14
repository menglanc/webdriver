package com.method;
import com.page.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017-02-04.
 */
public class LoginElement extends LoginBefore{
    public static void loginStep(String user,String pwd){
        driver.findElement(LoginPage.user).sendKeys(user);
        driver.findElement(LoginPage.pwd).sendKeys(pwd);
        driver.findElement(LoginPage.login).click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(LoginPage.jiaoyi).click();
        //driver.manage().window().maximize();

    }
    public static void after(){
        driver.findElement(LoginPage.tc).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

    }
}
