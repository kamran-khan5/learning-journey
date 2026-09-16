public class NonConsumable extends Item {
    private int maxNumUsages;

    public NonConsumable(String name, double price, String type, int maxNumUsages) {
        super(name, price, type, "Non Consumable");
        setMaxNumUsages(maxNumUsages);
    }

    public int getMaxNumUsages() {
        return maxNumUsages;
    }
    public void setMaxNumUsages(int maxNumUsages){
        this.maxNumUsages=maxNumUsages>0?maxNumUsages:1;
    }

    @Override
    public boolean equals(Item item) {
        if (!super.equals(item)) {
            return false;
        }
        NonConsumable nonconsumable = (NonConsumable) item;
        return this.maxNumUsages == nonconsumable.maxNumUsages;
    }
    @Override
    public String toString() {
        //concatenate parent class toString Function and new string using super
        return super.toString() + String.format("\nType: %s\nMax Number of Usages: %d", getType(),maxNumUsages);
    }

}
