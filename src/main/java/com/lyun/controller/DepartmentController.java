package com.lyun.controller;

import com.lyun.bean.Department;
import com.lyun.dao.DepartmentMapper;
import com.lyun.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    DepartmentMapper departmentMapper;

    @RequestMapping("/listdepartment")
    @ResponseBody
    public List<Department> listDepartment(){
        List<Department> departments = departmentService.listDepartment();
        System.out.println(departments);
        return departments;
    }

}
