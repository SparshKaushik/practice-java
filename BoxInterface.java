// Write a Java program to implement inheritance 
// Define a class Box with the following instance variables: width, height and depth, all of type float. Create a new class BoxWeight that extends Box to include weight as an instance variable. Write an application that tests the functionalities of both these classes.

import java.util.Scanner;

class Box {
    float width, height, depth;

    Box() {
        width = 0;
        height = 0;
        depth = 0;
    }

    Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Depth: " + depth);
    }
}

class BoxWeight extends Box {
    float weight;

    BoxWeight() {
        super();
        weight = 0;
    }

    BoxWeight(float w, float h, float d, float wt) {
        super(w, h, d);
        weight = wt;
    }

    void display() {
        super.display();
        System.out.println("Weight: " + weight);
    }
}

public class BoxInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the box:");
        float w = sc.nextFloat();
        float h = sc.nextFloat();
        float d = sc.nextFloat();
        System.out.println("Enter the weight of the box:");
        float wt = sc.nextFloat();
        BoxWeight box = new BoxWeight(w, h, d, wt);
        box.display();
        sc.close();
    }
}
