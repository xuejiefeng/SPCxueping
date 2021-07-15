package com.personal.spcxueping.Controller;

import com.alibaba.fastjson.JSON;
import com.personal.spcxueping.dao.Pingjia;
import com.personal.spcxueping.dao.ReturnSourceBySearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class AppraiseController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //根据用户ID查询其评价
    @RequestMapping(value = "/selectappraisebyuserid")
    public @ResponseBody String SelectAppraiseByUserId(String id){
        String sql="SELECT * FROM pingjia WHERE userid=?;";
        List<Map<String,Object>> appraises=null;
        appraises=jdbcTemplate.queryForList(sql,id);
        String Appraises= JSON.toJSONString(appraises);
        return Appraises;
    }

    //根据用户ID查询其评价并按时间降序排列
    @RequestMapping(value = "/selectappraiseorderbytimedesc")
    public @ResponseBody String SelectAppraiseOrderByTimeDesc(String id){
        String sql="SELECT * FROM pingjia WHERE userid=? ORDER BY reltime DESC;";
        List<Map<String,Object>> appraises=null;
        appraises=jdbcTemplate.queryForList(sql,id);
        String Appraises= JSON.toJSONString(appraises);
        return Appraises;
    }

    //根据用户ID查询其评价并按时间升序排列
    @RequestMapping(value = "/selectappraiseorderbytimeasc")
    public @ResponseBody String SelectAppraiseOrderByTimeAsc(String id){
        String sql="SELECT * FROM pingjia WHERE userid=? ORDER BY reltime ASC;";
        List<Map<String,Object>> appraises=null;
        appraises=jdbcTemplate.queryForList(sql,id);
        String Appraises= JSON.toJSONString(appraises);
        return Appraises;
    }

    //查询所有评价
    @RequestMapping(value = "/selectallappraise")
    public @ResponseBody String SelectAllAppraise(){
        String sql="SELECT * FROM pingjia;";
        List<Map<String,Object>> appraises=null;
        appraises=jdbcTemplate.queryForList(sql);
        String Appraises= JSON.toJSONString(appraises);
        return Appraises;
    }

    //查询所有评价并按时间升序排列
    @RequestMapping(value = "/selectallappraiseorderbytimeasc")
    public @ResponseBody String SelectAllAppraiseOrderByTimeAsc(){
        String sql="SELECT * FROM pingjia ORDER BY reltime ASC;";
        List<Map<String,Object>> appraises=null;
        appraises=jdbcTemplate.queryForList(sql);
        String Appraises= JSON.toJSONString(appraises);
        return Appraises;
    }

    //查询所有评价并按时间降序排列
    @RequestMapping(value = "/selectallappraiseorderbytimedesc")
    public @ResponseBody String SelectAllAppraiseOrderByTimeDesc(){
        String sql="SELECT * FROM pingjia ORDER BY reltime DESC;";
        List<Map<String,Object>> appraises=null;
        appraises=jdbcTemplate.queryForList(sql);
        String Appraises= JSON.toJSONString(appraises);
        return Appraises;
    }

    //通过搜索框搜索课程，并按合集形式返回
    @RequestMapping(value = "/searchcourse")
    public @ResponseBody List<ReturnSourceBySearch> SearchCource(String key){
        List<ReturnSourceBySearch> Courses=null;
        return Courses;
    }
}
