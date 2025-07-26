package org.StefanParmezan.Beans_Di_Ioc;

//@Component
class User {
    private final String name;

    User() {
        this.name = "User";
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
