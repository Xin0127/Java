package org.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        //方法多态的体现: 从下到上查找方法，找到就执行
//        Child servlet = new Child();
//        servlet.init();
//        servlet.service();
        User user = new User();
        user.setUsername("阿汤哥");
        user.setPassword("随便");
        ObjectMapper mapper = new ObjectMapper();
        //把对象序列化为json字符串
        String json = mapper.writeValueAsString(user);
        System.out.println(json);

        String input = "{\"username\":\"小汤\",\"password\":\"随便\"}";
        //把json字符串反序列化为一个java对象
        User u2 = mapper.readValue(input, User.class);
        System.out.println(u2);

        //json字符串中的键，必须在类的属性中存在，否则反序列化会失败
        String input3 = "{\"username1\":\"小汤\",\"password\":\"随便\"}";
        //把json字符串反序列化为一个java对象
        User u3 = mapper.readValue(input, User.class);
        System.out.println(u3);
    }
}
