package com.db.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

   // @Autowired
    //@Qualifier("petrolEngine")
    private Engine engine;

    @Autowired //this is not required, it's optional
    public Car(@Qualifier("dieselEngine") Engine engine){
        this.engine=engine;
    }
   public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void runCar(){
        System.out.println("Car is started");
        engine.start();
    }
}
