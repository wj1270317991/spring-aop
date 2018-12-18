package com.spring.aop.web;

import com.spring.aop.annotation.Demo;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wangjun on 2018/12/18.
 */


@RestController
public class HelloController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }



    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    @ResponseBody
    @Demo(name = "111")
    public String hello2(@RequestParam String name) {
        return "Hello2 " + name;
    }
}
