package com.apex.mapper;

import com.apex.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
//    @Select("select * from emp limit #{start},#{pageSize}")
//    public List<Emp> selList(Integer start, Integer pageSize);
//
//    @Select("select count(*) from emp")
//    public Long count();

    @Select("select * from emp")
    public List<Emp> list();
}
