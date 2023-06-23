public class Lesson7 {
    /**
     * Задание 7
     * Показать битовое представление значения переменной
     * типа int, используя только один цикл, управляющую переменную, вывод на консоль и битовые операции.
     * Не использовать строки и любые другие готовые функции (методы).
     *
     * @param args
     */
    public static void main(String[] args) {
        int n = 100;
        intToBinary(n);
    }

    public static void intToBinary(int n) {
        String string = "";
        for (int i = 0; i <= 32; i++) {
            if (n % 2 == 0) {
                n >>= 1;
                string = string + 0;
            } else {
                n >>= 1;
                string = string + 1;
            }
        }
        System.out.println();
        System.out.println(string);
    }
}
