package combat;

public abstract class Weapon {
    private String name;
    private int damage;
    private int range;
    public Weapon(String name, int damage, int range) {
        this.name = name;
        this.damage = damage;
        this.range = range;
    }

    abstract void attack();
}
