package com.example.di_exercise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyService {
    private final MyComponent myComponent;

    @Value("${spring.HelloMessage}")
    private String helloMessage;

    private MyService(MyComponent myComponent){
        this.myComponent = myComponent;
        System.out.println(MyService.class.getName() + " created.");
    }

    public String getHelloMessage(){
        return helloMessage;
    }

    public String getName(){
        System.out.println(getClass().getName() + " called.");
        return myComponent.getMyComponentName();
    }

}
