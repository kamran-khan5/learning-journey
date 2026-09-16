public class ComissionEmploy extends Employ{
    private double rate;
    private int totalSales;

    ComissionEmploy(String firstName, String lastName, int age, String cnicNo, int employId, String dateOfBirth) {
        super(firstName, lastName, age, cnicNo, employId, dateOfBirth);
    }

    public void setRate(double rate){
        this.rate = rate>0  &&  rate<1 ? rate : 0.0;
    }

    public double getRate() {
        return rate;
    }
    public void setTotalSales(int totalSales){
        this.totalSales= totalSales > 0 ? totalSales : 0;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public double totalComission(){

        return getRate() * getTotalSales();

    }
}
