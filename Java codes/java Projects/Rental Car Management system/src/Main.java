public class Main {
    public static void main(String[] args) {
        CarRentalSystem CR_system=new CarRentalSystem();
        int choice;
        do {
            System.out.println("\n\t Welcome to Car Rental System");
            System.out.println("\t ----------------------------\n");
            System.out.println("PRESS '1' Add Car");
            System.out.println("PRESS '2' Search Car");
            System.out.println("PRESS '3' Remove Car");
            System.out.println("PRESS '4' Rent Car");
            System.out.println("PRESS '5' Return Car");
            System.out.println("PRESS '6' Display Available Cars");
            System.out.println("PRESS '7' Display Rented Cars Customer");
            System.out.println("PRESS '8' Display Rented Car History");
            System.out.println("PRESS '9' Display Returned Car History");
            System.out.println("PRESS '10' Clear History");
            System.out.println("PRESS '11' Delete System");
            System.out.println("PRESS 0. Exit");
            System.out.print("Enter your choice: ");
            choice = FormatClass.getIntegerFromUser();
            System.out.println("--------------------\n");

            switch (choice) {
                case 1:
                    String id=CR_system.getIdFromUser();
                    String make = CR_system.getMakeFromUser();
                    String model=CR_system.getModelFromUser();
                    int year=CR_system.getYearFromUser();
                    Car car=new Car(id,make,model,year);
                    CR_system.addCar(car);
                    break;

                case 2:
                    CR_system.searchCar();
                    break;

                case 3:
                    CR_system.removeCar();
                    break;

                case 4:
                    CR_system.rentCar();
                    break;

                case 5:
                    CR_system.returnCar();
                    break;

                case 6:
                    CR_system.displayAvailableCars();
                    break;

                case 7:
                    CR_system.displayCustomers();
                    break;

                case 8:
                    CR_system.displayRentedCars();
                    break;

                case 9:

                    break;

                case 10:
                    CR_system.clearHistory();
                    break;

                case 11:
                    CR_system.deleteSystem();
                    break;

                case 0:
                    System.out.println("System Exiting... ");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while (choice!=0);
    }
}
