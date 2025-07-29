package com.config;

import com.bean.Department;
import com.bean.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bean")
public class MyConfig {
    /*@Bean
    public HelloWorld getHelloWorld() {
        HelloWorld obj=new HelloWorld();
        obj.setName("Rashimi");
        return obj;
    }*/

//    @Bean
//    public Employee getEmp() {
//        return new Employee();
//    }
//    @Bean
//    public Department getDept(){
//        Department d=new Department();
//        d.setEmployee(getEmp());
//        return d;
//    }
}
