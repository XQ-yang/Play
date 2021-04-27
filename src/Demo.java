import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author:yxq
 * @Date: 2020/7/16 22:30
 * @Tools: IntelliJ IDEA
 **/
public class Demo {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个日期");
        String str = sc.nextLine();
        System.out.println("输入第二个日期");
        String str1 = sc.nextLine();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sd.parse(str);
        Date d1 = sd.parse(str1);
        long l = 0;
        if (d.after(d1)) {
            l = d.getTime() - d1.getTime();
        } else {
            l = d1.getTime() - d.getTime();
        }
        long a = 1000 * 60 * 60 * 24;
        long day = l / a;
        long week = day / 7;
        System.out.println("两个日期相隔"+ day + "天");
        System.out.println("两个日期相隔" + week + "周");
    }
}
