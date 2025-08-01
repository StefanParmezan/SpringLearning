package org.StefanParmezan.DiPractice.Practice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ZoneService {
    Map<User, Weapons> userWeapons;
    WeaponService weaponService;

    @Autowired
    public ZoneService(WeaponService weaponService) {
        this.weaponService = weaponService;
        userWeapons = new HashMap<User, Weapons>();
    }

    public void setPveZone(User user) {
        userWeapons.put(user, user.getWeapon());
        weaponService.deleteWeapon(user);
    }

    public void setPvpZone(User user) {
        if (userWeapons.containsKey(user)) {
            weaponService.setWeapon(user, userWeapons.get(user));
        } else {
            weaponService.setWeapon(user, user.getWeapon());
        }
    }
}
