package com.xxx.controller;

import com.xxx.common.lang.Result;
import com.xxx.entity.User;
import com.xxx.service.IUserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wukong
 * @since 2022-07-09
 */
@Controller
@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @RequiresAuthentication
    @GetMapping("/user")
    public Object getUser(){
        User user =  userService.getById(1);
        return Result.succ(user);
    }

    @PostMapping("/save")
    public Object save(@Validated @RequestBody User user){

        return Result.succ(user);
    }

}
