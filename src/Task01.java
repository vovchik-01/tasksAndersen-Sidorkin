import java.util.Scanner;

/**
 * Составить алгоритм: если введенное число больше 7, то вывести “Привет”
 */

public class Task01 {
    public static void main(String[] args) {
        checkNumber();
    }

    public static void checkNumber() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Введите число!");
        while (!sc.hasNextInt()) {
            System.out.println("Введенное значение не является числом! Повторите ввод!");
            sc.next();
        }
        num = sc.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        }

    }
}
