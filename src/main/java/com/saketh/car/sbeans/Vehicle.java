package com.saketh.car.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("car")
public class Vehicle {
    private final IEngine engine;

    public Vehicle(ApplicationContext context, @Value("${engine.bean.name}") String beanName) {
        this.engine = context.getBean(beanName, IEngine.class);
    }

    public void start() {
        System.out.println("A Car with " + engine.start());
    }

    public void stop() {
        System.out.println("A Car with " + engine.stop());
    }
}
