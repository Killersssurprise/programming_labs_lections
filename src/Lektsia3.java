/**
 * @author killersssurprise
 * 08.10.21
 */
public class Lektsia3 {

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

        public void print() {
            System.out.println(author + " " + name + " " + year + " " + g);
        }
    }

    public static void main(String[] args) {


        Book b1 = new Book();
        Book b2 = new Book("Достоевский", "Идиот", 1234, Group.X);


//        System.out.println(b2.author);
//        System.out.println(b1.name.substring(3));

        b1 = new Book("Достоевский", "Идиот", 1234, Group.X);
        b2 = new Book("Дж. Оруэлл", "1984", 1984, Group.X);
        Book b3 = new Book("Хаксли", "О дивный новый мир!", 1984, Group.X);

        Book[] books = {b1, b2, b3};

//        System.out.println(books[0].name);

//        for (int i = 0; i < books.length; i++)
//            System.out.println(books[i].name);


//        int abc = -1;
//
//        for( ; ; ){
////            abc--;
//            abc++;
//
//            System.out.println("ABC: "+abc);
//
//            if(abc>10){
//                break;
//            }
//
//        }

        ///-<<<<<<<


//        for(int i =0; i<books.length;i++){
//
//            if(!books[i].name.equals("1984")){
//
//                continue;
//            }
//
//            System.out.println("Мне нравится эта кника! : "+books[i].name);
//        }


        boolean isOk = true;
        int money = 5000;
        int day = 1;
        int everydayCharge = 500;

//        while (isOk) { ///continue break
//
//            if (money > 0) {
//                isOk = true;
//            }else{
//                isOk = false;
//            }
//
//            money -= everydayCharge; // -= =======  money = money - everydayCharge
//
//            day++;
//
//            System.out.println("Все хорошо, живем! Мы не бомж! Кушать есть! Текущий остаток: "+money + " руб. День по счету: "+day);
//
//            if(isOk){
//               continue;
//            }
//
//            System.out.println("Хороший был парень, помянем!");
//
//        }


//        do{
//
//            money = 0;
//            money -= everydayCharge;
//            System.out.println("Хороший был парень, помянем!");
//
//            if (money > 0) {
//                isOk = true;
//            } else {
//                isOk = false;
//            }
//
//
//            if(isOk){
//                System.out.println("А нет, еще живой!");
//            }
//
//
//        }while(isOk);


//        for (Book b : books) {
//            System.out.println("Имя книги: "+b.name);
//        }
//
//
//        if(books[0].name.equals("Незнайка на луне")){
//
//        }else if(books[0].name.equals("1984")){
//            ////
//        }else if(books[0].name.equals("48 законов власти")){
//
//        }else {
//
//        }


//        Book bbb = books[0];

        String bookName = "Идиот";

        switch (bookName){

            case "Незнайка на луне":{
                System.out.println("У нас нет такой книги, но мы ее скоро купим!");
                break;
            }

            case "Идиот":{}
            case "1984":{}
            case "О дивный новый мир!":{
                System.out.println("У нас есть такая книга!");
                break;
            }

            default:{
                System.out.println("У нас нет такой книги");
                break;
            }

        }
//<-----
//        System.out.println(books[0].name);

    }

}
