/**
 * @Description:
 * @Author: 小强
 * @Date: 2021/4/7 0007
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public class Prime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;

        if (n == 2) return true;

        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2)

            if (n % i == 0) return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(79));
        outer:
        for (int i = 10; i <= 89; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0)
                    continue outer;
            }
            System.out.print(i + " ");
        }
    }
}
