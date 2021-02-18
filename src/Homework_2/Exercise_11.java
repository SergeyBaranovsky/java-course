package Homework_2;
/*  Имеется целое число, определить является ли это число простым, т.е.
    делится без остатка только на 1 и себя.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_11 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //  Вывод сообщения для ввода числа
        System.out.print("Введите целое число для проверки: ");

        try {
            //  Ввод значения числа для проверки
            int number = scanner.nextInt();

            //  Отработка решения задачи
            int counter = checkIfNumberIsPrime(number);

            /*  Проверка условия задачи.Если counter равен нулю,то наше число простое.
        Если counter не равен нулю,то наше число не простое */
            showResult(counter, number);
        }
        //  Ловим ошибку
        catch (InputMismatchException ex) {

            //  Вывод сообщения ошибки
            System.out.println("Введен неверный формат данных!");
        }


    }

    //  Метод определяет является ли это число простым
    private static int checkIfNumberIsPrime(int number) {

        //  Используется для подсчета делений без остатка.
        int counter = 0;

        //  Цикл проводит деление на каждое целое цисло от 1 до введенного цила
        for (int i = 1; i <= number; i++) {

            //Если число делиться без остатка то переходит в тело ветвления
            if (number % i == 0) {
                /*  Если число i не рано 1 либо введенному числу,
                то увеличивает наш counter на 1 */
                if (!(i == 1 || i == number)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static void showResult(int counter, int number) {

        /*  Проверка условия задачи.Если counter равен нулю,то наше число простое.
        Если counter не равен нулю,то наше число не простое */
        if (counter == 0) {
            System.out.println("Число " + number + " простое");
        } else {
            System.out.println("Число " + number + " не простое");
        }
    }
}



