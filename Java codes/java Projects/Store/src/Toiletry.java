public class Toiletry extends NonConsumable {
    private int packSize;
    private boolean isBrandName;

    public Toiletry(String name, double price, int maxNumUsages, int packSize, String isBrandName) {
        super(name, price, "Toiletry", maxNumUsages);
        this.packSize = packSize;
        setBrandName(isBrandName);
    }

    public int getPackSize() {
        return packSize;
    }

    public boolean getIsBrandName() {
        return isBrandName;
    }

    public void setBrandName(String brandName) {
        this.isBrandName=brandName.equalsIgnoreCase("yes");
    }

    @Override
    public boolean equals(Item item) {
        if (!super.equals(item)) {
            return false;
        }
        Toiletry toiletry = (Toiletry) item;
        return packSize == toiletry.packSize && isBrandName == toiletry.isBrandName;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nPack Size: %d\nBrand Name: %s",
                packSize, getIsBrandName() ? "Yes" : "No");
    }



}
