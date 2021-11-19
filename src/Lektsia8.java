import java.io.*;
import java.util.Scanner;

/**
 * @author killersssurprise
 * 19.11.21
 */
public class Lektsia8 {

    public static String filePath = "sample1.txt";

    public static void main(String[] args) {


//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите любое число: ");
//        int num=0;
//
//        try{
//            num = in.nextInt();
//        }catch(InputMismatchException e){
//            System.out.print("Вы ввели не число!");
//        }catch(Exception e){
//            System.out.print("У вас произошла другая ошибка!");
//        }
//
//        System.out.println("Вы ввели число: "+num);
///////////////////

//
        ////////////////
//        FileReader fr = new FileReader( "sample2.txt" );
//        fr.close();

        //генерация и запись элементов массива в файл
//        generateAndWriteMas();

        //проверка того, что файл существует и считывает первую строку файла, если не существует - выводит ошибку.
//        checkFileIfExisistAndPrint();

//        System.out.println("Обработка дальнейших действий в программе после выдачи ошибки! ");

        int[] mmm = readMasFromFile(filePath);
//
        if(mmm!=null){
            for (int i = 0; i < mmm.length; i++) {
                System.out.println("Очердное значение элемента из массива, который из файла: "+mmm[i]);
            }
        }else{
            System.out.println("Файл является null");
        }
//
//        System.out.println("Обработка дальнейших действий в программе после выдачи ошибки! ");

    }

    public static void generateAndWriteMas(){
        Scanner in = new Scanner(System.in);
        int[] mas = new int[5];

        for (int i = 0; i < mas.length; i++) {
            System.out.println("Введите любое число под индексом: "+i);
            mas[i] = in.nextInt();
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print("Число под индексом: "+i+"\t равно: "+mas[i]);
            System.out.println();
        }


        FileWriter fw = null;
        try {
            fw = new FileWriter( filePath );

            String output = "";
            for (int i = 0; i < mas.length; i++) {
//                fw.write(mas[i]); // запись в бинарном виде
                output+=mas[i]+" ";
            }
            fw.write(output); // запись в текстовом виде

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkFileIfExisistAndPrint() {
        FileReader fr = null;
        try {
            fr = new FileReader(filePath);

            BufferedReader br = new BufferedReader(fr);

            try {
                String line = br.readLine();

                System.out.println("Файл существует и содержание файла: " + line);

            } catch (IOException e) {
//                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.err.println("Файла sample2.txt не существует!");
        }
        if (fr != null) {
            try {
                fr.close();
            } catch (IOException e) {
//            e.printStackTrace();
            }
        }
    }

    public static int[] readMasFromFile(String path){

        String allElements = "";
        int[] output = null;

        FileReader fr = null;
        try {
            fr = new FileReader(filePath);

            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line!=null){
                allElements+=line+" ";
                line = br.readLine();
            }

            String[] splitted = allElements.split(" ");
            output = new int[splitted.length];
            for (int i = 0; i < splitted.length; i++) {
//                    System.out.println("Элемент под индексом "+i+"\t равен: "+splitted[i]);
                output[i] = Integer.parseInt(splitted[i]);
            }


        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.err.println("Файла sample2.txt не существует!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (fr != null) {
            try {
                fr.close();
            } catch (IOException e) {
//            e.printStackTrace();
            }
        }

        return output;
    }
}
