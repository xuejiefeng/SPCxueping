package com.personal.spcxueping.mapper;

import com.personal.spcxueping.dao.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(String userid);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}