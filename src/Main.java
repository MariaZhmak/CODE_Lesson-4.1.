import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int testFirst = 3;
//        int testSecond = 55;
//        int catCount = 9887;
//        int dogPart = 24243;
//        int mousePick = 32235;
//
//        String a = "Hello";
//
//        char sim1 = 'B';
//        char sim2 = 'C';
//
//        int point4 = 10;
//
//        double point5 = 3.14;
//
//        System.out.println(testFirst + "\n" + testSecond + "\n" + catCount + "\n" + dogPart + "\n" + mousePick
//                + "\n" + a + "\n" + sim1 + "\n" + sim2 + "\n" + point4 + "\n" + point5);

        System.out.println("\t***\tДобро пожаловать в калькулятор. Задание  пункт 7\t***");
        System.out.println("Введите первое число");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число");
        double b = new Scanner(System.in).nextDouble();

        System.out.println(a + " + " + b + " = " + (a + b)); // сумма чисел
        System.out.println(a + " - " + b + " = " + (a - b)); // разность чисел
        System.out.println(a + " / " + b + " = " + (a / b)); // частное двух числе
        

    }
}
