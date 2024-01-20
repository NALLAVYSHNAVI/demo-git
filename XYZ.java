package Task;
import java.util.Scanner;
public class XYZ {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product " + (i + 1) + " information:");
            System.out.print("PID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }
        int maxPricePid = getMaxPricePid(products);
        System.out.println("PID of the product with the highest price: " + maxPricePid);

        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);
    }

    public static int getMaxPricePid(Product[] products) {
        double maxPrice = 0;
        int maxPricePid = -1;

        for (Product product : products) {
            if (product.price > maxPrice) {
                maxPrice = product.price;
                maxPricePid = product.pid;
            }
        }

        return maxPricePid;
    }

    public static double calculateTotalAmountSpent(Product[] products) {
        double totalAmountSpent = 0;

        for (Product product : products) {
            totalAmountSpent += product.price * product.quantity;
        }

        return totalAmountSpent;
    }
}
