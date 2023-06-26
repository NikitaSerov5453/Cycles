public class Lesson9 {
    /**
     * Задание 9
     * Если перечислить все натуральные числа меньше 10, кратные 3 или 5, мы получаем 3, 5, 6 и 9.
     * Сумма этих кратных – 23.
     * Найдите сумму всех чисел, кратных 3 или 5, начиная с 0 и до 1 000.
     *
     * @param args
     */
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        int counter = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);

                counter += i;
            }
        }
        System.out.println(counter);
    }
}
