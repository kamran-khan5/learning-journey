public class SalariedEmployee extends ComissionEmploy{
    private int baseSalary;

    SalariedEmployee(String firstName, String lastName, int age, String cnicNo, int employId, String dateOfBirth,int baseSalary,double rate,int totalSales) {
        super(firstName, lastName, age, cnicNo, employId, dateOfBirth);
        setBaseSalary(baseSalary);
        setRate(rate);
        setTotalSales(totalSales);
    }

    public void setBaseSalary(int baseSalary){
        this.baseSalary= baseSalary>0?baseSalary:1000;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    @Override
    public double totalComission(){

        return getBaseSalary()+(getRate() * getTotalSales());

    }

    @Override
    public String toString() {
        return String.format("Name:\t%s %s \nAge:\t%d\nCnicNo:\t%s\nEmploy ID:\t%d\nDate Of Birth:\t%s\n" +
                        "BaseSalary:\t%d\nComission rate:\t%.2f\nTotal Salary:\t%.2f",
                firstName,lastName,age,cnicNo,employId,dateOfBirth,getBaseSalary(),getRate(),totalComission());
    }
}
