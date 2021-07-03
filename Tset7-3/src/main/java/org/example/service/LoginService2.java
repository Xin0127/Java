package org.example.service;

import lombok.Getter;
import org.example.controller.LoginController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Getter
public class LoginService2 {

    private LoginController.Tmp tmp;

//    @Autowired
//    public LoginService2(LoginController.Tmp tmp){
//        this.tmp = tmp;
//    }

    @Autowired
    public LoginService2(@Qualifier("tmp") LoginController.Tmp tmp2){
        this.tmp = tmp2;
    }
}
