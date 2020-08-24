package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tux1
 * @date 2020/8/24 14:33
 */
@RestController
public class HelloController {

    @RequestMapping("hello/{name}")
    public String hello(@PathVariable("name")  String name) {
        return "hello " + name;
    }
}
