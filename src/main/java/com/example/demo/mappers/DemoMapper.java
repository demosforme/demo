package com.example.demo.mappers;

import com.example.demo.models.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DemoMapper {
    @Select("SELECT id as id, firstname as firstName, last_name as lastName FROM spring_demo.clients WHERE id = #{id}")
    Demo getDemo(long id);
}
