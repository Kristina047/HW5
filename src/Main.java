import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i=i+4) {
            System.out.println(i + " Год является високосным");
        }

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задача 8");
        int money = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + money;
            System.out.println( "Месяц " +i+ ", сумма накоплений равно "+total+" рублей");
        }

        System.out.println("Задача 9");
        int moneyMonth  = 29000;
        int moneyPercent = 29000/100;
        int percent = 0;
        for (int i = 1; i <= 12; i++) {
            percent =  percent + moneyMonth + moneyPercent;
            System.out.println( "Месяц " +i+ ", сумма накоплений равно "+percent+" рублей");
        }

        System.out.println("Задача 10");
        int a=2;
        int b=0;
        for (int i = 1; i <= 10; i++) {
            b=a*i;
            System.out.println(a+"*"+i+"="+b);
        }



    }
}
