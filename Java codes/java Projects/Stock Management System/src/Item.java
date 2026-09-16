import java.time.LocalDate;
import java.time.LocalTime;
public class Item {
    private int barCode;
    private String name;
    private String type;
    private double price;
    private int quantity;
    private String storageAddress;
    private LocalDate deliveryDate;

    private String customerName;

    //Constructor for add item.
    public Item(int barCode, String name, String type, double price, int quantity,String storageAddress) {
        setBarCode(barCode);
        setName(name);
        setType(type);
        setPrice(price);
        setQuantity(quantity);
        LocalDate itemAddingDate = LocalDate.now();
    }

    //Constructor for deliver item.
    public Item(int barCode, String name, String type, double price,int quantity, String customerName, LocalDate deliveryDate,) {
        setBarCode(barCode);
        setName(name);
        setType(type);
        setPrice(price);

    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public void setName(String name) {
        this.name = (name.isEmpty())? "Null" : name;
    }

    public void setType(String type) {
        this.type = (type.isEmpty())? "Null" : type;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity >0) ? quantity : 0;
    }

    public void setPrice(double price) {
        this.price = (price>1) ? price : 1;
    }


}

