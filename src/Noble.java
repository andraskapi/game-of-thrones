import java.util.HashSet;
import java.util.Set;

public class Noble extends Character{
    private final Set<House> houses = new HashSet<>();

    private int wealth;


    public Noble(String name, String birthPlace, Gender gender, int wealth) {
        super(name, birthPlace, gender);
        this.wealth = wealth;

    }

    public void addHouse (House house){
        houses.add(house);
    }
    public void removeHouse(House house){
        houses.remove(house);
    }

    public Set<House> getHouses() {
        return houses;
    }

    public int getWealth() {
        return wealth;
    }

    public String getHousesAsString(Set<House> houses){
      String houseAsString = "";

       for (House house : houses
            ) {houseAsString += house.toString() + " ";

       }return houseAsString;
   }
    public void printHouseMotto() {
        for (House house : houses) {
            System.out.println(house.getInEngilsh());
        }
    }



    @Override
    public String toString() {
        return getName() + " of " +
                "house " + getHousesAsString(houses) +
                " has " + wealth +
                " gold dragons";
    }
}
