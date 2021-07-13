package com.personal.spcxueping.mapper;

import com.personal.spcxueping.dao.College;

public interface CollegeMapper {
    int deleteByPrimaryKey(String coid);

    int insert(College record);

    int insertSelective(College record);

    College selectByPrimaryKey(String coid);

    int updateByPrimaryKeySelective(College record);

    int updateByPrimaryKey(College record);
}