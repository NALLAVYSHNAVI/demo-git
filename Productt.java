package Task;
public class Productt implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    public Productt(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calcTax() {
        return price * quantity * salesTax;
    }
}