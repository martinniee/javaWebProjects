package com.nathan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Martin
 * @create $2021-05-24-23:47
 **/
public class JdbcDemo {
    // 先抛出异常,放置出现错误红线
    public static void main(String[] args) throws Exception {

        String driverName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql:///dv";
        String username= "root";
        String password = "123456";

        // 1、通过反射创建mysql驱动的对象
        // 2、把驱动对象加载到DriveManeger中
        Class.forName(driverName);
        // 3、获取Connector对象
        Connection conn = DriverManager.getConnection(url,username,password);
        // 4、获取Statement对象
        Statement stmt = conn.createStatement();
        // 5、执行sql语句,进行插入操作
        String sql = "insert into users(id,name,password) values(01,'martin','222');";
        // excuteUpdate是sql改变后的更新语句,返回
        int result = stmt.executeUpdate(sql);
        // 6、释放资源
        stmt.close();
        conn.close();
    }
}
