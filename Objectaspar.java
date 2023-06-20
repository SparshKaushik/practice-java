// Write a Java program to demonstrate passing object as parameters.

import java.util.Scanner;

class Add {
    int a, b;

    Add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int add(Add obj) {
        return obj.a + obj.b;
    }
}

public class Objectaspar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Add obj = new Add(a, b);
        System.out.println("Sum = " + obj.add(obj));
        sc.close();
    }
}