import java.util.*;


public class CarRentalSystem {
    private LinkedList<Car> availableCars;
    private Stack<Car> rentedCars;
    private ArrayList<Customer> customers;

    public CarRentalSystem() {
        availableCars = new LinkedList();
        rentedCars = new Stack<>();
        customers = new ArrayList<>();
    }

    public String getIdFromUser() {
        boolean check;
        String id;
        do {
            check = false;
            System.out.print("Enter Car ID: ");
            id = FormatClass.getStringFromUser();
            if (isCarIdAlreadyExist(id)) {
                System.out.println("This ID is Already exists. Try another ID.");
                check = true;
            }
        } while (check);
        return id;
    }

    public boolean isCarIdAlreadyExist(String id) {
        for (Car car:availableCars) {
            if (car.getCarId().equalsIgnoreCase(id)){
                return true;
            }
        }
        return false;
    }

    public boolean isCustomerIdAlreadyExist(String id) {
//        for (Customer tempCustomer:customers) {
//            if (tempCustomer.getCustomerId().equalsIgnoreCase(id)){
//                return true;
//            }
//        }
        for (int i=0;i<customers.size();i++){
            Customer tempCustomer=customers.get(i);
            if (tempCustomer.getCustomerId().equalsIgnoreCase(id)){
                return true;
            }
        }
        return false;
    }

    public String getMakeFromUser() {
        System.out.print("Enter Car Make: ");
        return FormatClass.getStringFromUser();
    }


    public String getModelFromUser() {
        System.out.print("Enter Car Model : ");
        return FormatClass.getStringFromUser();
    }

    public int getYearFromUser() {
        System.out.print("Enter model year : ");
        return FormatClass.getIntegerFromUser();
    }

    public void addCar(Car car) {
        availableCars.add(car);
        System.out.println("Car is added successfully...");
        System.out.println("---------------------");
    }

    public void searchCar() {
        System.out.print("Enter Car ID to Rent a Car:");
        String id=FormatClass.getStringFromUser();
        for (Car car: availableCars) {
            if (car.getCarId().equalsIgnoreCase(id)){
                System.out.println(car);
                return;
            }
            System.out.println("This car id "+id+" does not founded...\nTry again.");
        }
    }


    public void rentCar() {
        System.out.print("Enter Car ID to Rent a Car:");
        String id=FormatClass.getStringFromUser();
        for (Car car: availableCars) {
            if (car.getCarId().equalsIgnoreCase(id)){
                System.out.println(car);
                if (!car.getIsAvailable()){
                    System.out.println("\nThis car is currently not available.");
                    return;
                }
                String choice;
                do {
                    System.out.print("Do want to rent this car. \nPress 'Y' / 'N' : ");
                    choice = FormatClass.getStringFromUser();
                } while (choice.charAt(0) != 'N' && choice.charAt(0) != 'Y');
                if (choice.charAt(0) == 'N') {
                    return;
                }
                car.setIsAvailable(car.getIsAvailable());
                rentedCars.push(car);
                getCustomerDetails(car);
                System.out.println("Car is ranted successfully...");
                return;
            }
            System.out.println("This car id "+id+" does not founded...\nTry again.");
        }
    }

    public void returnCar() {
        System.out.print("Enter Car ID to Rent a Car:");
        String customerId=FormatClass.getStringFromUser();
        for (Customer c:customers) {

            if (c.getCustomerId().equalsIgnoreCase(customerId)){
                System.out.println(c);
                customers.remove(c);
                for (Car car:availableCars){
                    if (car.getCarId().equalsIgnoreCase(c.getRentedCarId())){
                        car.setIsAvailable(car.getIsAvailable());
                        break;
                    }
                }
                System.out.println("Car is Returned successfully.");
                return;
            }
        }
        System.out.println("Car is not rented from this rental system.");
    }

    private void getCustomerDetails(Car car){
        String id;
        do {
            System.out.print("Enter Customer id: ");
            id=FormatClass.getStringFromUser();
            if (isCustomerIdAlreadyExist(id)){
                System.out.println("This Customer Id '"+id+"' is already exist.");
            }
        }while (isCustomerIdAlreadyExist(id));
        System.out.print("Enter Customer Name: ");
        String name=FormatClass.getStringFromUser();
        System.out.print("Enter Customer Email");
        String email=FormatClass.getStringFromUser();
        Customer customer=new Customer(id,name,email, car.getCarId(), car.getMake(), car.getModel(), car.getYear());
        customers.add(customer);
    }
    public void removeCar(){
        System.out.print("Enter Car ID to remove Car:");
        String id=FormatClass.getStringFromUser();
        for (Car car: availableCars) {
            if (car.getCarId().equalsIgnoreCase(id)){
                System.out.println(car);
                String choice;
                do {
                    System.out.print("Do really want to remove this car. \nPress 'Y' / 'N' : ");
                    choice = FormatClass.getStringFromUser();
                } while (choice.charAt(0) != 'N' && choice.charAt(0) != 'Y');
                if (choice.charAt(0) == 'N') {
                    return;
                }
                availableCars.remove(car);
                System.out.println("Car is removed successfully...");
                return;
            }
        }
        System.out.println("This car id "+id+" does not founded...\nTry again.");
    }

    public void clearHistory() {
        int choice;
        do {
            System.out.println("Press '1' for Clear Rented car history.");
            System.out.println("Press '2' for Clear Returned car history.");
            System.out.println("Press '3' for Clear Rented & Returned car history.");
            System.out.println("PRESS '4' Exit To Main Menu");
            System.out.print("Choice: ");
            choice = FormatClass.getIntegerFromUser();
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid Choice. Try Again");
            }
        } while (choice < 1 || choice > 4);
        switch (choice){
            case 1:
                rentedCars.clear();
                System.out.println("Rented car history is clear successfully...");
                break;

            case 2:

                System.out.println("Returned car history is clear successfully...");
                break;

            case 3:

                rentedCars.clear();
                System.out.println("Rented & Returned car history is clear successfully...");
                break;

            case 4:
                System.out.println("Return to Main menu...\n");
                break;

        }
    }
    public void displayAvailableCars() {
        if (availableCars.isEmpty()){
            System.out.println("Car list is empty...");
        }
        System.out.println("Available Cars:");
        for (Car car : availableCars) {
            System.out.println(car);
        }
    }

    public void displayRentedCars() {
        if (rentedCars.isEmpty()){
            System.out.println("Rented car list is empty...");
        }
        System.out.println("Rented Cars:");
//        for (Car car : rentedCars) {
//            System.out.println(car);
//        }
            System.out.println(rentedCars);

    }

    public void displayCustomers() {
        if (customers.isEmpty()){
            System.out.println("Car list is empty...");
        }
        System.out.println("Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void deleteSystem() {
        String choice;
        do {
            System.out.print("Do really want to delete this system. \nPress 'Y' / 'N' : ");
            choice = FormatClass.getStringFromUser();
        } while (choice.charAt(0) != 'N' && choice.charAt(0) != 'Y');
        if (choice.charAt(0) == 'N') {
            return;
        }
        availableCars.clear();
        rentedCars.clear();
        customers.clear();

        System.out.println("Car Rental System is successfully deleted.");
    }

}
