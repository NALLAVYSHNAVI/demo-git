package Task;
public class Employeee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    public Employeee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calcTax() {
        return salary * incomeTax;
    }
}