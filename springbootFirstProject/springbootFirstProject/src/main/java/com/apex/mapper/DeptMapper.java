package com.apex.mapper;

import com.apex.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    List<Dept> selList(Integer id);


    @Delete("delete from dept where id = #{id}")
    void delDept(Integer id);

    @Insert("insert into dept (name, create_time, update_time) values(#{name},#{createTime},#{updateTime})")
    void addDept(Dept dept);
}
