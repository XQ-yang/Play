import java.util.Scanner;

/**
 * @Author:yxq
 * @Date: 2020/7/19 21:02
 * @Tools: IntelliJ IDEA
 **/

public class DigitalBomb2 {
    public static void main(String[] args) throws InterruptedException {
        //�������ը����
        int bomb = (int) (100 * Math.random());
        //���巶Χ�߽�
        int front = 0, behind = 100, person_guess = 0, computer_guess = 0;
        //flog�Ǳ�ʶ�˻��ǵ��Բ£�1��ʾ�ˣ�0��ʾ����
        int flog = 1, guess;

        Scanner input = new Scanner(System.in);


        //û�¶ԣ�һֱѭ��
        while (person_guess != bomb && computer_guess != bomb) {
            System.out.println("��" + front + "~" + behind + "֮��");

            if (flog == 1) {
                System.out.print("��µ��ǣ�");
                person_guess = input.nextInt();
                System.out.println();
                guess = person_guess;
                flog = 0;
            } else {
                System.out.print("���Բµ��ǣ�");
                //���Բµ���,ʹ����������ɷ�Χ�ڵ�����
                computer_guess = (int) (Math.random() * (behind - front) + front);
                guess = computer_guess;
                System.out.println(computer_guess);
                System.out.println();
                flog = 1;
            }
            //���¶��巶Χ
            if (guess > bomb) {
                behind = guess;
            } else {
                front = guess;
            }
            //ʹ��ȴ�1�룬����̫��
            Thread.sleep(1000);

        }

        if (person_guess == bomb) {
            System.out.println("\\\\\\!!!!!!!!!!!!!!!//////");
            System.out.println("------!!!!!BOOM!!!!!!------");
            System.out.println("//////!!!!!!!!!!!!!!!\\\\\\");
            System.out.println();
            System.out.println("�ݡ��");
            System.out.println("Ŷ���������ˣ�����");
            System.out.println("Ŷ������  ը�����־���" + bomb);
        }
        if (computer_guess == bomb) {
            System.out.println("\\\\\\!!!!!!!!!!!!!!!//////");
            System.out.println("------!!!!!BOOM!!!!!!------");
            System.out.println("//////!!!!!!!!!!!!!!!\\\\\\");
            System.out.println();
            System.out.println("�ݡ��");
            System.out.println("Ŷ�����������ˣ�����");
            System.out.println("Ŷ������  ը�����־���" + bomb);
        }
    }
}
