package com.personal.spcxueping.mapper;

import com.personal.spcxueping.dao.Plat_user;

public interface Plat_userMapper {
    int deleteByPrimaryKey(String userid);

    int insert(Plat_user record);

    int insertSelective(Plat_user record);

    Plat_user selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(Plat_user record);

    int updateByPrimaryKey(Plat_user record);
}