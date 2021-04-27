/**
 * @Author:yxq
 * @Date: 2020/11/8 0:34
 * @Tools: IntelliJ IDEA
 **/
public class Recursion {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print(Fib(i) + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

    private static long Fib(int n) {        //这就是递归
        if ((n == 1) || (n == 2)) {
            return 1;
        }
        return Fib(n - 1) + Fib(n - 2);
    }
}
