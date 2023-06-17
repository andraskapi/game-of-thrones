import java.util.HashSet;
import java.util.Set;

public class Noble extends Character{
    private final Set<House> houses = new HashSet<>();
    private int wealth;

    public Noble(String name, String birthPlace, Gender gender) {
        super(name, birthPlace, gender);
    }
    public void addHouse (House house){
        houses.add(house);
    }
    public void removeHouse(House house){
        houses.remove(house);
    }



    @Override
    public String toString() {
        return getName() + " of " +
                "house " + houses +
                " has " + wealth +
                "gold dragons";
    }
}
