import java.util.HashMap;
import java.util.Map;

public enum House {
    STARK("Winter is Coming","Közeleg a tél"),
    LANNISTER("Hear Me Roar","Halld üvöltésem"),
    TARGARYEN("Fire and Blood","Tűz és vér"),
    BARATHEON("Ours is the Fury","Miénk a harag"),
    GREYJOY("We Do Not Sow","Mi nem vetünk"),
    TYRELl("Growing Strong","rőssé növünk");
    private String inEngilsh;
    private String inHungarian;
    House(String inEngilsh, String inHungarian){
        this.inEngilsh = inEngilsh;
        this.inHungarian = inHungarian;
    }

    public String getInEngilsh() {
        return inEngilsh;
    }

    public String getInHungarian() {
        return inHungarian;
    }
}
