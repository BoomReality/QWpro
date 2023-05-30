package com.apex.service;

import com.apex.pojo.Dept;

import java.util.List;

public interface DeptServer {
    /*
    * 查询全部部门信息
    * */
    public List<Dept> deptList(Integer id);


    /*
    * 根据id删除部门信息
    * @Param id
    * */
    public void delDept(Integer id);

    /*
    * 新增部门信息
    * @Param Dept dept
    * */
    void addDpet(Dept dept);
}
