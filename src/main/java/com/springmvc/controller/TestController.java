
package com.springmvc.controller;

import com.springmvc.pojo.Account;
import com.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
//@RequestMapping("springmvc")
@SessionAttributes(value = {"name3"})
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

    @RequestMapping(value = "/testPojoParam", method = RequestMethod.POST)
    public String testPojoParam(User user) {
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Accept-Language") String a, @RequestHeader("Referer") String b) {
        System.out.println(a);
        System.out.println(b);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String a) {
        System.out.println(a);
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        mv.addObject("name", "Tom123");
        return mv;
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, String> map) {
        map.put("name1", "Jack");
        return "success";
    }

    @RequestMapping("/testModel")
    public String testModel(Model model) {
        model.addAttribute("name2", "Luccy");
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap) {
        modelMap.addAttribute("name3", "Lii");
        return "success";
    }

    @RequestMapping("/testResult")
    public String testResult() {
        return "result";
    }

    @ModelAttribute
    public void start(Map<String,Object> map){
        Account account = new Account(1,"Tom","2018-01-01");
        map.put("abc",account);
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") Account account) {
        System.out.println(account);
        return "success";
    }
}
