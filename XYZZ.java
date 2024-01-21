package Task;

public class XYZZ {
    public static void main(String[] args) {
        // Accept employee information
        Employeee employeee = new Employeee(101, "Vyshu", 60000);
        System.out.println("Income tax for employeee: " + employeee.calcTax());

        // Accept product information
        Productt productt = new Productt(2001, 25.0, 10);
        System.out.println("Sales tax for productt: " + productt.calcTax());
    }
}