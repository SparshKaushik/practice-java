import java.util.Random;

public class PrimeNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(number + " is " + (isPrime ? "prime" : "not prime"));
    }

}