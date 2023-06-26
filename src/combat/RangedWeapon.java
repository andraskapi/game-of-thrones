package combat;

import combat.type.RangedWeaponType;

public class RangedWeapon extends Weapon{
    static int ammunition;
    private RangedWeaponType type;
    public RangedWeapon(String name, int damage, int range, RangedWeaponType type) {
        super(name, damage, range);
        this.type = type;

    }
    public static void getAmmunition(){
        System.out.println(ammunition + " ammo left");
    }

    @Override
    void attack() {
        ammunition--;

    }
}
