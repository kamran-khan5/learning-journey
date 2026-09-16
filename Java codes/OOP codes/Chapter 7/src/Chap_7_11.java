import java.util.Scanner;

class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity>0)
        {
            this.quantity = quantity;
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>0.0)
        {
            this.price = price;
        }

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Invoice (String number, String description, int quantity, double price)
    {
        setNumber(number);
        setDescription(description);
        setQuantity(quantity);
        setPrice(price);
    }

    public double getInvoiceAmount ()
    {
        return price*quantity;
    }

    public void getInvoice()
    {
        System.out.println("Item Number: " + number);
        System.out.println("Item Description: " + description);
        System.out.println("Item Quantity: " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total Amount: " + getInvoiceAmount());
    }

}

class Chap_7_11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Item Number: ");
        String number=sc.nextLine();

        System.out.print("Enter Item Description: ");
        String description=sc.nextLine();

        System.out.print("Enter Item Quantity: ");
        int quantity=sc.nextInt();

        System.out.print("Enter Item Price per item: ");
        double price=sc.nextDouble();

        Invoice invoice1=new Invoice(number, description, quantity, price);
        invoice1.getInvoice();
    }
}