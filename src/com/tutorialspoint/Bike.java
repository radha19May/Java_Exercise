package com.tutorialspoint;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Driving a Bike : " + message);
    }
}