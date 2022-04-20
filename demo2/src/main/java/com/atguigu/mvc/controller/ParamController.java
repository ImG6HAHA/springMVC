package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-20-20:09
 */
@Controller
public class ParamController {

    //测试使用servletAPI获取请求参数
    @RequestMapping("/testServletAPI")
    public String testParam(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }

    @RequestMapping("/testParam")
    public String testParam(String username, String password){
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }


    //通过实体类获取请求参数
    @RequestMapping("/testpojo")
    public String testPOJO(User user){
        System.out.println(user);
        return "success";
    }

    //TODO 乱码问题没解决


}
