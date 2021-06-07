package com.nathan.dao.impl;

import com.nathan.bean.User;
import com.nathan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Martin
 * @create $2021-05-28-21:23
 **/

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    // 私有属性
    @Autowired
   private JdbcTemplate jdbcTemplate ;

    // 生成get set方法


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 插入用户的方法
    public int insertUser(User user) {
        // 准备sql语句
        String sql = "insert into users (name,password) values(?,?)";
        // 插入数据,更新操作
        return jdbcTemplate.update(sql, user.getUsername(),user.getPassword());
    }


     //修改用户的方法
    public int updateUser(User user)
    {
            // sql语句
            String sql = "update users set name = ? , password = ? where id =? ";
            // 使用jdbc模板处理,
            return jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getId());

    }

    public int deleteUser(Integer id) {
        String sql = "delete from users where id = ? ";

        return jdbcTemplate.update(sql,id);
    }

    public User findUserById(Integer id) {

        String sql = "select id ,username, password from users where id = ? ";



        return jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            public User mapRow(ResultSet rs, int i) throws SQLException {
                User  user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        }, id);
    }

    public List<User> findAll() {
        String sql = "select id ,username,password from users";



        return jdbcTemplate.query(sql, new RowMapper<User>() {
            public User mapRow(ResultSet rs, int i) throws SQLException {
                User  user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        });
    }
}
