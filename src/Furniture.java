public class Furniture extends Item{

    private boolean isDamaged;

    public Furniture(String itemName, boolean isDamaged) {
        super(itemName);
        this.isDamaged = isDamaged;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    public void setDamaged(boolean damaged) {
        isDamaged = damaged;
    }
}
