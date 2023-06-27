public class Lesson8 {
    /**
     * Задание 8
     * Электронные часы показывают время в формате от 00:00
     * до 23:59. Написать программу, которая выведет на консоль
     * сколько раз за сутки случается так, что слева от двоеточия
     * показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51). Вывести
     * на экран все симметричные комбинации. Вывести общее
     * число комбинаций.
     *
     * @param args
     */
    public static void main(String[] args) {
        clock();
    }

    public static void clock() {
        int counter = 0;
        for (int i = 0; i < 24; i++) {

            if (revers(i) < 60 & (revers(i) * 10 < 60 || revers(i) * 10 > 100)) {
                counter++;
                if (i < 10) {
                    System.out.printf("%02d:%02d\n", i, revers(i) * 10);
                } else {
                    System.out.printf("%02d:%02d\n", i, revers(i));
                }

            }
        }
        System.out.println("Общее число комбинаций " + counter);
    }

    public static int revers(int n) {
        int res = 0;
        while (n != 0) {
            int a = n % 10;
            res = (res * 10) + a;
            n = n / 10;
        }
        return res;
    }
}
