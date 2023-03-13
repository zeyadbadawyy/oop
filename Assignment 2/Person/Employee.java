import java.util.Date;

public class Employee extends Person{

    private String office;
    private double salary;
    private Date datehired;
    public Employee(String n, String a, int p, String e, String o, double s, Date d) {
        super(n, a, p, e);
        office =o;
        salary=s;
        datehired=d;
    }
    public String toString() {
        return "Employee,"+ getName();
    }
}
