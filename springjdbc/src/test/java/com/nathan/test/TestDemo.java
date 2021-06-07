package com.nathan.test;

import com.nathan.bean.Car;
import com.nathan.bean.User;
import com.nathan.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author Martin
 * @create $2021-05-28-20:53
 **/
public class TestDemo {

    @Test
    public void testInsertMethod() throws  Exception{

        //创建 ApplicationContext 对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //创建 userdao对象
        UserDao userDao = context.getBean("userDao",UserDao.class);

        //创建User对象

        User user = new User();
        user.setUsername("贝吉塔");
        user.setPassword("123");

        int result = userDao.insertUser(user);

        System.out.println(result);

    }

    // 更新方法
    @Test
    public void testUpdateMethod() throws  Exception{

        //创建 ApplicationContext 对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //创建 userdao对象
        UserDao userDao = context.getBean("userDao",UserDao.class);

        //创建User对象

        User user = new User();
        user.setId(4);
        user.setUsername("卡卡特罗");
        user.setPassword("555");

        int result = userDao.updateUser(user);


    }
    // 删除方法
    @Test
    public void testDeleteMethod() throws  Exception{

        //创建 ApplicationContext 对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //创建 userdao对象
        UserDao userDao = context.getBean("userDao",UserDao.class);

        //创建User对象
        int result = userDao.deleteUser(4);


    }
    // 测试查询
    @Test
    public void testQueryMethod() throws  Exception{

        //创建 ApplicationContext 对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //创建 userdao对象
        UserDao userDao = context.getBean("userDao",UserDao.class);

       User user = userDao.findUserById(2);

        System.out.println(user);


    }

    @Test
    public void testQueryAllMethod() throws  Exception{

        //创建 ApplicationContext 对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //创建 userdao对象
        UserDao userDao = context.getBean("userDao",UserDao.class);

        //userlist本质是数组
        List<User> userList = userDao.findAll();
        System.out.println(userList);


    }
    @Test
    // 测试注解方法
    public void testInjection() throws  Exception{

        //创建 ApplicationContext 对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


//        User user = context.getBean("user",User.class);
        Car car = context.getBean("car",Car.class);
        System.out.println(car);


    }

}








