package com.saketh.car.sbeans;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements IEngine{
    @Override
    public String start()
    {
        return "Petrol Engine Started";
    }
    @Override
    public String stop()
    {
        return "Petrol Engine Stopped";
    }
}
