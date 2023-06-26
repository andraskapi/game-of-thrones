package combat.type;

public enum MeleeWeaponType {
 KARD("SWORD"),
    BALTA("AXE"),
    BUZOGANY("MACE"),
    LANDZSA("SPEAR"),
    TOR("DAGGER");

    private String inEngilsh;

    MeleeWeaponType(String inEngilsh) {
        this.inEngilsh = inEngilsh;
    }

    public String getInEngilsh() {
        return inEngilsh;
    }
}
