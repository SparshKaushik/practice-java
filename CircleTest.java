import java.util.Scanner;

class Circle {
    int radius;
    public Circle() {
        radius = 0;
    }
    public Circle(int radius) {
        this.radius = radius;
    }
    public Circle(Circle c) {
        radius = c.radius;
    }
    public double area() {
        return (Math.PI * radius * radius);
    }
    public double circumference() {
        return (2 * Math.PI * radius);
    }
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }
}
public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int r = sc.nextInt();
        Circle c = new Circle(r);
        System.out.println("Area of the circle is: " + c.area());
        System.out.println("Circumference of the circle is: " + c.circumference());
        c.display();
        sc.close();
    }
}
