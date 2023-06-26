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

    @Override
    public String toString() {
        return "RangedWeapon{" +
                "ammunition=" + ammunition +
                ", type=" + type +
                '}';
    }
}
