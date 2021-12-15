package com.taoatao.controller;


import com.taoatao.entity.User;
import com.taoatao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author taoatao
 * @since 2021-04-21
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService    iUserService;
    @GetMapping("/getById")
    public String getById(String id){
        User u = iUserService.getById(id);
        return u.toString();
    }
    @GetMapping("/getById3")
    public String getById3(String id){
        User u = iUserService.getById(id);
        return u.toString();
    }

    @GetMapping("/getById2")
    public String getById2(String id){
        User u = iUserService.getById(id);
        return u.toString();
    }

    @GetMapping("/getById5")
    public String getById5(String id){
        User u = iUserService.getById(id);
        System.out.println(111233111);
        return u.toString();
    }
}
