package com.apex.service.impl;

import com.apex.mapper.EmpMapper;
import com.apex.pojo.Emp;
import com.apex.pojo.PageBean;
import com.apex.service.EmpServer;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpImpl implements EmpServer {
    @Autowired
    EmpMapper empMapper;

    //    @Override
//    public PageBean empList(Integer page, Integer pageSize) {
////      1.获取记录总数
//        Long count = empMapper.count();
//
////      2.获取分页查询结果
//        Integer strat = (page -1) * pageSize;
//        List<Emp> empList = empMapper.selList(strat,pageSize);
//
////      3.封装总记录数和查询结果
//        PageBean pageBean = new PageBean(count,empList);
//
//        return pageBean;
//    }
    @Override
    public PageBean empList(Integer page, Integer pageSize) {
//        1.设置分页
        PageHelper.startPage(page, pageSize);

//        2.执行查询
        List<Emp> empList = empMapper.list();
        Page<Emp> p = (Page<Emp>) empList;

//        3.封装PageBean对象
        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());
        return pageBean;

    }
}
