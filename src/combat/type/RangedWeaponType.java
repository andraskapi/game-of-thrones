package combat.type;

public enum RangedWeaponType {
    IJ("BOW"),
    SZAMSZERIJ("CROSSBOW"),
    DOBOKES("THROWING_KNIFE"),
    GERELY("JAVELIN");
    private String inEngilsh;

    RangedWeaponType(String inEngilsh) {
        this.inEngilsh = inEngilsh;
    }

    public String getInEngilsh() {
        return inEngilsh;
    }
}
