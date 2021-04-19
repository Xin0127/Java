package org.example.demo;

public class Parent {
    public void init(){

    }
    public void service(){
        doGet();//先找子类
    }
    public void destroy(){}
    public void doGet(){

    }
}
