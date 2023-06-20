// Write a Java program to demonstrate call by value

import java.util.Scanner;

public class Callbyvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        sc.close();
        System.out.println("Before Adding: ");
        System.out.println("a = " + a);
        System.out.println("After Adding: ");
        add(a);
        System.out.println("(orginal) a = " + a);
    }

    public static void add(int a) {
        a += 10;
        System.out.println("(new) a = " + a);
    }
}