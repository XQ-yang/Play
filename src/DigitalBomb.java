import java.util.Scanner;

/**
 * @Author:yxq
 * @Date: 2020/7/16 14:36
 * @Tools: IntelliJ IDEA
 **/

/*
  数字炸弹
 */
public class DigitalBomb {


    public static void main(String[] args) {
        int bomb = (int) (100 * Math.random());     //定义随机炸弹数
        int front = 0, behind = 100;       //定义范围边界

        Scanner input = new Scanner(System.in);
        System.out.println("你猜的数是（0~100）：");
        int guess = input.nextInt();            //输入猜的数字

        while (guess != bomb) {
            if (guess > bomb) {
                System.out.println("在" + front + "~" + guess + "之间");
                behind = guess;     //若猜的数大于炸弹数字，那么将猜的数作为最大边界
            } else {
                System.out.println("在" + guess + "~" + behind + "之间");
                front = guess;       //若猜的数小于炸弹数字，那么将猜的数作为最小边界
            }
            System.out.println("继续猜：");
            guess = input.nextInt();
        }

        if (guess == bomb) {
            System.out.println();
            System.out.println("\\\\\\!!!!!!!!!!!!!!!//////");
            System.out.println("------!!!!!BOOM!!!!!!------");
            System.out.println("//////!!!!!!!!!!!!!!!\\\\\\");
            System.out.println();
            System.out.println("≥◇≤");
            System.out.println("哦！！！  炸弹数字就是" + bomb);
        }
    }
}
