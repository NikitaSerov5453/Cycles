import java.util.Scanner;

public class Lesson12 {
    /**
     * Задание 12
     * В первый день спортсмен пробежал x километров, а затем
     * он каждый день увеличивал пробег на 10% от предыдущего
     * значения.
     * По числу, указанному с клавиатуры y, определите
     * номер дня, на который пробег спортсмена составит не менее
     * y километров.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        days(scanner.nextDouble(), scanner.nextDouble());
    }
    public static void days(double distance, double scanDistance) {
        double percentage = 10;
        double day = 0;
        for (int i = 1; i <= 10000; i++) {
            if (scanDistance >= distance) {
                scanDistance = scanDistance - (scanDistance / (100 + percentage) * percentage);
                day++;
            } else {
                System.out.println(day);
                break;
            }
        }
    }
}
