package com.example.di_exercise;

import org.springframework.stereotype.Component;

@Component
public class MyComponent{
    private final String myComponentName;

    private MyComponent(){
        this.myComponentName = "Mario";
        System.out.println(MyComponent.class.getName() + " created.");
    }

    public String getMyComponentName(){
        System.out.println(getClass().getName() + " called.");
        return myComponentName;
    }

}
