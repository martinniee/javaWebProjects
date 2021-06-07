package com.nathan.test;

import com.nathan.spring.Car;
import com.nathan.spring.User;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Martin
 * @create $2021-05-28-15:00
 **/
public class TestDemo {

    @Test
    // 不使用spring时
    public void testNoString(){


        Car car = new Car();
        car.setName("宝马");
        car.setColor("白色");

        User user = new User();
        user.setUsername("张三");
        user.setAge(28);
        user.setCar(car);


        System.out.println("user=" + user);

    }
    @Test
    public void testUseSpring(){
        // 读取spring核心配置文件, 并且创建配置文件中的类的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = context.getBean("user",User.class);
        User user1 = context.getBean("user",User.class);

        System.out.println(user1);
    }
}
