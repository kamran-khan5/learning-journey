import java.util.Scanner;

class Car {
    private String model;
    private String year;
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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

    public Car (String model, String year, double price)
    {
        setModel(model);
        setYear(year);
        setPrice(price);
    }

    public void getCarDetail()
    {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Price: " + price);
    }

    public double discount(double discountRate)
    {
        double num= price*discountRate;
        return price-num;
    }


}

class Chap_7_12{
    public static String getModelDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Model Of Car: ");
        String model= sc.nextLine();
        return model;
    }

    public static String getYearDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year of Car: ");
        String year=sc.nextLine();
        return year;
    }

    public static double getPriceDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Price of Car: ");
        double price= sc.nextInt();
        return price;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car car1=new Car(getModelDetail(),getYearDetail(),getPriceDetail());
        System.out.println("\n\nCar 2 details:");
        Car car2=new Car(getModelDetail(),getYearDetail(),getPriceDetail());

        car1.getCarDetail();
        car2.getCarDetail();
//        double price1=car1.getPrice()*0.05;
//        double price2=car2.getPrice()*0.07;
//        car1.setPrice(car1.getPrice()-price1);
//        car2.setPrice(car2.getPrice()-price2);

        System.out.println(car1.getModel() + " car price After 5% Discount: " + car1.discount(0.05));
        System.out.println(car2.getModel() + " car 2 price After 7% Discount: " + car2.discount(0.07));
    }
}
