/**
 * @author killersssurprise
 * 24.09.21
 */
public class Lektsia1 {

    public static void main(String[] args) {
        //integer
//        int a = Integer.MAX_VALUE;
//        int b = Integer.MIN_VALUE;

//        long c = Long.MAX_VALUE;
//        long d = Long.MIN_VALUE;

//        float f1 = Float.MAX_VALUE;
//        float f2 = Float.MIN_VALUE;


//        System.out.println(a);
//        System.out.println(b);

//        System.out.println(c);
//        System.out.println(d);

//        float f = 0.99f;
//        int a = 5;
//
////        a = (int)(a+f);
//
//        f = f+a;

        //false/true
//        boolean b = true;
//
//        System.out.println(f);

//        sayNo();

//        <, >, <=, >=, !=, ==

        boolean isGuyPretty = true;
//        String hear = "Красные";
        String hear = null;
        int money = 100000;


//        if(10000!=10000){
////            работает
//        }

//        System.out.print(hear.equals("Красные"));

        //&&, &, ||, |

//        if(isGuyPretty | hear.equals("Красные")){
//            goToTheDate();
//        }else{
//            sayNo();
//        }


//        if(isGuyPretty){
//
//            if(money>10000){
//                goToTheDate();
//            }else{
//                sayNo();
//            }
//
//        }else{
//
//            if(money>=100000){
//                goToTheDate();
//            }else{
//                sayNo();
//            }
//
//
//        }

//        if (isGuyPretty || money > 10000) {
//            goToTheDate();
//        } else {
//            sayNo();
//        }


//        char a = 'a';
//
//        String hw = "Hello world!";
//
//        System.out.print(a);
//        System.out.print(hw);

        int momMoney = 100;
        int ostatok = goToTheShop(momMoney);
        int zanachka = 10;

        System.out.println(
                "Мама, я сходил в магазин и у меня осталось : "+
                        ostatok + zanachka+ " рублей!"
        );

        System.out.println(
                "Мама, я сходил в магазин и у меня осталось : "+
                        (ostatok + zanachka)+ " рублей!"
        );


//        100 -> "100";
//        System.out.println(f1);
//        System.out.println(f2);
    }

    public static void goToTheDate(){
        System.out.println("Идем на свидание");
    }

    public static void sayNo(){
        System.out.println("Нет, мы не идем на свидание");
        //Console.writeline();
    }

    public static int goToTheShop(int money) {

        int milkPrice = 10;
        int hlebPrice = 5;
        int heroin = 95;

        return money-(milkPrice+hlebPrice+heroin);
    }

}
