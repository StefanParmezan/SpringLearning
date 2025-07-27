package org.StefanParmezan.DiPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Mitsubishi implements Car {
    private final String name;
    private final Integer speed;
    private final Integer price;

    public Mitsubishi(String name, Integer speed, Integer price) {
        this.speed = speed;
        this.price = price;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getSpeed() {
        return this.speed;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public void Drive() {
        System.out.println("Mitsubishi " + this.getName() + " is driving" + " with speed " + this.speed);
    }
}
