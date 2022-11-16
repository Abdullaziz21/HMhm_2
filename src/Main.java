public class Main {
    public static void main(String[] args) {
        System.out.println(wolking(18, 25));
        System.out.println(wolking(11, 15));
        System.out.println(wolking(28, 35));
        System.out.println(wolking(38, 22));
        System.out.println(wolking(22, 10));

    }public static String wolking(int age,int temrt){
        if (age>20 && age<45 && temrt>-20 && temrt<30){
            return ("можно идти гулять");}


        else if (age<20 && temrt>0 && temrt<28){
            return ("можно идти гулять");}

        else if (age>45 && temrt>-10 && temrt<25){
            return ("можно идти гулять");}

        return ("остовайтесь дома");



    }

}