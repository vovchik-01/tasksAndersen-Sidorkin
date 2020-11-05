
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 */

public class Task03 {
    public static void main(String[] args) {
        checkArray(createArray());
    }


    /**
     Метод проверяет приходящий массив и выводит числа кратные 3
     */
    public static void checkArray(List<Integer> listNumbers) {
        if (listNumbers == null) {
            return;
        }
        int countMultiples = 0;
        List<Integer> result = new ArrayList<>();
        for (Integer num : listNumbers) {
            if (num != 0 && num % 3 == 0) {
                result.add(num);
                countMultiples++;
            }
        }
        if (countMultiples > 0) {
            System.out.println("Массив имеет: " + countMultiples + " чисел кратных 3, а именно: " + result);
        } else {
            System.out.println("Массив не имеет чисел кратных 3");
        }

    }

    /**
     * Метод создает и возвращает массив из введенных пользователем чисел.
     */

    public static List<Integer> createArray() {
        System.out.println("Введите длину массива!");
        int index = checkIsDigit();
        int count = 0;
        List<Integer> listNumbers = new ArrayList<>();
        while (count < index) {
            System.out.println("Введите число массива");
            int num = checkIsDigit();
            listNumbers.add(num);
            count++;
        }
        return listNumbers;
    }


    /**
     * Метод проверяет, является ли введенное значение числом.
     * Возвращает введенное число.
     */
    private static int checkIsDigit(){
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Введенное значение не является числом! Повторите ввод!");
            sc.next();
        }
        return sc.nextInt();
    }
}
