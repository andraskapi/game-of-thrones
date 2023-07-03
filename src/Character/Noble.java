package Character;

import Character.type.Gender;
import Character.type.House;

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
        if (coins.containsKey(coinType)) {
            int currentAmount = coins.get(coinType);
            coins.put(coinType, currentAmount + amount);
        } else {
            coins.put(coinType, amount);
        }
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

    public int getWealth() {
        int totalWealth = 0;

        for (Map.Entry<String, Integer> entry : coins.entrySet()) {
            String coinType = entry.getKey();
            int amount = entry.getValue();
            switch (coinType) {
                case "gold" -> totalWealth += amount * 100;
                case "silver" -> totalWealth += amount * 10;
                case "copper" -> totalWealth += amount;
            }
        }


        return totalWealth;


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
                " has " + getWealth() +
                " wealth in copper";
    }
}
