import java.util.ArrayList;
import java.util.Collections;

public class Lesson3 {
    /**
     * Задание 3
     * Самовлюблённое число или число Армстронга – натуральное число, которое равно сумме своих цифр, возведенных
     * в степень, равную количеству его цифр.
     * Показать на экране все числа Армстронга в диапазоне от
     * 10 до 1 000 000.
     * Например:
     * 153 = 13
     * + 53
     * + 33
     *
     * @param args
     */
    public static void main(String[] args) {
        armstrongNumber();
    }

    static ArrayList<Integer> result = new ArrayList<>();

    public static void armstrongNumber() {
        for (int i = 10; i < 1_000_000; i++) {
            array(i);
            for (int j = 0; j < result.size(); j++) {
                if (i == pow(result)) {
                    System.out.println(pow(result));
                    break;
                } else {
                    result.clear();
                }
            }
        }
    }

    public static void array(int number) {
        while (number > 0) {
            result.add(number % 10);
            number = number / 10;
        }
        Collections.reverse(result);
    }

    public static int pow(ArrayList<Integer> arrayList) {
        int counter = 0;
        for (Integer integer : arrayList) {
            counter = (int) (counter + Math.pow(integer, arrayList.size()));
        }
        return counter;
    }
}
