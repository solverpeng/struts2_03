package com.solverpeng.struts2;

/**
 * Created by Administrator on 2017/2/9 0009.
 */
public class ResultHandlerAction2 {
    public String action2Method() {
        System.out.println("com.solverpeng.struts2.ResultHandlerAction2.action2Method");
        return "success";
    }

    public String redirectTargetMethod() {
        System.out.println("redirect action target method....");
        return "success";
    }
}
