package com.springmvc.controller;

import com.springmvc.dao.DepartmentDao;
import com.springmvc.dao.EmployeeDao;
import com.springmvc.pojo.Department;
import com.springmvc.pojo.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
public class EmployeeHandler {

    @RequestMapping(value = "/emplist", method = RequestMethod.GET)
    public String getAllEmp(Map<String, Object> emps) {
        emps.put("emps", EmployeeDao.getAllEmpls());
        return "emplist";
    }

    @RequestMapping(value = "/addemp", method = RequestMethod.POST)
    public String addemp(Map<String, Object> emps) {
        Map<Integer, String> gendermap = new HashMap<>();
        gendermap.put(1, "male");
        gendermap.put(2, "fmale");
        emps.put("gender", gendermap);
        emps.put("deps", DepartmentDao.getAllDepts());
        return "addemp";
    }
}
