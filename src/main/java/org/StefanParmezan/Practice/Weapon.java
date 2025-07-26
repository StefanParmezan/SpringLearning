package org.StefanParmezan.Practice;

@FunctionalInterface
interface Weapon {
    void damage(User damager, User enemy);
}
