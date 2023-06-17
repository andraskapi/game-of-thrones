public class GameOfThrones {
    public static void main(String[] args) {

        Character joko = new Character("Joko Jolo","Vasvidék",Gender.FEMALE);
        joko.setGender(Gender.EUNUCH);
        System.out.println(joko);
        Noble ceres = new Noble("Ceres","Lapátfalva",Gender.FEMALE);
        ceres.addHouse(House.GREYJOY);
        ceres.addHouse(House.LANNISTER);
        System.out.println(ceres);





    }
}
