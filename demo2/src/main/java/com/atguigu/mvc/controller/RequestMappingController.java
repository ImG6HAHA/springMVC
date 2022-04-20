package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-20-17:44
 */
@Controller
//@RequestMapping("/test")
public class RequestMappingController {

    //此时请求映射所映射的请求的请求路径为：/test/testRequestMapping
    @RequestMapping(value = {"/testRequestMapping","hello"})//value可以设置若干个路由
    public String testRequestMapping(){
        return "success";
    }


    //占位符
    @RequestMapping("/path/{id}/{userName}")
    public String pathTest(@PathVariable("id") Integer id,@PathVariable("userName") String userName){
        System.out.println("id:" + id+" userName:"+userName);
        return "success";
    }



}
