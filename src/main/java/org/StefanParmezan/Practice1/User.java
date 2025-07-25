package org.StefanParmezan.Practice1;

//@Component
public class User {
    private final String name;

    public User() {
        this.name = "User";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
