// Write a Java program using switch to demonstrate the usage of try/catch block for the following handling exceptions:
// 1: Arithmetic Exception
// 2. Index Out of Bounds Exception
// 3. Null Pointer Exception
// 4. Number Format Exception

public class DiffExceptions {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception");
        }

        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }

        try {
            String s = "abc";
            int n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }
    }
}
