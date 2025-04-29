package com.example.di_exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MyController {
    private final MyService myService;

    private MyController(MyService myService){
        this.myService = myService;
        System.out.println(MyController.class.getName() + " created.");
    }

    @GetMapping
    public String helloMessage(){
        return myService.getHelloMessage();
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println(getClass().getName() + " called.");
        return myService.getName();
    }
}
