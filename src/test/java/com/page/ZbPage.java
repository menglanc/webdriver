package com.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017-02-10.
 */
public class ZbPage {
    public static By zb= By.xpath(".//*[@name='listForm']/table/tbody/tr[3]/td[6]/input[2]");
    public static By xmtype=By.xpath(".//*[@id='projclass']/tbody/tr[2]/td[2]/span/div/table/tbody/tr/td[1]/input");
    public static By sh=By.name("projbase/auditdeptname");
    public static By jd=By.name("projbase/supervisedepname");
    public static By pb=By.name("projbase/bidmid");
    public static By zylb=By.id("projbase/class[1]/classvalueid");
    public static By gclb=By.id("projbase/class[2]/classvalueid");
    public static By hyfl=By.id("returnValue");
    public static By qd=By.xpath(".//*[@name='dataform1']/table[2]/tbody/tr/td/input[1]");
    public static By xz=By.xpath(".//*[@name='dataform1']/table[2]/tbody/tr[1]/td/input");



}
