import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Lesson5 {
    /**
     * Задание 5
     * Напишите программу, которая будет проверять, является
     * ли число, введенное с клавиатуры палиндромом (одинаково
     * читающееся в обоих направлениях). Например, 123454321
     * или 221122 – палиндром. Программа должна вывести YES,
     * если число является палиндромом, и NO – в противоположном случае.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        palindrome(scanner.nextInt());
    }

    public static void palindrome(int scanner) {
        int a;
        int b;
        int counter = 1;
        for (int i = 0; i < String.valueOf(scanner).length() / 2; i++) {
            a = scanner / (createDivider(scanner) / counter) % 10;
            b = (scanner / counter) % 10;
            counter *= 10;
            if (a != b) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            break;
        }
    }

    public static int createDivider(int a) {
        int b = 1;
        for (int i = 1; i < String.valueOf(a).length(); i++) {
            b *= 10;
        }
        return b;
    }
}
