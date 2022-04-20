package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-20-23:59
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        //设置视图名称
        return "index";
    }
}
