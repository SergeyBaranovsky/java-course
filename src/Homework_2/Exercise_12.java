package Homework_2;
/*  Найдите сумму первых n целых чисел, которые делятся на 3    */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_12 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            //Ряд первых n челых чисел
            System.out.print("Введите длину ряда чисел: ");
            int number = scanner.nextInt();

            //Используется для суммы чисел которые делятся на 3
            int summ = returnSumm(number);

            //Вывод результата
            System.out.println("Сумму первых " + number + " целых чисел, " +
                    "которые делятся на 3 : " + summ);

        }
        //Ловим ошибку
        catch (InputMismatchException ex) {
            //Вывод сообщения об ошибке
            System.out.println("Введен неверный тип данных");
        }
    }


    private static int returnSumm(int number) {

        //Используется для суммы чисел которые делятся на 3
        int summ = 0;

        //Цикл для итераций проверки деления на 3 и увеличения суммы
        for (int i = 0; i <= number; i++) {
            //проверки деления на 3
            if (i % 3 == 0) {
                //увелечения суммы
                summ += i;
            }
        }
        //Возвращает результат
        return summ;
    }
}
