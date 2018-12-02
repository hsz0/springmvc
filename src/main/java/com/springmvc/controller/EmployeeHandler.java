package com.springmvc.controller;

import com.springmvc.dao.DepartmentDao;
import com.springmvc.dao.EmployeeDao;
import com.springmvc.pojo.Department;
import com.springmvc.pojo.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "/input/{id}", method = RequestMethod.GET)
    public String input(@PathVariable("id") Integer id, Map<String, Object> emps) {
        Map<Integer, String> gendermap = new HashMap<>();
        gendermap.put(0, "male");
        gendermap.put(1, "fmale");
        emps.put("genders", gendermap);
        Employee employee = new Employee();
        if (id != 0) {
            employee = EmployeeDao.getEmpById(id);
        }
        emps.put("abc", employee);
        emps.put("deps", DepartmentDao.getAllDepts());
        return "input";
    }

    @RequestMapping(value = "/emp", method = RequestMethod.POST)
    public String addEmp(Employee employee) {
        EmployeeDao.save(employee);
        return "redirect:/emplist";
    }

    @RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE)
    public String deleteEmp(@PathVariable("id") Integer id) {
        EmployeeDao.delete(id);
        return "redirect:/emplist";
    }
}
