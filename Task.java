// Task-1
// 1.st Question using for loop

public class Task
 {
     public static void main(String[] args)
     {
         for(int i=10;i<=50;i++)
         {
             System.out.println(i);
         }
     }
 }
// 1.st Question using while loop

public class Task
{
    public static void main(String[] args)
    {
        int i = 10;
        while (i <= 50)
        {
            System.out.println(i);
            i++;
        }
    }
}

// 2.nd Question

import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("number is positive");
        } else if (number < 0) {
            System.out.println("number is negative");
        } else {
            System.out.print("number is zero");
        }
    }
}

//3 rd Question

public class Task {
    public static void main(String[] args) {
        int number = 876;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}

//4 th Question

import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        System.out.println("The smallest number is: " + smallest);
    }
}

//5 th Question

import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        double payableAmount;
        if (purchaseAmount < 500) {
            payableAmount = purchaseAmount;
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            payableAmount = purchaseAmount - (purchaseAmount * 0.1);
        } else {
            payableAmount = purchaseAmount - (purchaseAmount * 0.2);
        }
        System.out.println("Final payable amount after discount: " + payableAmount);
    }
}

//6 th Question

import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j >= 1; j--) {
                if (j > i) {
                    System.out.print(j);
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}