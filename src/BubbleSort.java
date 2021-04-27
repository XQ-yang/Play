/**
 * @Description:
 * @Author: 小强
 * @Date: 2021/4/18 0018
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        //此for循环是需要进行几趟比较
        for (int i = 0; i < arr.length - 1; i++) {
            //此for循环是相邻两数之间比较
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    //交换位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort1(int[] arr) {
        int temp;//临时变量

        boolean flag;//是否交换的标志

        for (int i = 0; i < arr.length - 1; i++) {   //表示趟数，一共 arr.length-1 次
            // 每次遍历标志位都要先置为false，才能判断后面的元素是否发生了交换
            flag = false;
            for (int j = arr.length - 1; j > i; j--) { //选出该趟排序的最大值往后移动
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;    //只要有发生了交换，flag就置为true
                }
            }
            // 判断标志位是否为false，如果为false，说明后面的元素已经有序，就直接return
            if (!flag) break;
        }
    }

    /**
    测试
     */
    public static void main(String[] args) {
        //定义一个待排序的数组
        int[] array = {2, 35, 4, 64, 13, 8, 5, 33, 62, 59, 25};
        //调用bubbleSort冒泡排序算法
        bubbleSort1(array);
        //输出排序后的数组
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }


}
