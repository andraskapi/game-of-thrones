package combat;

public class RangedWeapon extends Weapon{
    static int ammunition;
    public RangedWeapon(String name, int damage, int range) {
        super(name, damage, range);

    }
    public static void getAmmunition(){
        System.out.println(ammunition + " ammo left");
    }

    @Override
    void attack() {
        ammunition--;

    }
}
