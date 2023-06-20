// Find the factorial of a given number using Recursion.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}