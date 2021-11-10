package com.example.test.controller;

import com.example.test.entity.Department;
import com.example.test.entity.RespBean;
import com.example.test.service.DepartmentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Catherine
 */
@RestController
@RequestMapping("/department")
public class departmentController {
    @Autowired
    private DepartmentService departmentService;

    @ApiOperation(value = "获取部门及其成员")
    @GetMapping("/{id}")
    public RespBean getDepartmentInfo(@PathVariable("id") Long id){
        Department department = departmentService.getDepartmentInfo(id);
        return RespBean.sucess(department);
    }

    @ApiOperation(value = "获取部门")
    @GetMapping("/getAllDepartment")
    public RespBean getAllDepartment(){
        List<Department> departments = departmentService.getAllDepartment();
        return RespBean.sucess(departments);
    }

    @ApiOperation(value = "添加部门")
    @PostMapping("/insertDepartment")
    public RespBean insertDepartment(@RequestBody Department department){
        if (1 == departmentService.insertDepartment(department))
            return RespBean.sucess("添加成功");
        return RespBean.error("添加失败");
    }
}
