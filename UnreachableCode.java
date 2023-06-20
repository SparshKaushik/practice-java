// Write a Java program demonstrate how unreachable code is created and compile-time error occurs when super class exception occurs prior to subclass exception in series of catch statements.

public class UnreachableCode {
    public static void main(String[] args) {
        int a = 10;
        if (a == 10) {
            System.out.println("a is 10");
        } else {
            System.out.println("This is unreachable code");
        }
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception");
        }
    }
}