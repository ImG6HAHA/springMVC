package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-22-20:45
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }


}
