public class Lesson2 {
    /**
     * Задание 2
     * Простое число – натуральное (целое положительное) число,
     * имеющее ровно два различных натуральных делителя –
     * единицу и самого себя. Другими словами, число N является
     * простым, если оно больше 1 и при этом делится без остатка
     * только на 1 и на N (на самого себя).
     * Написать программу, которая выводит на экран все простые числа в диапазоне от 2 до 1 000 000. Постарайтесь не
     * выполнять лишних действий (например, после того как вы
     * нашли хотя бы один нетривиальный делитель, уже ясно, что
     * число составное и проверку продолжать не нужно). Также
     * учтите, что наименьший делитель натурального числа n,
     * если он вообще имеется, обязательно располагается в отрезке [2; √n].
     *
     * @param args
     */
    public static void main(String[] args) {
        primeNumbers();
    }

    public static void primeNumbers() {
        for (int i = 2; i < 1_000_000; i++) {
            int sqrtI = (int) Math.sqrt(i);
            for (int j = sqrtI; j > 0; j--) {
                if (i % j == 0) {
                    break;
                } else if (j == 2) {
                    System.out.println(i);
                }
            }
        }
    }
}
