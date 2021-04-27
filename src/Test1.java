import java.util.Scanner;

/**
 * @Author:yxq
 * @Date: 2020/11/7 23:46
 * @Tools: IntelliJ IDEA
 **/
public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入要加密的字符串：");
        String num = input.nextLine();
        char[] ch = num.toCharArray();      //将字符串转化为字符数组
        char[] ch2 = new char[ch.length];   //定义一个新数组存储加密后的数组
        for (int i = 0; i < ch.length; i++) {       //遍历字符数组
            if ((ch[i] >= 'A' && ch[i] <= 'Z')) {
                switch (ch[i]) {        //用于判断后三个字母替换为ABC
                    case 'X':
                        ch2[i] = 'A';
                        break;
                    case 'Y':
                        ch2[i] = 'B';
                        break;
                    case 'Z':
                        ch2[i] = 'C';
                        break;
                    default:
                        ch2[i] = (char) (ch[i] + 3);
                        break;
                }
            } else
                ch2[i] = ch[i];
        }


        String new1 = new String(ch2);      //将字符数组转化为字符串
        System.out.println("加密后的字符串为：");
        System.out.println(new1);       //输出字符串
    }
}
