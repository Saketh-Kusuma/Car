package com.saketh.car.sbeans;

import org.springframework.stereotype.Component;

@Component("diselEngine")
public class DiselEngine implements IEngine {
    @Override
    public String start() {
        return "Disel Engine Started";
    }

    @Override
    public String stop() {
        return "Disel Engine Stopped";
    }
}
