public class Car {
    private String carId;
    private String make;
    private String model;
    private int year;
    private boolean isAvailable;
    public Car(String carId, String make, String model, int year) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        setYear(year);
        this.isAvailable = true;
    }


    @Override
    public String toString() {
        return String.format("Car{ carId='%s', make='%s', model='%s', year='%d', isAvailable='%s'} "
                , carId ,make ,model, year,(isAvailable)?"Yes":"No");
    }

    public String getCarId() {
        return carId;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = (year>0)?year:1;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        this.isAvailable = !available;
    }
}
