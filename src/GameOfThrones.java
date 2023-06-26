import combat.MeleeWeapon;
import combat.Weapon;
import combat.type.MeleeWeaponType;

import java.util.Set;

public class GameOfThrones {
    public static void main(String[] args) {

        Character joko = new Character("Joko Jolo","Vasvidék",Gender.FEMALE);
        joko.setGender(Gender.EUNUCH);
        System.out.println(joko);
        Character ceres = new Noble("Ceres","Lapátfalva",Gender.FEMALE,784700, Set.of(House.LANNISTER));
        Character latyak = new Noble("Latyak","Bivalybasnad",Gender.FEMALE,4770,Set.of(House.GREYJOY));
        Character foldi = new Character("Földi","Lapátfalva",Gender.MALE);
        Character gazos = new Noble("Gázos","Fingföld",Gender.MALE,50010,Set.of(House.BARATHEON));
        Weapon balta = new MeleeWeapon("Skalpolo",150, MeleeWeaponType.BALTA);

        ((Noble) ceres).addHouse(House.GREYJOY);
        System.out.println(ceres);
        Character.getWorldPopulation();
        System.out.println(latyak.getName());
        System.out.println(((Noble) ceres).getHouses());
        System.out.println(House.LANNISTER.getSigil());
        System.out.println(foldi);

        ceres.die();

        Character.getWorldPopulation();









    }
}
