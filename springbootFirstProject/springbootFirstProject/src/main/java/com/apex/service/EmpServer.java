package com.apex.service;

import com.apex.pojo.Emp;
import com.apex.pojo.PageBean;

import java.util.List;

public interface EmpServer {
    public PageBean empList(Integer page, Integer pageSize);
}
