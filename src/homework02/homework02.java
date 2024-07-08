package homework02;

import java.util.Scanner;

public class homework02 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1-е целое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе целое число: ");
        int b = in.nextInt();

        int sum = a + b;
        System.out.println("Сумма двух целых чисел: " + sum);

        int difference = a - b;
        System.out.println("Разница двух целых чисел: " + difference);

        int multiplier = a * b;
        System.out.println("Произведение двух целых чисел: " + multiplier);

        double average = (a + b) / 2;
        System.out.println("Среднее из двух целых чисел: " + average);

        if (a > b){
            System.out.println("Расстояние двух целых чисел: " + Math.abs(a-b));
        }else if (a < b){
            System.out.println("Расстояние двух целых чисел: " + Math.abs(b-a));}

        System.out.println("Максимальное целое число: " + Math.max(a, b));
        System.out.println("Минимальное целое число: " + Math.min(a, b));
    }
}
