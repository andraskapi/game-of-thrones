import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Noble extends Character {
    private final Set<House> houses = new HashSet<>();

    private Map<String, Integer> coins = new HashMap();


    public Noble(String name, String birthPlace, Gender gender, Set<House> houses) {
        super(name, birthPlace, gender);
        this.houses.addAll(houses);


    }

    @Override
    public void addHouse(House house) {
        houses.add(house);
    }

    @Override
    public void removeHouse(House house) {
        houses.remove(house);
    }

    public Set<House> getHouses() {
        return houses;
    }

    @Override
    public void addCoins(String coinType, int amount) {
        coins.put(coinType, amount);
    }

    @Override
    public void removeCoins(String coinType, int amount) {
        Integer currentAmount = coins.get(coinType);
        if (currentAmount != null) {
            int newAmount = currentAmount - amount;
            if (newAmount <= 0) {
                coins.remove(coinType);
            } else {
                coins.replace(coinType, newAmount);
            }
        }
    }
    public void getWealth(Map<String, Integer> coin){
        //1 gold -> 10 silver -> 100 copper
        int gold;
        int silver;
        int copper;
        if (coins.get(
                coin.


    }


    public String getHousesAsString(Set<House> houses) {
        String houseAsString = "";

        for (House house : houses
        ) {
            houseAsString += house.toString() + " ";

        }
        return houseAsString;
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
                " has " + coins +
                " gold dragons" + getWeapons();
    }
}
