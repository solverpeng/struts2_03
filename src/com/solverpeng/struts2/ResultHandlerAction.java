package com.solverpeng.struts2;

/**
 * Created by Administrator on 2017/2/9 0009.
 */
public class ResultHandlerAction {

    public String actionMethod() {
        System.out.println("com.solverpeng.struts2.ResultHandlerAction.actionMethod");
        return "success";
    }

    public String redirect() {
        System.out.println("redirect....");
        return "success";
    }

    public String redirectAction() {
        System.out.println("redirect action...");
        return "success";
    }
}
