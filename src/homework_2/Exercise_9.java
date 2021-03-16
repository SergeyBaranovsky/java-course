package homework_2;
/*Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_9 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            //Выводим приветствие на консоль
            System.out.print("Приветствую.Введите число которого хотите найти факториал: ");

            //Вводим число с консоли
            int number = scanner.nextInt();

            //Переменная для сохранения факториала числа
            int numberFactorial = findNumberFactorial(number);

            //Выводим на консоль факториал числа
            System.out.println("Факториал числа : " + numberFactorial);

        } catch (InputMismatchException ex) {
            //Сообщение об ошибке
            System.out.println("Введен неверный формат данных!!!");

        } catch (StackOverflowError ex) {
            /*Сообщение об ошибке вызывается если на в функциию
             * будет введено большое число*/
            System.out.println("Превышении объема памяти стека вызовов, выделенного JVM." +
                    "\nВы ввели слишком большое число");
        }
    }

    //Метод считает факториал числа
    static int findNumberFactorial(int number) {

        //Точка выхода из рекурсии
        if (number == 0) {
            return 1;
        }
        //Возврат рекурсии
        return number * findNumberFactorial(number - 1);
    }
}
