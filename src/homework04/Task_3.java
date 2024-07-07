package homework04;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();

        String[] words = word.split(" ");

        char[] array0 = words[0].toCharArray();
        char[] array1 = words[1].toCharArray();

        Arrays.sort(array0);
        Arrays.sort(array1);

        String sort0 = new String(array0);
        String sort1 = new String(array1);

        System.out.println(sort0 + " " + sort1);
    }
}
