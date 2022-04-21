package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-21-14:27
 */
@Controller
public class ViewController {


    //ThymeleafView
    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        return "success";
    }


    //转发视图
    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testThymeleafView";
    }


    //重定向视图
    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/testThymeleafView";
    }

}
