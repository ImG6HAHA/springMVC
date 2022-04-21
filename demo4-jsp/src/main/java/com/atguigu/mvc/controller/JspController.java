package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-21-15:07
 */
@Controller
public class JspController {


    @RequestMapping("/success")
    public String success(){
        return "success";
    }

}
