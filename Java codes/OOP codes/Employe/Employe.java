public class Employe {
    int emp_id, current_scale, salary;
    String name, join_date;

    public Employe (int id,int scale, int salary, String name, String join_date ){
        this.name=name;
        this.emp_id=id;
        this.join_date=join_date;
        this.current_scale=scale;
        this.salary=salary;
    }

    public void setName(String n){
        this.name=n;
    }

    public void setEmp_id(int id1){
        this.emp_id=id1;
    }

    public void setJoin_date(String date){
        this.join_date=date;
    }

    public void setCurrent_scale(int scale){
        this.current_scale=scale;
    }

    public void setSalary(int salary1){
        this.salary=salary1;
    }

    public String getName(){
        return name;
    }

    public int getEmp_id(){
        return emp_id;
    }

    public String getJoin_date(){
        return join_date;
    }

    public int getCurrent_scale(){
        return current_scale;
    }

    public int getSalary(){
        return salary;
    }

    public void display(){
        System.out.println("Employe Name : " + name);
        System.out.println("Employe ID : " + emp_id);
        System.out.println("Joining Date : " + join_date);
        System.out.println("Current Scale : " + current_scale);
        System.out.println("Salary : " + salary);
    }
}
