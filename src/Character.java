public class Character  {
    private String name;
    private final String birthPlace;
    private Gender gender;

    public Character(String name, String birthPlace, Gender gender) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;
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


}
