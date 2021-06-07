package com.nathan.controller;

import com.nathan.bean.User;
import com.nathan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Martin
 * @create $2021-06-05-9:02
 **/

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("add")
    public String addUser(User user){

        userDao.insertUser(user);
        return null ;
    }

    @RequestMapping("list")
    public  String list(Model model){

//        用户数据集合 userList
        List<User> userList = userDao.findAll();
        System.out.println("userList=" + userList);
//        封装 userList
        model.addAttribute("userList",userList);
//       返回到 user-list.jsp
        return "/user-list.jsp";

    }

}
