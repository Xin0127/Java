package org.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/1")
    public String t1(){
        return "redirect:/home1.html";
    }

    @RequestMapping("/2")
    @ResponseBody
    public String t2(){
        return "来了";
    }

    @RequestMapping("/3")
    @ResponseBody
    public Object t3(){
        Map<String, Object> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", false);
        map.put("3", "嗨喽");
        return map;
    }

    @RequestMapping("/4")
    public Object t4(){
        Map<String, Object> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", false);
        map.put("3", "嗨喽");
        return ResponseEntity.status(200)
                .body(map);
    }

    @RequestMapping("/5")
    @ResponseBody
    public String test5(){
        return null;
    }

    @RequestMapping("/6")
    @ResponseBody
    public Object test6(){
        return null;
    }
}
