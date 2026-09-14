public class Weapon extends Item{

    private Character blood;
    private Character fingerPrints;

    public Weapon(String itemName) {
        super(itemName);
    }

    public Character getBlood() {
        return blood;
    }

    public void setBlood(Character blood) {
        this.blood = blood;
    }

    public Character getFingerPrints() {
        return fingerPrints;
    }

    public void setFingerPrints(Character fingerPrints) {
        this.fingerPrints = fingerPrints;
    }
}
