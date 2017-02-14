package com.test;


import com.method.*;

import com.page.CreatPage;
import com.page.PlacePage;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017-02-04.
 */
public class LoginTest {
    @Test
    public void rightLogin(){
//        调用打开网站
        LoginBefore.before();
//        输入账号密码登录，并进入后台打开新窗口
        LoginElement.loginStep("zbdl","aa000000");
        WindowMethod.winTest();
        WindowMethod.ifrTest(CreatPage.franew);
//        点击建设工程
        CreatProject.clickDev();
        WindowMethod.sfIfr();

    }
    @Test
    public void creatProject(){
//        System.currentTimeMillis()获取时间戳
//        直接调用上面登录进入后台方法
        rightLogin();
//        转交控制权到新窗口
        WindowMethod.ifrTest(CreatPage.frap);
//       控制权转交给iframe下面子iframe
        WindowMethod.ifrTest(CreatPage.fra);
//        点击新增
        CreatProject.clickPrj();
//        转交控制权给下一级
        WindowMethod.ifrTest(CreatPage.frax);
//        新增招标登记页面输入相关文本
        CreatProject.creatPrj(System.currentTimeMillis()+"D",System.currentTimeMillis()+"可以","哈","13011111111");

//        点击上传文件并上传
        CreatProject.upFile("C:\\1.png");


    }
    @Test
    public void placeTest(){
        rightLogin();
        WindowMethod.ifrTest(CreatPage.frap);
        WindowMethod.ifrTest(CreatPage.fra);
        PlaceMethod.place("aa","13022222222");

    }
    @Test
    public void zbTest(){
        rightLogin();
        WindowMethod.ifrTest(CreatPage.frap);
        WindowMethod.ifrTest(CreatPage.fra);
        DocuMethod.zbjd("监督","审核","D46");
        WindowMethod.ifrTest(CreatPage.fra);
        DocuMethod.itemInformation();
    }

}
