package usedClass;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * @Description:
 * @Author: 小强
 * @Date: 2021/4/14 0014
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个年份和月份：(格式为2015 7)");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        //得到本月的第一天日期
        LocalDate date = LocalDate.of(year, month, 1);
        String monthName = date.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        //返回当月天数
        int dayOfMonth = date.lengthOfMonth();
        System.out.println(year + "年      " + monthName);
        System.out.println("------------------------------------------------");
        System.out.printf("%5s%5s%5s%5s%5s%5s%5s%n", "一", "二", "三", "四", "五", "六", "日");
        //返回1月1日是周几，返回1是周一，返回7是周日
        int dayOfWeek = date.getDayOfWeek().getValue();
        //输出前导空格，如果是周一（dayOfWeek的值为1）不输出空格
        for (int i = 2; i <= dayOfWeek; i++) {
            System.out.printf("%6s", " ");
        }

        //输出该月的日期
        for (int i = 1; i <= dayOfMonth; i++) {
            System.out.printf("%6d", i);
            if ((dayOfWeek + i - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
