public class CarRentalSystem {
    private LinkedList<Car> availableCars;
    private Stack<Car> rentedCars;
    private ArrayList<Customer> customers;
    private Queue<Car> rentedCarHistory;

    public CarRentalSystem() {
        availableCars = new LinkedList();
        rentedCars = new Stack<>();
        customers = new ArrayList<>();
        rentedCarHistory=new Queue<>();
    }

    public String getIdFromUser() {
        boolean check;
        String id;
        do {
            check = false;
            System.out.print("Enter Car ID: ");
            id = UserInput.getStringFromUser();
            if (isCarIdAlreadyExist(id)) {
                System.out.println("This ID is Already exists. Try another ID.");
                check = true;
            }
        } while (check);
        return id;
    }

    public boolean isCarIdAlreadyExist(String id) {
        for (int i=0;i<availableCars.size();i++){
            Car car=availableCars.get(i);
            if (car.getCarId().equalsIgnoreCase(id)){
                return true;
            }
        }
        return false;
    }

    public boolean isCustomerIdAlreadyExist(String id) {
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
        return UserInput.getStringFromUser();
    }


    public String getModelFromUser() {
        System.out.print("Enter Car Model : ");
        return UserInput.getStringFromUser();
    }

    public int getYearFromUser() {
        System.out.print("Enter model year : ");
        return UserInput.getIntegerFromUser();
    }

    public void addCar(Car car) {
        availableCars.add(car);
        System.out.println("Car is added successfully...");
        System.out.println("---------------------");
    }

    public void searchCar() {
        if (availableCars.isEmpty()){
            System.out.println("");
        }
        System.out.print("Enter Car ID to Search :");
        String id= UserInput.getStringFromUser();
        for (int i=0;i<availableCars.size();i++){
            Car car=availableCars.get(i);
            if (car.getCarId().equalsIgnoreCase(id)){
                System.out.println(car);
                return;
            }
        }
        System.out.println("This car id "+id+" does not founded...\nTry again.");
    }


    public void rentCar() {
        if (availableCars.isEmpty()){
            System.out.println("Car list is empty...");
            return;
        }
        System.out.print("Enter Car ID to Rent a Car:");
        String id= UserInput.getStringFromUser();
        for (int i=0;i<availableCars.size();i++){
            Car car=availableCars.get(i);
            if (car.getCarId().equalsIgnoreCase(id)){
                System.out.println(car);
                if (!car.getIsAvailable()){
                    System.out.println("\nThis car is currently not available.");
                    return;
                }
                String choice;
                do {
                    System.out.print("Do want to rent this car. \nPress 'Y' / 'N' : ");
                    choice = UserInput.getStringFromUser();
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
        }
        System.out.println("This car id "+id+" does not founded...\nTry again.");
    }

    public void returnCar() {
        if (availableCars.isEmpty()){
            System.out.println("Car list is empty...");
            return;
        }
        System.out.print("Enter Car ID to Rent a Car:");
        String customerId= UserInput.getStringFromUser();
        for (int i=0;i<customers.size();i++){
            Customer tempCustomer=customers.get(i);
            if (tempCustomer.getCustomerId().equalsIgnoreCase(customerId)){
                System.out.println(tempCustomer);
                customers.remove(i);
                for (int j=0;i<availableCars.size();i++){
                    Car car=availableCars.get(j);
                    if (car.getCarId().equalsIgnoreCase(tempCustomer.getRentedCarId())){
                        car.setIsAvailable(car.getIsAvailable());
                        rentedCarHistory.enqueue(car);
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
            id= UserInput.getStringFromUser();
            if (isCustomerIdAlreadyExist(id)){
                System.out.println("This Customer Id '"+id+"' is already exist.");
            }
        }while (isCustomerIdAlreadyExist(id));
        System.out.print("Enter Customer Name: ");
        String name= UserInput.getStringFromUser();
        System.out.print("Enter Customer Email: ");
        String email= UserInput.getStringFromUser();
        Customer customer=new Customer(id,name,email, car.getCarId(), car.getMake(), car.getModel(), car.getYear());
        customers.add(customer);
    }
    public void removeCar(){
        if (availableCars.isEmpty()){
            System.out.println("Car list is empty...");
            return;
        }
        System.out.print("Enter Car ID to remove Car:");
        String id= UserInput.getStringFromUser();
        for (int i=0;i<availableCars.size();i++){
            Car car=availableCars.get(i);
            if (car.getCarId().equalsIgnoreCase(id)){
                System.out.println(car);
                String choice;
                do {
                    System.out.print("Do really want to remove this car. \nPress 'Y' / 'N' : ");
                    choice = UserInput.getStringFromUser();
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
            choice = UserInput.getIntegerFromUser();
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
                rentedCarHistory.clear();
                System.out.println("Returned car history is clear successfully...");
                break;

            case 3:
                rentedCarHistory.clear();
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
            return;
        }
        System.out.println("Available Cars:");
        for (int i=0;i<availableCars.size();i++){
            Car car=availableCars.get(i);
            System.out.println(car);
        }
    }

    public void displayRentedCars() {
        if (rentedCars.isEmpty()){
            System.out.println("Rented car list is empty...");
            return;
        }
        System.out.println("Rented Cars:");
        for (int i=0;i<rentedCars.size();i++){
            Car car=rentedCars.get(i);
            System.out.println(car);
        }
    }

    public void displayCustomers() {
        if (customers.isEmpty()){
            System.out.println("Car list is empty...");
            return;
        }
        System.out.println("Customers:");
        for (int i=0;i<customers.size();i++){
            Customer customer=customers.get(i);
            System.out.println(customer);
        }
    }

    public void displayRentedCarHistory(){
        if (rentedCarHistory.isEmpty()){
            System.out.println("Rented Car history is empty...");
            return;
        }
        for (int i=0;i<rentedCarHistory.size();i++){
            Car car=rentedCarHistory.get(i);
            System.out.println(car);
        }
    }

    public void deleteSystem() {
        String choice;
        do {
            System.out.print("Do really want to delete this system. \nPress 'Y' / 'N' : ");
            choice = UserInput.getStringFromUser();
        } while (choice.charAt(0) != 'N' && choice.charAt(0) != 'Y');
        if (choice.charAt(0) == 'N') {
            return;
        }
        availableCars.clear();
        rentedCars.clear();
        customers.clear();
        rentedCarHistory.clear();
        System.out.println("Car Rental System is successfully deleted.");
    }

}
