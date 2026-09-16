public class Snack extends Consumable {
    private String texture;

    public Snack(String name, double price, int calories, int expiryDaysLeft, String texture) {
        super(name, price, "Snack", calories, expiryDaysLeft);
        this.texture = texture;
    }

    public String getTexture() {
        return texture;
    }

    @Override
    public boolean equals(Item item) {
        if (!super.equals(item)) {
            return false;
        }
        Snack snack = (Snack) item;
        return texture.equals(snack.texture);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nTexture: %s", getTexture());
    }

}
