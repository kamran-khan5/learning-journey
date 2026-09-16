public class Consumable extends Item {
    private int calories;
    private int expiryDaysLeft;

    public Consumable(String name, double price, String type, int calories, int expiryDaysLeft) {
        super(name, price, type,"Consumable");

        setCalories(calories);
        setExpiryDaysLeft(expiryDaysLeft);
    }
    public void setExpiryDaysLeft(int expiryDaysLeft){
        this.expiryDaysLeft = expiryDaysLeft;
    }

    public void setCalories(int calories){
        this.calories=calories > 0 ? calories : 0;
    }
    public int getCalories() {
        return calories;
    }

    public int getExpiryDaysLeft() {
        return expiryDaysLeft;
    }

    @Override
    public boolean equals(Item item) {
        if (!super.equals(item)) {
            return false;
        }
        Consumable consumable = (Consumable) item;
        return this.calories == consumable.calories && this.expiryDaysLeft == consumable.expiryDaysLeft;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nPrice: %.2f\nHigh-level Type: %s\nType: %s\nCalories: %d\nExpiry Days Left: %d",
                getName(), getPrice(),getHighLevelType(), getType(), getCalories(), getExpiryDaysLeft());
    }


}
