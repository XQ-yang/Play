package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * @Description:
 * @Author: 小强
 * @Date: 2021/4/16 0016
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public class Demo01 {
    public static void main(String[] args) {

        InputStream in = null;
        try {
            in = new FileInputStream(new File("D:\\file\\text.txt"));
            int datal = in.read();
            System.out.println((byte) datal);

            byte[] b = new byte[10];
            in.read(b);
            System.out.println(Arrays.toString(b));
            System.out.println(new String(b));

            in.read(b, 3, 5);
            System.out.println(Arrays.toString(b));
            System.out.println(new String(b));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in == null)
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

}
