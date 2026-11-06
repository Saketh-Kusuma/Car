package com.saketh.car.sbeans;

import org.springframework.stereotype.Component;

@Component("cngEngine")
public class CNGEngine implements IEngine {

    @Override
    public String start() {
        return "CNG Engine Started";
    }

    @Override
    public String stop() {
        return "CNG Engine Stopped";
    }
}
