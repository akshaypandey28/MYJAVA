public class D1_1_factorial {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int ans = factorial(10);
        System.out.println(ans);
    }
}
