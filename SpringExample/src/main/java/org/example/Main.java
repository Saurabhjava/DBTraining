package org.example;

import com.bean.Department;
import com.bean.HelloWorld;
import com.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
         ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
//        HelloWorld h=ctx.getBean(HelloWorld.class);
//        h.setName("Amit");
//        System.out.println(h.sayHello()); //

        Department d=ctx.getBean(Department.class);
        d.printDept();
       // System.out.println(d.getDeptName());
    }
}