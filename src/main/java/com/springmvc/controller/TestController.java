
package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

    @RequestMapping(value = "/testGet")
    public String testGet() {
        System.out.println("正在查询用户的信息");
        return "success";
    }

    //rest风格请求(增删改查)：Post delete put get
    @RequestMapping(value = "/testPost")
    public String testPost() {
        System.out.println("正在新增用户的信息");
        return "success";
    }

    @RequestMapping(value = "/testDelete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String testDelete(@PathVariable(value = "id") int id) {
        System.out.println("正在删除id为" + id + "的信息");
        return "success";
    }

    @RequestMapping(value = "/testPut/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String testPut(@PathVariable(value = "id") int id) {
        System.out.println("正在更新id为" + id + "的信息");
        return "success";
    }

//    @RequestMapping(value = "/testRequestParam", method = RequestMethod.POST)
//    public String testRequestParam(@RequestParam(value = "id") Integer a
//            , @RequestParam(value = "name") String b) {
//        System.out.println(a);
//        System.out.println(b);
//        return "success";
//    }
    //或者省略 @RequestParam
    @RequestMapping(value = "/testRequestParam", method = RequestMethod.POST)
    public String testRequestParam(Integer id, String name) {
        System.out.println(id);
        System.out.println(name);
        return "success";
    }
}
