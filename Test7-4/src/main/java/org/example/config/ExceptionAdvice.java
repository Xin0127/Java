package org.example.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//注册当前类为一个Bean，结合SpringMVC一些api（接口，注解）
//可以完成统一请求响应的处理：
// （1）统一响应数据格式封装
// （2）统一异常处理
@ControllerAdvice
public class ExceptionAdvice {

    /**
     * 统一异常处理：
     * try{
     *     controller.请求映射方法
     * }catch(异常类型 e){
     *     调用@ExceptionHandler注解的方法（异常类型是捕获类型的子类）
     * }
     * 该异常处理的方法，http响应和请求映射方法设置方式一样
     * （1）返回类型String，返回视图
     * （2）@ResponseBody，返回json
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handle(Exception e){
        e.printStackTrace();
        Map<String, Object> map = new HashMap<>();
        map.put("ok", false);
        map.put("message", e.getMessage());
        return map;
    }
}
