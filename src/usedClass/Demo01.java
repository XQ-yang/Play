package usedClass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: 小强
 * @Date: 2021/4/13 0013
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public class Demo01 {
    public static void main(String[] args) {
        int a = 10,b = 3;

        System.out.println(a<<b);    //42
        System.out.println(System.currentTimeMillis());    //84

        long currenttime = System.currentTimeMillis();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
        Date date = new Date(currenttime);
        System.out.println(formatter.format(date));
    }
}
