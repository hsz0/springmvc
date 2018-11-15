
package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
//@RequestMapping("springmvc")
public class TestController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET, params = {"name", "age!=12"})
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/*/antstyle")
    public String antstyle() {
        return "success";
    }

    @RequestMapping(value = "/testPathVar/{id}")
    public String testPathVar(@PathVariable(value = "id") int id) {
        System.out.printf("id =" + id);
        return "success";
    }
}
