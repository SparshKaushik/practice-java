import java.util.Scanner;

public class AveragesumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0, avg = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        avg = sum / n;
        System.out.println("The sum of the elements of the array is: " + sum);
        System.out.println("The average of the elements of the array is: " + avg);
        sc.close();
    }
}