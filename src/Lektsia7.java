/**
 * @author killersssurprise
 * 12.11.21
 */
public class Lektsia7 {

    public static void main(String[] args) {

//        int[] mas = {5, 7, -2, 6, 9, 4};
//
//        int sum = 0;
//
//        for (int i = 0; i < mas.length; i++) {
//            sum+=mas[i];
//        }
//
//        System.out.println("Сумма элементов массива итерационно равна: "+sum);
//
//        int sumR = 0;
//        int sumRec = getSumRecursive(sumR, mas, 0);
//
//
//        System.out.println("Сумма элементов массива рекурсивно равна: "+sumRec);


        int[][] matrix = generateMatrix(5, 5);
//        int[][] matrixB = generateMatrix(7, 2);



       printMatrix(matrix);
//       printMatrix(matrixB);

        System.out.println("Сумма итерационно: "+getIterSumMatrix(matrix));
        System.out.println("Сумма рекурсивно: "+getRecSumMatrix(matrix,0, 0, 0));


        System.out.println("Матрица без 1 строки и 1 столбца:");
        printMatrix(getMinor(matrix, 1, 1));


    }

    public static int getRecSumMatrix(int[][] matrix, int col, int row, int sum){

        if(col ==  matrix.length-1 && row == matrix[col].length-1){
            return sum+matrix[col][row];
        }else{

            sum+=matrix[col][row];
            row++;
            if(row == matrix[col].length){
                col ++;
                row = 0;
            }
            return getRecSumMatrix(matrix, col, row, sum);

        }


    }


    public static int[][] getMinor(int[][] matrix, int minusCol, int minusRow){

        int[][] output = new int[matrix.length-1][matrix[0].length-1];
//        int[][] output = new int[5][4];

        int e = 0, k = 0;


        for (int i = 0; i < matrix.length; i++) {

            k=0;
            if(i == minusCol){
                continue;
            }

            for (int j = 0; j < matrix[i].length; j++) {

                if(j==minusRow){
                    continue;
                }

                    //записываем элемент

                    output[e][k] = matrix[i][j];
                    k++;

            }
            e++;

        }

        return output;
    }

    public static int getIterSumMatrix(int[][] matrix){

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];
            }
        }

        return sum;
    }


    public static int[][] generateMatrix(int sizeA, int sizeB){
        int[][] matrix = new int[sizeA][sizeB];


        for (int i = 0; i < sizeA; i++) {

            for (int j = 0; j < sizeB; j++) {
                matrix[i][j] = i*j+1;
            }

        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " \t");
            }


            System.out.println();
        }
    }


    public static int getSumRecursive(int sum, int[] mas, int index){

        if(index == mas.length-1){
            return sum+mas[index];
        }else{
            sum+=mas[index];
            index++;

            return getSumRecursive(sum, mas, index);
        }


    }







}
