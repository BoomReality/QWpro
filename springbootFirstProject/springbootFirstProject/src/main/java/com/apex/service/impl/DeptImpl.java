package com.apex.service.impl;

import com.apex.mapper.DeptMapper;
import com.apex.pojo.Dept;
import com.apex.service.DeptServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptImpl implements DeptServer {
    @Autowired
    DeptMapper deptMapper;
    @Override
    public List<Dept> deptList(Integer id) {
        List<Dept> deptList = deptMapper.selList(id);
        return deptList;
    }

    @Override
    public void delDept(Integer id) {
        deptMapper.delDept(id);
    }

    @Override
    public void addDpet(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.addDept(dept);
    }


}
