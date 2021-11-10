package com.example.test.service;

import com.example.test.entity.Department;
import com.example.test.entity.RespBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Catherine
 */
public interface DepartmentService {

    Department getDepartmentInfo(Long id);

    List<Department> getAllDepartment();

    int insertDepartment(Department department);
}
