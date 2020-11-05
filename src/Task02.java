import java.util.Scanner;

/**
 * Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
 * если нет, то вывести "Нет такого имени"
 */

public class Task02 {

    public static void main(String[] args) {
        checkName();
    }

    public static void checkName() {
        System.out.println("Введите имя!");
        String name = new Scanner(System.in).next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

    }
}
