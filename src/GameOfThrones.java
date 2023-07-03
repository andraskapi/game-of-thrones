import Character.type.Gender;
import Character.type.House;
import Character.Noble;
import Character.Character;
import combat.MeleeWeapon;
import combat.RangedWeapon;
import combat.Weapon;
import combat.type.MeleeWeaponType;
import combat.type.RangedWeaponType;

import java.util.Set;

public class GameOfThrones {
    public static void main(String[] args) {

        Character joko = new Character("Joko Jolo", "Vasvidék", Gender.FEMALE);
        Character ceres = new Noble("Ceres", "Lapátfalva", Gender.FEMALE,  Set.of(House.LANNISTER));
        Character latyak = new Noble("Latyak", "Bivalybasnad", Gender.FEMALE,  Set.of(House.GREYJOY));
        Character foldi = new Character("Földi", "Lapátfalva", Gender.MALE);
        Character gazos = new Noble("Gázos", "Fingföld", Gender.MALE,  Set.of(House.BARATHEON));
        Weapon balta = new MeleeWeapon("Skalpolo", 150, MeleeWeaponType.BALTA);
        Character arya = new Noble("Arya", "Winterfell", Gender.FEMALE,  Set.of(House.STARK));

        arya.addWeapon(new MeleeWeapon("Valyrian steel dagger", 20, MeleeWeaponType.TOR));
        arya.addWeapon(new RangedWeapon("Stolen bow", 10, 40, 5, RangedWeaponType.IJ));



//        System.out.println(arya);
//        System.out.println(arya.getWeapons().toString());
//        arya.removeWeapon("Stolen bow");
//        System.out.println(arya);
//        System.out.println(arya.getWeapons());
        arya.addCoins("gold",1);
        arya.addCoins("silver",1);
        arya.addCoins("silver",2);
        arya.addCoins("copper",3);


        System.out.println(arya);






    }
}
