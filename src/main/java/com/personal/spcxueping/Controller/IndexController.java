package com.personal.spcxueping.Controller;



import com.personal.spcxueping.dao.Admin;
import com.personal.spcxueping.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/admin")
    public @ResponseBody  Object admin(String id)
    {

        Admin admin = adminService.queryadminById(id);

        return admin ;
    }

}
