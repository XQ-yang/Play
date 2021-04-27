
/**
 * @Author:yxq
 * @Date: 2020/7/20 11:08
 * @Tools: IntelliJ IDEA
 **/
public class Try {
    public static void main(String[] args) {
        int a[] = new int[50];
        for (int i = 0; i < a.length ; i++) {
            a[i]= (int) (Math.random()*(56-15)+15);
            System.out.print(a[i]+"  ");
            if (a[i]<=15){
                System.out.println();
                System.out.println(a[i]);
            }
        }

        /*int i = 1;
        i = i++;        //前一个i是1，后一个i是2
        int j = i++;    //j是1，i是2，这里容易被迷惑，此处的i是上行左边的i
        int k = i + ++i * i++;      //第一个i是2，第二个i是3，这条语句执行之后第三个i是4，运算式是k=2+3*3
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);*/

        System.out.println("================================");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("++++++++++++++++++++++++++++++++++");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

}
