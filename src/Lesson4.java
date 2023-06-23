public class Lesson4 {
    /**
     * Задание 4
     * Совершенное число – натуральное число, равное сумме всех
     * своих собственных делителей (то есть всех положительных
     * делителей, отличных от самого числа).
     * Показать на экране все совершенные числа в диапазоне от
     * 0 до 1 000 000.
     * Примеры:
     * 1-е совершенное число: 6 имеет следующие собственные
     * делители – 1, 2, 3; их сумма равна 6.
     * 2-е совершенное число: 28 имеет следующие собственные
     * делители: – 1, 2, 4, 7, 14; их сумма равна 28
     *
     * @param args
     */
    public static void main(String[] args) {
        perfectDivisors();
    }

    public static void perfectDivisors() {
        for (int i = 0; i < 1_000_000; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPerfectNumber(int n) {
        if (n < 2) return false;
        int sum = 1;
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            return false;
        }

        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                sum += i + n / i;
                if (sum > n) return false;
            }
        }

        return n == sum;
    }
}
