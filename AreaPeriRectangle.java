import java.util.Scanner;

public class AreaPeriRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();
        System.out.println("The area of the rectangle is: " + area(l, b));
        System.out.println("The perimeter of the rectangle is: " + perimeter(l, b));
        sc.close();
    }

    public static int area(int l, int b) {
        return (l * b);
    }

    public static int perimeter(int l, int b) {
        return (2 * (l + b));
    }
}