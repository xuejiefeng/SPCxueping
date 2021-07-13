package com.personal.spcxueping.mapper;

import com.personal.spcxueping.dao.Pingjia;
import com.personal.spcxueping.dao.PingjiaKey;

public interface PingjiaMapper {
    int deleteByPrimaryKey(PingjiaKey key);

    int insert(Pingjia record);

    int insertSelective(Pingjia record);

    Pingjia selectByPrimaryKey(PingjiaKey key);

    int updateByPrimaryKeySelective(Pingjia record);

    int updateByPrimaryKey(Pingjia record);
}