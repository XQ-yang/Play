package usedClass;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Сǿ
 * @Date: 2021/4/14 0014
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����һ����ݺ��·ݣ�(��ʽΪ2015 7)");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        //�õ����µĵ�һ������
        LocalDate date = LocalDate.of(year, month, 1);
        String monthName = date.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        //���ص�������
        int dayOfMonth = date.lengthOfMonth();
        System.out.println(year + "��      " + monthName);
        System.out.println("------------------------------------------------");
        System.out.printf("%5s%5s%5s%5s%5s%5s%5s%n", "һ", "��", "��", "��", "��", "��", "��");
        //����1��1�����ܼ�������1����һ������7������
        int dayOfWeek = date.getDayOfWeek().getValue();
        //���ǰ���ո��������һ��dayOfWeek��ֵΪ1��������ո�
        for (int i = 2; i <= dayOfWeek; i++) {
            System.out.printf("%6s", " ");
        }

        //������µ�����
        for (int i = 1; i <= dayOfMonth; i++) {
            System.out.printf("%6d", i);
            if ((dayOfWeek + i - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
