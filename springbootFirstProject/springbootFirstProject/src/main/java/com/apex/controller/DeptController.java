package com.apex.controller;

import com.apex.pojo.Dept;
import com.apex.pojo.Result;
import com.apex.service.DeptServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {
    @Autowired
    DeptServer deptServer;

    /*
    * 查询部门数据
    * @return
    * */
    @GetMapping
    public Result deptList(){
        Integer id = null;
        List<Dept> deptList = deptServer.deptList(id);
        return Result.success(deptList);
    }

    @GetMapping("/{id}")
    public Result deptById(@PathVariable Integer id){
        log.info("根据id查询：{}",id);
        List<Dept> deptList = deptServer.deptList(id);
        return Result.success(deptList);
    }

    /*
    * 删除操作
    * @Param id
    * */
    @DeleteMapping("/{id}")
    public Result deptDel(@PathVariable Integer id){
        log.info("根据ID删除部门：{}",id);
        //删除操作
        deptServer.delDept(id);
        return Result.success();
    }

    /*
    * 新增部门
    * @Param name
    * */
    @PostMapping
    public Result insertDept(@RequestBody Dept dept){
        log.info("新增部门：{}",dept);
        deptServer.addDpet(dept);
        return Result.success();
    }

}
