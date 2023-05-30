package com.apex.controller;

import com.apex.pojo.Emp;
import com.apex.pojo.PageBean;
import com.apex.pojo.Result;
import com.apex.service.EmpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpServer empServer;

    @GetMapping("/emps")
    public Result empList(@RequestParam(defaultValue = "1") Integer page,
                          @RequestParam(defaultValue = "10") Integer pageSize){
        PageBean pageBean = empServer.empList(page,pageSize);
        return Result.success(pageBean);
    }

}
