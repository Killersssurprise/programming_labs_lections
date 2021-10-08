/**
 * @author killersssurprise
 * 01.10.21
 */
public class Lektsia2 {

    public enum Colors {
        RED, BLUE, GREEN, ORANGE, YELLOW, PURPLE, WHITE
    }

    public enum Group {
        X, Y, C
    }

    //construct
    public static class Book {

        public String author = "Автор не установлен!";
        public String name;
        public int year;
        public Group g;

        public Book(String author, String name, int year, Group g) {
            this.author = author;
            this.name = name;
            this.year = year;
            this.g = g;
        }

        public Book() {
        }

        public void print(){
            System.out.println(author+" "+name+" "+year+" "+g);
        }
    }

    public static void main(String[] args) {

//
//        String author1 = "Достоевский";
//        String name ="Идиот";
//        int year1 = 1234;
//        Group g1 = Group.X;
//
//        String author1 = "Достоевский";
//        String name ="Идиот";
//        int year1 = 1234;
//        Group g1 = Group.X;
//
//        String author1 = "Достоевский";
//        String name ="Идиот";
//        int year1 = 1234;
//        Group g1 = Group.X;

        Book b1 = new Book();
        Book b2 = new Book("Достоевский", "Идиот", 1234, Group.X);


//        System.out.println(b2.author);
//        System.out.println(b1.name.substring(3));

        b1 = new Book("Достоевский", "Идиот", 1234, Group.X);
        b2 = new Book("Дж. Оруэлл", "1984", 1984, Group.X);
        Book b3 = new Book("Хаксли", "О дивный новый мир!", 1984, Group.X);

        Book[] books = {b1, b2, b3};

//        for (int i = 0; i < books.length; i++) {
////            Book tmp = books[i];
////
////            System.out.println(tmp.author+" "+tmp.name+" "+tmp.year+" "+tmp.g);
//
////            System.out.println(books[i].author+" "+books[i].name+" "+books[i].year+" "+books[i].g);
//           books[i].print();
//
//        }


//        19%3==1
//
//                19-3 = 16
//                        16 - 3 = 13
//                                13 - 3 = 10
//                                        10 - 3 = 7
//                                                7 - 3 = 4
//                                                        4 - 3 = 1
//                                                                1 - 3? нет, значит остается 1
//
//            19 - (6*3) = 1
//
//
//                    6%2==0
//                            6 - 2 = 4
//                                    4 - 2 = 2
//                                            2 - 2 = 0


//        System.out.println(b1.author+" "+b1.name+" "+b1.year+" "+b1.g);


        //         0  1  2  3  4  5
//        int[] a = {2, 32, 56, 33, 76, 84};
//        float[] b = {
//                2.1f, //0
//                32.4f,
//                56.3f,
//                33.0f,
//                76.f,
//                84.2f};
//
//        String[] names = {"Маша", "Ваня", "Петя", "Даша"};//10000
//
//        int position = 1;
//
//        System.out.println("Элемент под индексом: " + position + " равен значению: " + b[position]);
//        System.out.println("Сегодня украли конфеты!");
//        System.out.println("Предполагаемые воришки: ");
//
////        int aaa = 1;
////        aaa++ === aaa = aaa +1
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.print(names[i] + " ");
//        }
//
//        System.out.println();
//
//        System.out.println("Мы не знаем кого наказать, поэтому дадим по голове каждому второму!");
//
//        //0 1 2 3
//        for (int i = 0; i < names.length; i++) {
//
//            if(i%2!=0){
//                System.out.println(names[i] + "Получает по голове!");
//            }
//
//        }

//->>
//        System.out.println(i);


//        for (a; b; c) {
//            //а - итератор какой-то, который используется ТОЛЬКО внутри цикла
//            //условие выхода из цикла, когда переменная внутри true - то работаем, false - выходим
//            //что мы делаем после каждой итерации
//        }


        //вывести числа от n до 10 при условии что n < 10
//        Colors tmp = Colors.BLUE;

//        String c = "BLUE";
//        if(c.equals("BLUE")){
//            tmp = Colors.BLUE;
//        }


//        switch(tmp){
//            case RED:{
//                System.out.println("Вы выбрали красный!");
//                break;
//            }
//            case BLUE:{
//                System.out.println("Вы выбрали BLUE!");
//                break;
//            }
//            case GREEN:{
//                System.out.println("Вы выбрали GREEN!");
//                break;
//            }
//            case ORANGE:{
//                System.out.println("Вы выбрали ORANGE!");
//                break;
//            }
//            case YELLOW:{
//                System.out.println("Вы выбрали YELLOW!");
//                break;
//            }
//            case PURPLE:{
//                System.out.println("Вы выбрали PURPLE!");
//                break;
//            }
//            default:{
//                break;
//            }
//        }


    }

}
