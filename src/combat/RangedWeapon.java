package combat;

import combat.type.RangedWeaponType;

public class RangedWeapon extends Weapon{
    private int ammunition;
    private RangedWeaponType type;
    public RangedWeapon(String name, int damage, int range, int ammunition, RangedWeaponType type) {
        super(name, damage, range);
        this.type = type;
        this.ammunition = ammunition;

    }

    public void getAmmunition(){
        System.out.println(ammunition + " ammo left");
    }


    @Override
    void attack() {
        ammunition--;

    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    public RangedWeaponType getType() {
        return type;
    }

    public void setType(RangedWeaponType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "a(n) " + getType() + " named " + getName() + " with " + getDamage() + " damage \n"  +
                 " and with range of " + getRange() + " m";
    }
}
