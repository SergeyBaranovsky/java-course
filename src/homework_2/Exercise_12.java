package homework_2;
/*  Найдите сумму первых n целых чисел, которые делятся на 3 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_12 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            //  Ряд первых n целых чисел
            System.out.print("Введите длину ряда чисел: ");
            int number = scanner.nextInt();

            //  Используется для суммы чисел которые делятся на 3
            int sum = returnSum(number);

            //Вывод результата
            System.out.println("Сумму первых " + number + " целых чисел, " +
                    "которые делятся на 3 : " + sum);

        }
        //  Ловим ошибку
        catch (InputMismatchException ex) {
            //  Вывод сообщения об ошибке
            System.out.println("Введен неверный тип данных");
        }
    }


    private static int returnSum(int number) {

        //  Используется для суммы чисел которые делятся на 3
        int sum = 0;
        int counter = 0;

        //  Цикл для итераций проверки деления на 3 и увеличения суммы
        for (int i = 1; counter != number; i++) {
            //  Проверки деления на 3
            if (i % 3 == 0) {
                //  Увелечения суммы
                sum += i;
                // Увеличение счетчика выхода из цикла
                counter++;
            }
        }
        return sum;
    }
}

