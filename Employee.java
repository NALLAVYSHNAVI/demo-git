package Task;
public class Employee extends Person {
    int employeeID;
    double salary;
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }
    public void displayEmployee() {
        super.displayPerson(); 
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary:  ₹" + salary);
}
}
   