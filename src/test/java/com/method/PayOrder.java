package com.method;

import com.page.Page;

/**
 * Created by Administrator on 2017-02-08.
 */
public class PayOrder extends Before{
    public static void payOrd(String con,String phone){
        driver.findElement(Page.bm).click();
        driver.findElement(Page.pep).sendKeys(con);
        driver.findElement(Page.tel).sendKeys(phone);
        driver.findElement(Page.ljzf).click();
    }
    public static void cliskPay(){
        driver.findElement(Page.zf).click();

    }

}
