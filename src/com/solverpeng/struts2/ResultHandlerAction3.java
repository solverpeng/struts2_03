package com.solverpeng.struts2;

import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/2/9 0009.
 */
public class ResultHandlerAction3 {

    private String name =  "lily";

    public String getName() {
        return name;
    }

    public String testFreemarker() {
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("requestKey", "requestValue");
        return "success";
    }

    public String testVelocity() {
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("requestKey2", "requestValue2");
        return "success";
    }
}
