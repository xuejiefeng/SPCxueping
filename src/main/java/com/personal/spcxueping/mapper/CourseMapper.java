package com.personal.spcxueping.mapper;

import com.personal.spcxueping.dao.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(String cno);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String cno);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}