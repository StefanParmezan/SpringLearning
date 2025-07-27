package org.StefanParmezan.DiPractice;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Driver {
    Car car;

    public Driver(Car car){
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}
