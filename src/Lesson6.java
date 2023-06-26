import java.util.*;

public class Lesson6 {
    /**
     * Задание 6
     * Вывести на консоль все восьмизначные числа, цифры в
     * которых не повторяются. Эти числа должны делиться на
     * 12345, без остатка. Показать общее количество найденных
     * чисел.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(numbers());
    }

    static ArrayList<Integer> result = new ArrayList<>();

    public static int numbers() {
        int counter = 0;
        for (int i = 9_999_999; i <= 99_999_999 - 1; i++) {
            array(i);
            if (duplicateNumbers(result) & i % 12345 == 0) {
                System.out.println(i);
                counter++;
            } else {
                result.clear();
            }
        }
        System.out.println();
        return counter;
    }

    public static boolean duplicateNumbers(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (Objects.equals(arrayList.get(i), arrayList.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void array(int number) {
        while (number > 0) {
            result.add(number % 10);
            number = number / 10;
        }
        Collections.reverse(result);
    }
}
