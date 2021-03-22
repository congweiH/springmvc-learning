package com.looeywei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping(path = "/hello")
    public String sayHello(){
        // 返回 success.jsp 文件内容
        return "success";
    }
}
