/**
 * @Description:
 * @Author: 小强
 * @Date: 2021/4/18
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public class SparseArray {
    public static void main(String[] args) {
        /*
        定义一个 稀疏数组，随机赋值
         */
        int[][] array1 = new int[10][10];
        array1[3][5] = 2;
        array1[4][1] = 13;
        array1[7][8] = 9;
        array1[0][8] = 39;
        array1[6][4] = 27;

        /*
        遍历原数组并统计有效值的个数
         */
        int sum = 0;
        System.out.println("原始二维数组：");
        for(int row[]:array1){
            for(int col:row){
                System.out.print(col+"\t");
                if (col != 0)
                    sum++;
            }
            System.out.println();
        }



        /*
        定义一个新数组存储稀疏数组
         */
        int[][] array2 = new int[sum+1][3];
        array2[0][0]=array1.length;
        array2[0][1]=array1[0].length;
        array2[0][2]=sum;

        int count = 0;  //作用是标识第几个非0数
        /*
        为稀疏数组赋值
         */
        for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j <array1[0].length ; j++) {
                if (array1[i][j] != 0){
                    array2[++count][0]=i;       //说明有非0数，count+1
                    array2[count][1]=j;
                    array2[count][2]=array1[i][j];
                }
            }
        }

        System.out.println("转化为稀疏数组：");
        for(int row[]:array2){
            for(int col:row){
                System.out.print(col+"\t");
            }
            System.out.println();
        }

        /*
        创建新数组array3，并读取array2中的数据为array3赋值
         */
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }
        System.out.println("还原原数组：");
        for (int row[]:array3) {
            for (int col:row) {
                System.out.print(col+"\t");
            }
            System.out.println();
        }

    }
}
