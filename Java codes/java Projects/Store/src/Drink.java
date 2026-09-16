public class Drink extends Consumable {
    private double liters;

    public Drink(String name, double price, int calories, int expiryDaysLeft, double liters) {
        super(name, price, "Drink", calories, expiryDaysLeft);
        setLiters(liters);
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters>0?liters:0.5;
    }

    @Override
    public boolean equals(Item item) {
        if (!super.equals(item)) {
            return false;
        }
        Drink drink = (Drink) item;
        return liters == drink.liters;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("\nLiters: %.2f", getLiters());
    }

}
