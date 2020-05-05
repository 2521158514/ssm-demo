package com.lyun.service;

import com.lyun.bean.Department;
import com.lyun.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> listDepartment() {
        return departmentMapper.listDepartment();
    }
}
