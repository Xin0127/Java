package org.example;

import org.example.controller.LoginController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static Object LoginController;

    public static void main(String[] args) {
        //根据Spring配置文件路径创建容器：应用上下文对象
        //启动容器：加载xml配置文件，扫描
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //1.获取Bean对象的方式：类型获取
        //LoginController loginController= context.getBean(LoginController);
        //LoginController loginController2=
                //关闭容器
        ((ClassPathXmlApplicationContext) context).close();
    }
}