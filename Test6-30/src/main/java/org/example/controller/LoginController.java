package org.example.controller;

import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("singleton")//作用域为单例模式，不设置默认就是单例模式
//@Scope("prototype")//作用域为原型模式，每次获取都是新的对象
public class LoginController {

    @Autowired
    private LoginService loginService2;

    /**
     * 当前类能被Spring扫描到的情况下
     * 方法加上@Bean注解可以注册Bean：
     * 方法名作为Bean的名称/id，Bean对象为返回值
     */
    @Bean
    public Tmp tmp(){
        return new Tmp();
    }

    public static class Tmp{

    }
}
