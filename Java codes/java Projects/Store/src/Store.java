import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Store {
    private ArrayList<Item> itemList;

    public Store() {
        itemList = new ArrayList<>();
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void addToItemList(Item item) {//for single idem
        itemList.add(item);
    }

    public void addToItemList(Item[] items) {
        itemList.addAll(Arrays.asList(items));
    }

    public static int compareFinalUsageDate(Item item1, Item item2, double rateOfUsage) {
        double daysLeft1, daysLeft2;
        if (item1 instanceof Consumable) {

            Consumable con1 = (Consumable) item1;
            daysLeft1 = con1.getExpiryDaysLeft();
        } else {
            NonConsumable nonCon1 = (NonConsumable) item1;
            daysLeft1 = nonCon1.getMaxNumUsages() / rateOfUsage;
        }

        if (item2 instanceof Consumable) {
            Consumable con2 = (Consumable) item2;
            daysLeft2 = con2.getExpiryDaysLeft();
        } else {
            NonConsumable nonCon2 = (NonConsumable) item2;
            daysLeft2 = nonCon2.getMaxNumUsages() / rateOfUsage;
        }

        if (daysLeft1 < daysLeft2) {
            return -1;
        } else if (daysLeft1 > daysLeft2) {
            return 1;
        } else {
            return 0;
        }
    }

    public int generateAndApplyDiscount(double discountRate) {
        Random random = new Random();
        int randomIndex = random.nextInt(itemList.size());
        double discountedPrice = itemList.get(randomIndex).getPrice() * discountRate;
        itemList.get(randomIndex).setPrice(discountedPrice);
        return randomIndex;
    }

    public Item[] getItemsByType() {
        ArrayList<Item> notebookList = new ArrayList<>();
        ArrayList<Item> toiletryList = new ArrayList<>();
        ArrayList<Item> drinkList = new ArrayList<>();
        ArrayList<Item> snackList = new ArrayList<>();
        for (Item item : itemList) {
            if (item instanceof Drink) {
                drinkList.add(item);
            } else if (item instanceof Snack) {
                snackList.add(item);
            } else if (item instanceof Notebook) {
                notebookList.add(item);
            } else {
                toiletryList.add(item);
            }
        }
        ArrayList<Item> sortedItemList = new ArrayList<>();
        sortedItemList.addAll(drinkList);
        sortedItemList.addAll(snackList);
        sortedItemList.addAll(notebookList);
        sortedItemList.addAll(toiletryList);

        return sortedItemList.toArray(new Item[0]);
    }
}
