public class GameOfThrones {
    public static void main(String[] args) {

        Character joko = new Character("Joko Jolo","Vasvidék",Gender.FEMALE);
        joko.setGender(Gender.EUNUCH);
        System.out.println(joko);
        Noble ceres = new Noble("Ceres","Lapátfalva",Gender.FEMALE,784700);
        Noble latyak = new Noble("Latyak","Bivalybasnad",Gender.FEMALE,4770);
        Character foldi = new Character("Földi","Lapátfalva",Gender.MALE);
        Noble gazos = new Noble("Gázos","Fingföld",Gender.MALE,50010);

        ceres.addHouse(House.GREYJOY);
        ceres.addHouse(House.LANNISTER);
        System.out.println(ceres);
        Character.getWorldPopulation();
        latyak.addHouse(House.STARK);
        gazos.addHouse(House.TYRELl);
        System.out.println(latyak.getName());
        System.out.println(ceres.getHouses());
        System.out.println(House.LANNISTER.getSigil());
        ceres.die();

        Character.getWorldPopulation();









    }
}
