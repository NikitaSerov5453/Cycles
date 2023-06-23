public class Lesson1 {
    /**
     * Задание 1
     * Числа Фибоначчи – это последовательность чисел, в которой два первых числа последовательности равны 0 и 1, а
     * каждое последующее число равно сумме двух предыдущих.
     * Показать на экране все числа Фибоначчи в диапазоне от
     * 0 до 10 000 000.
     *
     * @param args
     */
    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {
        int a = 0;
        int b = 1;
        for (int i = 0; i < 100; i++) {
            if (a + b < 10_000_000) {
                int next = a + b;
                a = b;
                b = next;
            } else {
                break;
            }
            System.out.println(b);
        }
    }
}
