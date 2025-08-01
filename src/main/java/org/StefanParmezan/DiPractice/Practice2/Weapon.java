package org.StefanParmezan.DiPractice.Practice2;

@FunctionalInterface
interface Weapon {
    void damage(User damager, User enemy);
}
