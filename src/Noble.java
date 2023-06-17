public class Noble extends Character{
    private House house;
    private int wealth;

    public Noble(String name, String birthPlace, Gender gender, House house, int wealth) {
        super(name, birthPlace, gender);
        this.house = house;
        this.wealth = wealth;
    }

    @Override
    public String toString() {
        return getName() + " of " +
                "house " + house +
                " has " + wealth +
                "gold dragons";
    }
}
