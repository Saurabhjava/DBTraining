package com.db.bean;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements  Engine{
    @Override
    public void start() {
        System.out.println("Petrol engine is running in this car");
    }
}
