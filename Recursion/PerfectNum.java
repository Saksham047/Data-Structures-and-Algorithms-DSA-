import java.util.*;

public class PerfectNumber {

    static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> perfectNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPerfect(i)) {
                perfectNumbers.add(i);
            }
        }
        System.out.println("The perfect numbers between 1 to " + n + " are:");
        for (int perfectNumber : perfectNumbers) {
            System.out.println(perfectNumber);
        }
    }
}