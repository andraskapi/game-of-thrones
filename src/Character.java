import combat.Weapon;

import java.util.HashSet;
import java.util.Set;

public class Character implements Mortal {
    private String name;
    private final String birthPlace;
    private Gender gender;
    private static int populationCounter;
    private Set<Weapon> weapons = new HashSet<>();


    public Character(String name, String birthPlace, Gender gender) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;
        populationCounter++;
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);

    }

    public void removeWeapon(String weaponeName) {
        Weapon weaponToRemove = null;
        for (Weapon weapon : weapons) {
            if (weapon.getName().equals(weaponeName)) {
                weaponToRemove = weapon;
            }

        }
        if (weaponToRemove != null) {
            weapons.remove(weaponToRemove);
        }
    }


    public Set<Weapon> getWeapons() {
        return weapons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (this.gender == Gender.MALE && gender == Gender.EUNUCH) {
            this.gender = gender;  // a konstruktórhoz hozzá kell adni a gendert vagy nem fog működni ezzel a kóddal
        }

    }

    public static void getWorldPopulation() {
        System.out.println("The population is " + populationCounter);
    }


    @Override
    public void die() {  //majd újra megnézni
        if (this instanceof Noble noble) {
            noble.printHouseMotto();
            populationCounter--;

        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", gender=" + gender +
                ", weapons=" + weapons +
                '}';
    }
}

