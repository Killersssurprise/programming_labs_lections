/**
 * @author killersssurprise
 * 15.10.21
 */
public class Lektsia4 {

    public static void main(String[] args) {

//                   0  1   2   3  4  5
        int[] a = {4, -1, 6, 12, 0, 41}; //0
//                  {4, -1, 6, 12, 0, 41}; //1
//                  {4, -1, 6, 12, 0, 41}; //2
//                  {4, -1, 6, 12, 0, 41}; //3

//        a[i][j]

        //должны вывести последний a.length-1
        //должны вывести последний (a.length-1) - 1
        //должны вывести последний (a.length-1) - 1 - 1
        // .........
        // пока что? пока не достигнем 0, потому что после нуля будет -1 и мы выйдем за рамки массива!

        // -2 -1 0 1 2
//        int tmp = a.length;
//        System.out.println(a[a.length-1]);

//        for (int i = a.length - 1; i >= 0; i--) {
////            System.out.println(a[i]);
//
//            if (isEven(a[i], false)) {
////            if (isEven(a[i], true)) {
//                System.out.println(a[i] + " является четным!");
//            } else {
//                System.out.println(a[i] + " является нечетным!");
//            }
//
//        }

        int mas2[][] = {
                {4, -1, 6, 12, 0, 41},
                {5, -2, 7, 13, 1, 42},
                {6, -3, 8, 14, 2, 43},
                {7, -4, 9, 15, 3, 44}
        };




        printMatrix(mas2, true, true);

        printMatrix(mas2, false, false);

//        //слева направо, сверху вниз
//        for (int i = 0; i < mas2.length; i++) {
//
//            for (int j = 0; j < mas2[i].length; j++) {
//                System.out.print(mas2[i][j]+ " \t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        //справа налево, снизу вверх
//        for (int i = mas2.length - 1; i >= 0; i--) {
//
//            for (int j = mas2[i].length - 1; j >= 0; j--) {
//                System.out.print(mas2[i][j]+ " \t");
//            }
//            System.out.println();
//        }

    }


    //odd - нечетные, even  - четные
    //четный - деление на 2 без остатка
    //% - остаток от деления

    public static boolean isEven(int a) {

//        if(a%2==0){
//            return true;
//        }else{
//            return false;
//        }

        return a % 2 == 0;

    }

    public static boolean isEven(int a, boolean oposite) {
        if (oposite) {
            return !isEven(a);
        } else {
            return isEven(a);
        }

    }


    public static void printMatrix(int[][] mas2, boolean fromLeftToRight, boolean fromTopToBottom) {

        if (fromLeftToRight) {

            if (fromTopToBottom) {
                for (int i = 0; i < mas2.length; i++) {

                    for (int j = 0; j < mas2[i].length; j++) {
                        System.out.print(mas2[i][j] + " \t");
                    }
                    System.out.println();
                }
            } else {
                /////?
            }


        } else {

            if (fromTopToBottom) {
                //// ?
            } else {
                for (int i = mas2.length - 1; i >= 0; i--) {

                    for (int j = mas2[i].length - 1; j >= 0; j--) {
                        System.out.print(mas2[i][j] + " \t");
                    }
                    System.out.println("");
                }
            }

        }

    }

//   | 1 2 3 |
//   | 4 5 6 |
//   | 7 8 0 |

}
