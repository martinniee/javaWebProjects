package com.nathan.dao;

import com.nathan.bean.User;

import java.util.List;

/**
 * @author Martin
 * @create $2021-05-28-21:16
 **/
public interface UserDao {

    public int insertUser(User user);

    public int updateUser(User user);

    public int deleteUser(Integer id);

    public User findUserById(Integer id);

    public List<User> findAll();


}
