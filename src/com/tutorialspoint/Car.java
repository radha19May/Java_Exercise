package com.tutorialspoint;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    private String message;

    public Car(String message) {
        super();
        this.message = message;
    }

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Driving a Car : " + message);
    }
}

