import java.util.Scanner;

/**
 * @Author:yxq
 * @Date: 2020/7/19 21:02
 * @Tools: IntelliJ IDEA
 **/

public class DigitalBomb2 {
    public static void main(String[] args) throws InterruptedException {
        //定义随机炸弹数
        int bomb = (int) (100 * Math.random());
        //定义范围边界
        int front = 0, behind = 100, person_guess = 0, computer_guess = 0;
        //flog是标识人还是电脑猜，1表示人，0表示电脑
        int flog = 1, guess;

        Scanner input = new Scanner(System.in);


        //没猜对，一直循环
        while (person_guess != bomb && computer_guess != bomb) {
            System.out.println("在" + front + "~" + behind + "之间");

            if (flog == 1) {
                System.out.print("你猜的是：");
                person_guess = input.nextInt();
                System.out.println();
                guess = person_guess;
                flog = 0;
            } else {
                System.out.print("电脑猜的是：");
                //电脑猜的数,使电脑随机生成范围内的整数
                computer_guess = (int) (Math.random() * (behind - front) + front);
                guess = computer_guess;
                System.out.println(computer_guess);
                System.out.println();
                flog = 1;
            }
            //重新定义范围
            if (guess > bomb) {
                behind = guess;
            } else {
                front = guess;
            }
            //使其等待1秒，否则太快
            Thread.sleep(1000);

        }

        if (person_guess == bomb) {
            System.out.println("\\\\\\!!!!!!!!!!!!!!!//////");
            System.out.println("------!!!!!BOOM!!!!!!------");
            System.out.println("//////!!!!!!!!!!!!!!!\\\\\\");
            System.out.println();
            System.out.println("≥◇≤");
            System.out.println("哦豁，，你完了！！！");
            System.out.println("哦！！！  炸弹数字就是" + bomb);
        }
        if (computer_guess == bomb) {
            System.out.println("\\\\\\!!!!!!!!!!!!!!!//////");
            System.out.println("------!!!!!BOOM!!!!!!------");
            System.out.println("//////!!!!!!!!!!!!!!!\\\\\\");
            System.out.println();
            System.out.println("≥◇≤");
            System.out.println("哦豁，，电脑完了！！！");
            System.out.println("哦！！！  炸弹数字就是" + bomb);
        }
    }
}
