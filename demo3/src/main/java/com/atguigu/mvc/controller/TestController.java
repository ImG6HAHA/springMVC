package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-20-23:59
 */
@Controller
public class TestController {

//    @RequestMapping("/")
//    public String index(){
//        //设置视图名称
//        return "index";
//    }
    //改用springMVC.xml配置首页视图（视图控制器）

    @RequestMapping("/test_view")
    public String testView(){
        //设置视图名称
        return "test_view";
    }


}
