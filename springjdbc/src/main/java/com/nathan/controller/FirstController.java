package com.nathan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Martin
 * @create $2021-06-05-7:22
 **/

@Controller
@RequestMapping("hello")
public class FirstController {

    @RequestMapping("world")
    public String main(String[] args) {
        System.out.println("这是我的第一个springmvc项目");

        return null;
    }
}
