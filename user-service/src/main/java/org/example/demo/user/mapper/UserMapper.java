package org.example.demo.user.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.demo.user.entity.User;

// Sep 8, 2021
public interface UserMapper {

    @Select(value = "select * from tb_user where id = #{id}")
    User getById(@Param("id") Long id);
}
