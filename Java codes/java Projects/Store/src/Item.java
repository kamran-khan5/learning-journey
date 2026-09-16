public class Item {
    private String name;
    private double price;
    private String highLevelType;
    private String type;

    public Item(String name, double price, String type, String highLevelType) {
        this.name = name;
        setPrice(price);
        this.type = type;
        this.highLevelType = highLevelType;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {

        return price;
    }

    public String getHighLevelType() {
        return highLevelType;
    }

    public void setPrice(double price) {
        this.price = price<=0?0:price;
    }

    public boolean equals(Item item) {
        if (item == null) {
            return false;
        }
        return this.name.equalsIgnoreCase(item.getName()) && this.price == item.getPrice()
                && this.highLevelType.equalsIgnoreCase(item.getHighLevelType()) && this.type.equalsIgnoreCase(item.getType());
    }
    @Override
    public String toString() {
        return String.format("Name: %s\nPrice: %.2f\nType: %s\nHigh-Level Type: %s",
                getName(), getPrice(), getType(), getHighLevelType());
    }

}
