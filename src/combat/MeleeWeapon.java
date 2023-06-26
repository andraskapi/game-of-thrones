package combat;

import combat.type.MeleeWeaponType;

public class MeleeWeapon extends Weapon{
    private MeleeWeaponType type;


    public MeleeWeapon(String name, int damage, MeleeWeaponType type) {
        super(name, damage, 1);
        this.type = type;
    }

    @Override
    void attack() {

    }

}
