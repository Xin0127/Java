package org.example.demo;

public class Parent {

    public void init(){}

    public void service(){
        //如果请求方法是GET
        //if("GET".equals(req.method))
        doGet();
    }

    public void destroy(){}

    public void doGet(){
        System.out.println("parent doGet");
    }
}
