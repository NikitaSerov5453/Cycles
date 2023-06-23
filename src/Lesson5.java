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

    static ArrayList<Integer> result = new ArrayList<>();

    public static void palindrome(int scanner) {
        boolean b = true;
        array(scanner);
        if (String.valueOf(scanner).length() % 2 == 0) {
            for (int i = 0; i < result.size() / 2; i++) {
                if (!Objects.equals(result.get(i), result.get(result.size() - 1 - i))) {
                    b = false;
                    System.out.println("NO");
                    break;
                }
            }
            if (b) {
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");
        }
    }

    public static void array(int number) {
        while (number > 0) {
            result.add(number % 10);
            number = number / 10;
        }
        Collections.reverse(result);
    }
}
