package com.example.test.service.impl;

import com.example.test.entity.Department;
import com.example.test.mapper.DepartmentMapper;
import com.example.test.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * service实现类
 *
 * @Author: Catherine
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Department getDepartmentInfo(Long id) {
        return departmentMapper.getDepartmentInfo(id);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentMapper.getAllDepartment();
    }

    @Override
    public int insertDepartment(Department department) {
        return departmentMapper.insert(department);
    }
}
