package org.StefanParmezan.ApplicationConfiguration.BeanAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Entity {
    private final String name;
    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
