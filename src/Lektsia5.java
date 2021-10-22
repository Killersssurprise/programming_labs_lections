import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author killersssurprise
 * 22.10.21
 */
public class Lektsia5 {


    public static void main(String[] args) {

//        String s = "Привет мир!";
//
//        int lab_num = 5; // 5 => "5"
//
//
//
////        s+=" Это лабораторная работа номер: "; // s+= .... ====    s = s + ....
////
////        s+=lab_num;
//
//        int a = 5;  // a+b = 5+7 = 12
//        int b = 7;  //string + a+b = string + "5" + "7"
//
////        s+=" Сумма чисел a+b равна: "; // s+= .... ====    s = s + ....
////        s+=" Сумма чисел a+b равна: "+ a + b; // s+= .... ====    s = s + ....
//        s+=" Сумма чисел a+b равна: "+ (a + b); // s+= .... ====    s = s + ....
//
////        s+=a+b;
//
////        System.out.println(s);


        ////////////////


//        String string2 = "4abc";
//        String string1 = "4";
//        int c = 5;
//
////        string+=c;
//
//
//        try{
////            c+=Integer.parseInt(string1);
////            System.out.println("Все хорошо отработало для первой переменной, на вход подали корректный string");
////            c+=Integer.parseInt(string2);
//            c+=Integer.parseInt(string1);
//            c/=0;
//
//            System.out.println("Все хорошо отработало для второй переменной, на вход подали корректный string");
//        }catch(NumberFormatException e){
//            System.out.println("Все очень плохо, некорректный формат ввода :( "+e);
//        }catch(ArithmeticException e){
//            System.out.println("Все очень плохо, вы не умеете считать :( "+e);
//        }catch(Exception e){
//            System.out.println("Все очень плохо :( "+e);
//        }
//
//
//        System.out.println(c);


        // П - Upper case, п - lower case

        String str = "Привет мир! Это ваша 5 лабораторная Работа, как же она прекрасна!";

//        System.out.println(str.toLowerCase());
//
//
        String whatToFind = "           РАБОТА      ".trim().toLowerCase();
//
//        System.out.println(whatToFind);

//        if(str.toLowerCase().contains(whatToFind)){
//            System.out.println("Да, содержит!");
//
//
//            int position = str.toLowerCase().indexOf(whatToFind);
//            System.out.println("Позиция вхождения подстроки в строке на индексе: "+position);
//
//            String subString = str.substring(position);
//            System.out.println(subString);
//
//            String subString2 = str.substring(0, position);
//            System.out.println(subString2);
//
//        }else{
//            System.out.println("Нет, не содержит!");
//        }


//        char a = 'a';
//        String abc = "abc"; // "abc".toCharArray => {'a','b','c'}
//
////        char[] whatToFindCharArray = whatToFind.toCharArray();
//        char[] whatToFindCharArray = "котик".toCharArray();
//        char[] mas = {'c', 'd', 'e'};
//
////        mas = abc.toCharArray();
//        mas = str.toLowerCase().toCharArray();
//
//        boolean stringContainSubstring = false;
//
//
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(mas[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < whatToFindCharArray.length; i++) {
//            System.out.print(whatToFindCharArray[i] + " ");
//        }
//
//        int counter = 0;
//
//        for (int i = 0; i < mas.length; i++) {
//
//            int k = 0;
//
//            if (mas[i] == whatToFindCharArray[0]) {
//                counter++;
//
//                for (int j = 0; j < whatToFindCharArray.length; j++) {
//                    if (whatToFindCharArray[j] == mas[i + k]) {
//                        k++;
//
//                        if (j == whatToFindCharArray.length - 1) {
//                            stringContainSubstring = true;
//                        }
//
//                    } else {
//                        break;
//                    }
//                }
//
//            }
//
//        }

//        System.out.println("Количество возможных точек вхождения: " + counter);
//        System.out.println("Содержит ли подстрока строку? : " + contains(str, whatToFind));

//        String stroka1 = "Много котиков на лужайке";
////        String stroka1 = "Много котиков на лужайке ко";
//        String stroka2 = "коты";
//
//        System.out.println("Содержит ли подстрока строку? : " + contains(stroka1, stroka2));


        String regex="java"; // шаблон строки ”java”;
        String regex2="\\d{3}"; // шаблон строки из трех цифровых символов;

//        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);//поиск совпадений с шаблоном будет производиться без учета регистра символов.


        //ubiyca1999
//        String text = "Егор Алла Александр А9 Иван";
//        String text = "ubiycaodinodin dvadvatriubiycaodinodin 2228ubiyca1999  ubiyca19  1999ubiyca Егор Алла Александр";
//        String text = "AA333 4444 555555 33 233 453 A222 46343 2334 444";
//        String text = "AH2233AA A345EADPR A556BK161 A556BK82 A556BK5";
        String text = "AH2233AA A345EADPR A556BK161 A556BK82 A556BK5 А456АЯ222";

        String[] elements = text.split(" ");
//        Pattern pattern = Pattern.compile("\\b[a-zA-Z]{2}\\d{3}\\b");
//        Pattern pattern = Pattern.compile("\\b[a-zA-Z]{2}\\d{4}[a-zA-Z]{2}\\b");
//        Pattern pattern = Pattern.compile("\\b[a-zA-Z]{1}\\d{3}[a-zA-Z]{2}DPR\\b");
        Pattern pattern = Pattern.compile("\\b[a-zA-Zа-яА-Я]{1}\\d{3}[a-zA-Zа-яА-Я]{2}\\d{1,3}\\b");

//        for(int i = 0; i<elements.length; i++){
//            System.out.println("Element: "+elements[i]);


//            Matcher matcher = pattern.matcher(elements[i]);
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
//                System.out.println(elements[i].substring(matcher.start(), matcher.end()));
                System.out.println(text.substring(matcher.start(), matcher.end()));
            }
//        }



//Метасимволы для поиска совпадений границ строк или текста
// Метасимвол 	Назначение
//  ^ 	        начало строки
//  $ 	        конец строки
//  \b 	        граница слова
//  \B 	        не граница слова
//  \A 	        начало ввода
//  \G 	        конец предыдущего совпадения
//  \Z 	        конец ввода
//  \z 	        конец ввода


//Метасимволы для поиска символьных классов
//  Метасимвол 	Назначение
//  \d 	        цифровой символ
//  \D 	        нецифровой символ
//  \s 	        символ пробела
//  \S 	        непробельный символ
//  \w 	        буквенно-цифровой символ или знак подчёркивания
//  \W 	        любой символ, кроме буквенного, цифрового или знака подчёркивания
//  . 	        любой символ

//Метасимволы для поиска символов редактирования текста
//  Метасимвол 	Назначение
//  \t 	        символ табуляции
//  \n 	        символ новой строки
//  \r 	        символ возврата каретки
//  \f 	        переход на новую страницу
//  \ u 0085 	символ следующей строки
//  \ u 2028 	символ разделения строк
//  \ u 2029 	символ разделения абзацев

// Метасимволы для группировки символов
//  Метасимвол 	Назначение
//  [абв] 	    любой из перечисленных (а,б, или в)
//  [^абв] 	    любой, кроме перечисленных (не а,б, в)
//  [a-zA-Z] 	слияние диапазонов (латинские символы от a до z без учета регистра )
//  [a-d[m-p]] 	объединение символов (от a до d и от m до p)
//  [a-z&&[def]] 	пересечение символов (символы d,e,f)
//  [a-z&&[^bc]] 	вычитание символов (символы a, d-z)

// Метасимволы для обозначения количества символов – квантификаторы. Квантификатор всегда следует после символа или группы символов.
//  Метасимвол 	Назначение
//  ? 	        один или отсутствует
//  * 	        ноль или более раз
//  + 	        один или более раз
//  {n} 	    n раз
//  {n,} 	    n раз и более
//  {n,m} 	    не менее n раз и не более m раз

    }


    public static boolean contains(String str, String whatToFind){
//        char a = 'a';
//        String abc = "abc"; // "abc".toCharArray => {'a','b','c'}
//
//        char[] whatToFindCharArray = whatToFind.toCharArray();
        char[] whatToFindCharArray = whatToFind.toCharArray();
//        char[] mas = {'c', 'd', 'e'};

//        mas = abc.toCharArray();
        char[] mas = str.toLowerCase().toCharArray();

        boolean stringContainSubstring = false;


        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < whatToFindCharArray.length; i++) {
            System.out.print(whatToFindCharArray[i] + " ");
        }

        int counter = 0;

        for (int i = 0; i < mas.length; i++) {

            int k = 0;

            if (mas[i] == whatToFindCharArray[0]) {
                counter++;

                for (int j = 0; j < whatToFindCharArray.length; j++) {
                    if (whatToFindCharArray[j] == mas[i + k]) {
                        k++;

//                        {'c', 'd', 'e'} количество элементов у нас 3, он возвращается .length, а крайний индекс - 2, т.е. элементы идут от 0 до 2х, 0, 1, 2

                        if (j == whatToFindCharArray.length - 1) {
                            stringContainSubstring = true;
                        }

                    } else {
                        break;
                    }
                }

            }

        }

        return  stringContainSubstring;
    }

}
