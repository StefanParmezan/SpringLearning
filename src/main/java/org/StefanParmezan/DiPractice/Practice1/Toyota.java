package org.StefanParmezan.DiPractice.Practice1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Toyota implements Car {
    private final String name;
    private final Integer speed;
    private final Integer price;

    public Toyota(String name, Integer speed, Integer price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
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
        System.out.println("Toyota " + this.getName() + " is driving" + " with speed " + this.getSpeed());
    }
}
