/**
 * @Author:yxq
 * @Date: 2020/7/16 22:11
 * @Tools: IntelliJ IDEA
 **/

/**
  乘法口诀表
 * @author 小强
 */
public class Multiplication_tables {
    public static void main(String[] args) {
        int i, j;
        System.out.println("乘法口诀");
        System.out.println("-----------------------------------------------------------------------");
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------");
    }
}
