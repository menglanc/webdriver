package com.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017-02-04.
 */
public class LoginPage {
//    定位用户名
    public static By user =By.id("userid");
//    定位密码
    public static By pwd =By.id("password");
//    定位登录
    public static By login =By.xpath(".//*[@id='loginbox']/span/table/tbody/tr/td[4]/input[2]");
//    登录后元素
    public static  By jiaoyi=By.linkText("进入交易平台");
    public static By tc=By.xpath(".//*[@id='right1']/table/tbody/tr[1]/td/a[4]");
}

