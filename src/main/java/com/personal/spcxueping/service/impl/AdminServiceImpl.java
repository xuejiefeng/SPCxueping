package com.personal.spcxueping.service.impl;

import com.personal.spcxueping.dao.Admin;
import com.personal.spcxueping.mapper.AdminMapper;
import com.personal.spcxueping.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements AdminService {



    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin queryadminById(String id) {

        return adminMapper.selectByPrimaryKey(id);
    }
}
