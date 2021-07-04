package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//配置类实现WebMvcConfigurer接口，可以重写接口方法
//实现自定义webmvc的部分功能
@Configuration
public class AppConfig implements WebMvcConfigurer {
    //服务路径，添加前缀
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //我们这里是简单的将所有服务路径，都添加/api前缀
        configurer.addPathPrefix("api", c->true);
    }
}
