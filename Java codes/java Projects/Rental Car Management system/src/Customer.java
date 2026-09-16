import java.time.LocalDateTime;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String rentedCarId;
    private String rentedCarMake;
    private String rentedCarModel;
    private int rentedCarYear;
    private LocalDateTime rentingDateTime;


    public String getRentedCarId() {
        return rentedCarId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Customer(String customerId, String name, String email, String rentedCarId, String rentedCarMake,
                    String rentedCarModel, int rentedCarYear) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.rentedCarId=rentedCarId;
        this.rentedCarMake=rentedCarMake;
        this.rentedCarModel=rentedCarModel;
        this.rentedCarYear=rentedCarYear;
        this.rentingDateTime=LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                "Car{" +
                "carId='" + rentedCarId + '\'' +
                ", make='" + rentedCarMake + '\'' +
                ", model='" + rentedCarModel + '\'' +
                ", year=" + rentedCarYear +
                ", Date & Time=" + rentingDateTime +
                '}';
    }
}
