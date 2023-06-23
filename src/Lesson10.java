public class Lesson10 {
    /**
     * Задание 10
     * 2520 – наименьшее число, которое можно разделить на
     * каждое из чисел от 1 до 10, без остатка.
     * Написать программу, которая рассчитывает наименьшее положительное число, которое делится на все числа от 1 до 20.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(number());
    }

    public static long number() {
        int b = 0;
        for (int i = 2520; i < 999999999; i++) { //232792560
            for (int j = 20; j >= 1; j--) {
                if (i % j != 0) {
                    break;
                } else if (j == 1) {
                    return i;
                }
            }
        }
        return b;
    }
}
