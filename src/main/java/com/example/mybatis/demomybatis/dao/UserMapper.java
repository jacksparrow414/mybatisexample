package com.example.mybatis.demomybatis.dao;

import com.example.mybatis.demomybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author dhb
 * 这里目前先不加@Mapper注解,等以后看Spring和Mybatis结合的时候再加，现在是纯原生
 * @date 2019/11/14 9:43
 */
@Mapper
public interface UserMapper {
    
    /**
     * 添加User
     * @param entity entity
     */
    void addUser(@Param("entity") UserEntity entity);
    
    /**
     * 查询User
     * @return userEntity
     */
    UserEntity getUser();
    
    /**
     * 根据ID更新
     * @param id userId
     * @return boolean
     */
    boolean updateUserById(@Param("id") Integer id);
}
