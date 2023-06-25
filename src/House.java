import java.util.HashMap;
import java.util.Map;

public enum House {
    STARK("Winter is Coming","Közeleg a tél","wolf"),
    LANNISTER("Hear Me Roar","Halld üvöltésem","lion"),
    TARGARYEN("Fire and Blood","Tűz és vér","dragon"),
    BARATHEON("Ours is the Fury","Miénk a harag","stag"),
    GREYJOY("We Do Not Sow","Mi nem vetünk","kraken"),
    TYRELl("Growing Strong","rőssé növünk","rose");
    private String inEngilsh;
    private String inHungarian;
    private String sigil;
    House(String inEngilsh, String inHungarian, String sigil){
        this.inEngilsh = inEngilsh;
        this.inHungarian = inHungarian;
        this.sigil = sigil;
    }

    public String getInEngilsh() {
        return inEngilsh;
    }

    public String getInHungarian() {
        return inHungarian;
    }
}
