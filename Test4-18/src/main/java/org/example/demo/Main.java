package org.example.demo;

public class Main {
    public static void main(String[] args) {
        //方法多态的体现：从下到上查找方法，找到就执行
        Child servlet=new Child();
        servlet.init();
        servlet.service();
    }
}
