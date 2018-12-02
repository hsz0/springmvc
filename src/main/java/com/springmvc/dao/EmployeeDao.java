package com.springmvc.dao;

import com.springmvc.pojo.Department;
import com.springmvc.pojo.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDao {
    private static Map<Integer, Employee> empls;

    static {
        empls = new HashMap<Integer, Employee>();
        empls.put(101, new Employee(101, "Tom", "A@123.com", 0, DepartmentDao.getDeptById(1)));
        empls.put(102, new Employee(102, "Dom", "B@123.com", 1, DepartmentDao.getDeptById(2)));
        empls.put(103, new Employee(103, "Vom", "C@123.com", 0, DepartmentDao.getDeptById(2)));
        empls.put(104, new Employee(104, "Bom", "D@123.com", 1, DepartmentDao.getDeptById(1)));
    }

    public static Collection<Employee> getAllEmpls() {
        return empls.values();
    }
}
