package org.example.config;

import lombok.Getter;
import lombok.Setter;
import org.example.controller.LoginController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AppTmp test(LoginController.Tmp tmpFactory){
        AppTmp tmp = new AppTmp();
        tmp.setTmp(tmpFactory);
        return tmp;
    }

    @Getter
    @Setter
    public static class AppTmp{
        private LoginController.Tmp tmp;
    }
}
