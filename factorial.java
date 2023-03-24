public class factorial {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fact(n));
    }
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}