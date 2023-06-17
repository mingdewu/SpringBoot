package com.example.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.training.entity.UserInfo;
import com.example.training.mapper.UserInfoMapper;

@Controller
public class DemoController {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @RequestMapping
    public String index(Model model) {
        List<UserInfo> list = userInfoMapper.selectAll();
        model.addAttribute("userInfo", list);
        return "index";
    }
}
