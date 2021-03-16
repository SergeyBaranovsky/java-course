package homework_2;

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
            boolean resultEven = checkIfNumberIsPrime(number);

            /*  Проверка условия задачи. Если counter равен нулю, то наше число простое.
        Если counter не равен нулю, то наше число не простое */
            showResult(resultEven, number);
        }
        //  Ловим ошибку
        catch (InputMismatchException ex) {

            //  Вывод сообщения ошибки
            System.out.println("Введен неверный формат данных!");
        }
    }

    //  Метод определяет являться ли это число простым
    private static boolean checkIfNumberIsPrime(int number) {

        //  Цикл проводит деление на каждое целое число от 1 до введенного цикла
        for (int i = 2; i < number; i++) {

            //Если число делиться без остатка, то переходит в тело ветвления
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void showResult(boolean result, int number) {

        /*  Проверка условия задачи. Если counter равен нулю, то наше число простое.
        Если counter не равен нулю, то наше число не простое */
        if (result) {
            System.out.println("Число " + number + " простое");
        } else {
            System.out.println("Число " + number + " не простое");
        }
    }
}



