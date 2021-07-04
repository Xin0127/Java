package org.example.controller;

import org.example.model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class RestTestController {

    @GetMapping("/1")
    public Object t1(){
        Map<String, Object> map = new HashMap<>();
        map.put("1", 11111);
        map.put("2", true);
        map.put("3", "ok");
        return map;
    }

    @PostMapping("/2")
    public Object t2(){
        Map<String, Object> map = new HashMap<>();
        map.put("1", 22222);
        map.put("2", true);
        map.put("3", "....");
        return map;
    }

    @RequestMapping("/user/{id}")
    public Object user(@PathVariable Integer id){
        System.out.println("========="+id);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "张三");
        map.put("password", "123");
        map.put("email", "xxx@qq.com");
        return map;
    }

    @RequestMapping("/3")
    public Object t3(@RequestParam String username,
                     @RequestParam(required = false) Integer i1,
                     @RequestParam(required = false) MultipartFile head){
        System.out.printf("username=%s, i1=%s%n", username, i1);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "张三");
        map.put("password", "123");
        map.put("email", "xxx@qq.com");
        return map;
    }

    @RequestMapping("/4")
    public Object t4(User user,
                     @RequestPart MultipartFile head){
        System.out.printf("==============%s%n", user);
        return null;
    }

    @RequestMapping("/5")
    public Object t5(@RequestBody User user){
        System.out.printf("==============%s%n", user);
        return null;
    }

    @RequestMapping("/6")
    public Object t6(){
        int i = 1/0;
        return null;
    }
}
