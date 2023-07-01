package combat;

import combat.type.MeleeWeaponType;

public class MeleeWeapon extends Weapon{
    private MeleeWeaponType type;


    public MeleeWeapon(String name, int damage, MeleeWeaponType type) {
        super(name, damage, 1);
        this.type = type;
    }

    public MeleeWeaponType getType() {
        return type;
    }

    public void setType(MeleeWeaponType type) {
        this.type = type;
    }

    @Override
    void attack() {

    }

    @Override
    public String toString() {
        return "a " + getType() + "named " + getName() + " with " + getDamage() + " damage ";
    }
}
