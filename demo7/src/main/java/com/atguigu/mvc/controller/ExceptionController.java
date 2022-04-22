package com.atguigu.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-22-18:59
 */

//异常处理：可以通过配置文件或者注解

//@ControllerAdvice将当前类标识为异常处理的组件
@ControllerAdvice
public class ExceptionController {

    //@ExceptionHandler用于设置所标识方法处理的异常
    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    //ex表示当前请求处理中出现的异常对象
    public String testException(Exception ex, Model model){
        model.addAttribute("ex",ex);
        return "error";
    }

}
