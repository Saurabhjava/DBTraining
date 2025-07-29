package com.db;

import com.db.bean.Car;
import com.db.bean.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringbootProjectApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(FirstSpringbootProjectApplication.class, args);

		Car honda=ctx.getBean(Car.class);
		honda.runCar();
	}

}
