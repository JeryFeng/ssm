package com.springmvc.dao;

import com.springmvc.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);
    int updateUser (Long id);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}