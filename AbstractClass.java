// Write a Java program to demonstrate the concept of abstract classes and interfaces.

import java.util.Scanner;

abstract class Shape {
    abstract void area();
}

interface Volume {
    void volume();
}

class Circle extends Shape {
    float radius;

    Circle(float r) {
        radius = r;
    }

    void area() {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
}

class Sphere extends Circle implements Volume {
    Sphere(float r) {
        super(r);
    }

    public void volume() {
        System.out.println("Volume of sphere: " + (4.0 / 3.0 * 3.14 * radius * radius * radius));
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        float r = sc.nextFloat();
        Sphere s = new Sphere(r);
        s.area();
        s.volume();
        sc.close();
    }
}