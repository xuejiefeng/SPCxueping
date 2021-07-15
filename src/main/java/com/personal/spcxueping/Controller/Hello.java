package com.personal.spcxueping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Hello {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("Hello")
    public String sayHello(){
        String sql="SELECT * FROM plat_user;";
        String users;
        List<Map<String, Object>> list=null;
        list=jdbcTemplate.queryForList(sql);
        Map<String,Object> map;
        map=list.get(0);
        System.out.println(map.get("userid"));
        return null;
    }
}
