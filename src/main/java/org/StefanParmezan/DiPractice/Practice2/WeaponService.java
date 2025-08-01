package org.StefanParmezan.DiPractice.Practice2;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class WeaponService implements Weapon{
    Map<Weapons, String> weaponsMessages;

    public WeaponService(){
        weaponsMessages = Map.of(Weapons.BAZOOKA, "Boom", Weapons.SWORD, "Hyaa", Weapons.ATOMICBOMB, "BOOOOOOOOOOOOOOM!");
    }



    @Override
    public void damage(User damager, User enemy) {
        System.out.println("You damaged " + enemy.getName() + " on " + damager.getWeapon().getDamage() + " " + weaponsMessages.get(damager.getWeapon()));
    }

    public void deleteWeapon(User user) {
        user.setWeapon(Weapons.HAND);
    }

    public void setWeapon(User user, Weapons weapon) {
        user.setWeapon(weapon);
    }
}
