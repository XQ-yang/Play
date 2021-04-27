/**
 * @Description:
 * @Author: Сǿ
 * @Date: 2021/4/18
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public class SparseArray {
    public static void main(String[] args) {
        /*
        ����һ�� ϡ�����飬�����ֵ
         */
        int[][] array1 = new int[10][10];
        array1[3][5] = 2;
        array1[4][1] = 13;
        array1[7][8] = 9;
        array1[0][8] = 39;
        array1[6][4] = 27;

        /*
        ����ԭ���鲢ͳ����Чֵ�ĸ���
         */
        int sum = 0;
        System.out.println("ԭʼ��ά���飺");
        for(int row[]:array1){
            for(int col:row){
                System.out.print(col+"\t");
                if (col != 0)
                    sum++;
            }
            System.out.println();
        }



        /*
        ����һ��������洢ϡ������
         */
        int[][] array2 = new int[sum+1][3];
        array2[0][0]=array1.length;
        array2[0][1]=array1[0].length;
        array2[0][2]=sum;

        int count = 0;  //�����Ǳ�ʶ�ڼ�����0��
        /*
        Ϊϡ�����鸳ֵ
         */
        for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j <array1[0].length ; j++) {
                if (array1[i][j] != 0){
                    array2[++count][0]=i;       //˵���з�0����count+1
                    array2[count][1]=j;
                    array2[count][2]=array1[i][j];
                }
            }
        }

        System.out.println("ת��Ϊϡ�����飺");
        for(int row[]:array2){
            for(int col:row){
                System.out.print(col+"\t");
            }
            System.out.println();
        }

        /*
        ����������array3������ȡarray2�е�����Ϊarray3��ֵ
         */
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }
        System.out.println("��ԭԭ���飺");
        for (int row[]:array3) {
            for (int col:row) {
                System.out.print(col+"\t");
            }
            System.out.println();
        }

    }
}
