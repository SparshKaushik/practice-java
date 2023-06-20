class Fibonacci {
    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms of Fibonacci \n");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + "\n");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}