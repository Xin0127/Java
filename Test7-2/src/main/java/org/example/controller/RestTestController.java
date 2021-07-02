package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
