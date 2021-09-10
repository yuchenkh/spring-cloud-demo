package org.example.userservice.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.userservice.entity.User;

// Sep 8, 2021
public interface UserMapper {

    @Select(value = "select * from tb_user where id = #{id}")
    User getById(@Param("id") Long id);
}
