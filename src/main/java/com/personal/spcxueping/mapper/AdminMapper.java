package com.personal.spcxueping.mapper;

import com.personal.spcxueping.dao.Admin;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AdminMapper {
    int deleteByPrimaryKey(String userid);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}