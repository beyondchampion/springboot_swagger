package com.example.swagger.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;


/**
 * 这个路径会被添加到类内所有接口前
 * 需要与工程名对应，并以"/"结尾
 * 如：工程名为 springboot_swagger 对应的根路径如下
 */
@RestController
@ApiIgnore
@RequestMapping(value = "/demo1/")
public class HelloController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello World!：00000";
    }

}

