package com.codeman.vuedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/2/5 23:31
 * @version: 1.0
 */
@Controller
public class VueController {

    @GetMapping("/index")
    public String index() {
        return "promise";
    }


    @GetMapping("/data1")
    @ResponseBody
    public String sendData1() {
        return "data1===";
    }
}
