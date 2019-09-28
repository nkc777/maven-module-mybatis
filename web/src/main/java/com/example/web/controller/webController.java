package com.example.web.controller;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NiKaiChuang
 * @version 2019/9/28 15:25
 */
@RestController
public class webController {

    @Autowired
    private UserService userService;

    @RequestMapping("/web")
    public String web(){
        return userService.Sel(1).toString();
    }
}
