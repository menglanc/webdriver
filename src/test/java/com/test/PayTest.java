package com.test;

import com.method.Before;
import com.method.PayOrder;
import com.method.WindowMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017-02-08.
 */
public class PayTest {
    @DataProvider(name="data1")
    public Object[][] data(){
     return new Object[][]{{"aa","13011111111"},{"bb","13011111111"},{"cc","13011111111"}};
    }
    @Test(dataProvider = "data1")
    public void payList(String i,String j){
        Before.before();
        PayOrder.payOrd(i,j);
        WindowMethod.winTest();
        PayOrder.cliskPay();
    }



}
