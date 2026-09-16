import java.util.ArrayList;
import java.util.Scanner;

public class TestStoreWithMenu {
    private static Store store = new Store();
    public static boolean isItemAlreadyExist(Item item)
    {
        for (Item temp: store.getItemList())
        {
            return temp.equals(item);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit=false;
        while (!exit) {
            ArrayList<Item> itemArrayList=new ArrayList<>();
            Item item1;
            System.out.println("Menu:");
            System.out.println("1. Add Item List");
            System.out.println("2. View Item List");
            System.out.println("3. Apply Discount");
            System.out.println("4. View Items by Type");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            String  choice = input.nextLine();
            switch (Integer.parseInt(choice)) {
                case 1: // Adding items.
                    boolean isContinue=true;
                    while (isContinue){
                        String name;
                        String price;
                        boolean isSame;
                        System.out.println("Which High-Level Type item you want to enter:\n" +
                                "1. CONSUMABLE\n2. NON CONSUMABLE");
                        String  choice1 = input.nextLine();
                        switch (Integer.parseInt(choice1)) {
                            case 1: // Entering Consumable item.
                                System.out.println("What is Type of item\n" +
                                        "1. DRINK\n2. SNACK");
                                String choice2 = input.nextLine();

                                switch (Integer.parseInt(choice2)) {
                                    case 1:// Entering Drink detail.
                                        System.out.println("Enter name :");
                                        name= input.nextLine();
                                        System.out.println("Enter Price:");
                                        price=input.nextLine();
                                        System.out.println("Enter Calories");
                                        String calories=input.nextLine();
                                        System.out.println("Enter Expiry Days Left:");
                                        String expiryDaysLeft=input.nextLine();
                                        System.out.println("Enter Liters:");
                                        String liters=input.nextLine();
                                        item1=new Drink(name,Double.parseDouble(price),Integer.parseInt(calories),Integer.parseInt(expiryDaysLeft),Double.parseDouble(liters));
                                        if (isItemAlreadyExist(item1)) {
                                            System.out.println("This item is already exist.");
                                            break;
                                        }
                                        itemArrayList.add(item1);
                                        System.out.println("Item is Added successfully.\n");
                                        break;

                                    case 2:// Entering Snack detail.
                                        System.out.println("Enter name :");
                                        name= input.nextLine();
                                        System.out.println("Enter Price:");
                                        price=input.nextLine();
                                        System.out.println("Enter Calories");
                                        calories=input.nextLine();
                                        System.out.println("Enter Expiry Days Left:");
                                        expiryDaysLeft=input.nextLine();
                                        System.out.println("Enter Texture:");
                                        String texture=input.nextLine();
                                        item1=new Snack(name,Double.parseDouble(price),Integer.parseInt(calories),Integer.parseInt(expiryDaysLeft),texture);
                                        if (isItemAlreadyExist(item1)) {
                                            System.out.println("This item is already exist.");
                                            break;
                                        }
                                        itemArrayList.add(item1);
                                        System.out.println("Item is Added successfully.\n");
                                        break;

                                    default:
                                        System.out.println("Invalid Input!");
                                }
                                break;

                            case 2:// Entering NonConsumable item.
                                System.out.println("What is Type of item\n" +
                                        "1. NOTEBOOK\n2. TOILETRY");
                                String choice3 = input.nextLine();
                                switch (Integer.parseInt(choice3)){
                                    case 1: //Entering Notebook detail.
                                        System.out.println("Enter Name:");
                                        name=input.nextLine();
                                        System.out.println("Enter Price:");
                                        price=input.nextLine();
                                        System.out.println("Enter Maximum Number of Usage Before Expiry:");
                                        String maxNumUsage=input.nextLine();
                                        System.out.println("Enter Color:");
                                        String color=input.nextLine();
                                        System.out.println("Is College Ruled(yes/no):");
                                        String isCollegeRuled=input.nextLine();
                                        System.out.println("Enter number of subjects(1,3,5):");
                                        String subject=input.nextLine();
                                        item1 = new Notebook(name,Double.parseDouble(price),Integer.parseInt(maxNumUsage),color,isCollegeRuled,Integer.parseInt(subject));
                                        if (isItemAlreadyExist(item1)) {
                                            System.out.println("This item is already exist.");
                                            break;
                                        }
                                        itemArrayList.add(item1);
                                        System.out.println("Item is Added successfully.\n");
                                        break;

                                    case 2://Entering Toiletry detail.
                                        System.out.println("Enter Name:");
                                        name=input.nextLine();
                                        System.out.println("Enter Price:");
                                        price=input.nextLine();
                                        System.out.println("Enter Maximum Number of Usage Before Expiry:");
                                        maxNumUsage=input.nextLine();
                                        System.out.println("Enter Pack Size:");
                                        String packSize=input.nextLine();
                                        System.out.println("Is Brand Name(yes/no):");
                                        String isBrandName=input.nextLine();
                                        item1=new Toiletry(name,Double.parseDouble(price),Integer.parseInt(maxNumUsage),Integer.parseInt(packSize),isBrandName);
                                        if (isItemAlreadyExist(item1)) {
                                            System.out.println("This item is already exist.");
                                            break;
                                        }
                                        itemArrayList.add(item1);
                                        System.out.println("Item is Added successfully.\n");
                                        break;
                                    default:
                                        System.out.println("Invalid Input!");
                                }
                            }//end of entering consumable & nonConsumable item.
                        String cont;
                        do {
                            System.out.print("Continue add item press 'y'/'n' : ");
                            cont=input.nextLine();
                        }while (!cont.equalsIgnoreCase("y") && !cont.equalsIgnoreCase("n"));
                        if (cont.equalsIgnoreCase("n"))
                        {
                            isContinue=false;
                        }
                    }//end of wile loop.

                    store.addToItemList((itemArrayList.toArray(new Item[itemArrayList.size()])));
                break;
                case 2:
                    // Get the item list from the store which were added
                    System.out.println("Item List:");
                    for (Item item : store.getItemList()) {
                        System.out.println(item);
                        System.out.println("\n*******************************\n\n");
                    }
                    break;

                case 3:
                    // Generate and apply a discount.
                    if (store.getItemList().isEmpty()){
                        System.out.println("Item list is empty...");
                        System.out.println("\n*******************************\n\n");
                        break;
                    }
                    String discountRateStr;
                    do {
                        System.out.print("Enter discount percentage (0.1 - 0.9) : ");
                        discountRateStr = input.nextLine();
                    }while (Double.parseDouble(discountRateStr)<=0.0 || Double.parseDouble(discountRateStr)>=10.0);
                    double discountRate = Double.parseDouble(discountRateStr);
                    int selectedIndex = store.generateAndApplyDiscount(discountRate);
                    Item selectedDiscountItem = store.getItemList().get(selectedIndex);
                    System.out.println("Discount applied to item at index " + selectedIndex + ":");
                    System.out.println(selectedDiscountItem);
                    System.out.println("\n*******************************\n\n");
                    break;

                case 4: // display all item in a store by type.
                    Item[] itemsByType = store.getItemsByType();
                    System.out.println("Items by type:");
                    for (Item item : itemsByType) {
                        System.out.println(item);
                        System.out.println("\n\n\n*******************************\n\n");
                    }
                    break;

                case 5:// Store closing.
                    System.out.println("\n\n\n*******************************\n\n");
                    System.out.print("\t\tClosing Store... ");
                    System.out.println("\n\n\n*******************************\n\n");
                    exit=true;
            }
        }
    }

}

