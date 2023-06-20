public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        a += 5;
        System.out.println("Addition Assignment: " + a);
        a -= 5;
        System.out.println("Subtraction Assignment: " + a);
        a *= 5;
        System.out.println("Multiplication Assignment: " + a);
        a /= 5;
        System.out.println("Division Assignment: " + a);
        a %= 5;
        System.out.println("Modulus Assignment: " + a);
        a = -10;
        System.out.println("Unary Minus: " + a);
        b++;
        System.out.println("Increment: " + b);
        b--;
        System.out.println("Decrement: " + b);
        boolean c = true;
        c = !c;
        System.out.println("Logical NOT: " + c);
    }
}