/**
 * @Description:
 * @Author: 小强
 * @Date: 2021/4/11 0011
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public class Demo01 {
    public static void main(String[] args) {
        double d = .000000103;
        //float型的值必须加f或F
        float f = 3.1415926F;

        //1.03E-7
        System.out.println("d = " + d);
        //3.1415925
        System.out.println("f = " + f);

        System.out.println(test(5));
    }

    public static int test(int n) {
        if (n == 1) {
            return 1;
        }
        return n*test(n-1);
    }
}
