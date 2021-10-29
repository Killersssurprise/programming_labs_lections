/**
 * @author killersssurprise
 * 29.10.21
 */
public class Lektsia6 {


    public static void main(String[] args) {

        int mas[] = {2, 5, 7, 14, 1, 6};
        int mas2[] = {5, 5, 33 - 7, 14};
        float mas3[] = {3.14f, 4.45f, -12.5f, 23.6f};


        int sum = sumIterative(mas);

        System.out.println("Сумма элементов массива 1 равна: " + sum);

        float sum2 = sumIterative(mas2, true);

        System.out.println("Сумма элементов массива 2 равна: " + sum2);

        float sum3 = sumIterative(mas3);

        System.out.println("Сумма элементов массива 3 равна: " + sum3);

        System.out.println("Минимальный элемент массива рекурсивно: "+minRecursive(mas,0, mas[0]));

    }


    public static int sumIterative(int[] mas) {

        int sum = 0;

        for (int i = 0; i < mas.length; i++) {
            sum += mas[i]; // sum = sum + mas[i]
        }

        return sum;
    }

    public static float sumIterative(float[] mas) {

        float sum = 0;

        for (int i = 0; i < mas.length; i++) {
            sum += mas[i]; // sum = sum + mas[i]
        }

        return sum;
    }


    public static float sumIterative(int[] abracadabra, boolean inversion) {

        float sum = sumIterative(abracadabra);

        if (inversion) {
            return -sum;
        } else {
            return sum;
        }
    }

//    public static float sumIterative(float[] mas) {
//
//        int sum = 0;
//
//        for (int i = 0; i < mas.length; i++) {
//            sum += mas[i]; // sum = sum + mas[i]
//        }
//
//        return sum;
////        return -1f;
//    }


    public static float minRecursive(int[] mas, int pos, int min) {

        if(pos == mas.length-1){
            return min;
        }else{


            if(mas[pos]<min){
                min = mas[pos];
            }
            pos++;



        }
        return minRecursive(mas, pos, min);
    }

}
