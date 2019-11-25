package com.itdr.basic4.demo1;

/**
 * ClassName: FuWen
 * 日期: 2019/11/22 14:54
 *
 * @author Air张
 * @since JDK 1.8
 */
public class FuWen {
    private int adHurt;
    private int apHurt;

    public void setAdHurt(int a){
        if(a<=100){
            this.adHurt = a;
        }
    }
    public int getAdHurt(){
        return this.adHurt;
    }

    public void setApHurt(int a){
        this.apHurt = a;
    }
    public int getApHurt(){
        return this.apHurt;
    }
}
