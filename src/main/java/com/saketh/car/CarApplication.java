package com.saketh.car;

import com.saketh.car.sbeans.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CarApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CarApplication.class, args);
        Vehicle car = ctx.getBean("car", Vehicle.class);
        car.start();
        car.stop();
        ((ConfigurableApplicationContext) ctx).close();
    }

}
