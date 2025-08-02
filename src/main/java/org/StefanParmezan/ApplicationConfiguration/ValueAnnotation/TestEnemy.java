package org.StefanParmezan.ApplicationConfiguration.ValueAnnotation;

public class TestEnemy extends Enemy{

    public TestEnemy(Weapon weapon) {
        super(weapon);
    }

    @Override
    public Weapon getWeapon() {
        return super.getWeapon();
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "testWeapon=" + this.getWeapon() +
                '}';
    }
}
