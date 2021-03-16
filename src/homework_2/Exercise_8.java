package homework_2;

import java.util.Scanner;

/*  Имеется целое число (задать с помощью Random rand = new Random(); int x =
    rand.nextInt()). Это число – количество денег в рублях. Вывести это число, добавив к
    нему слово «рублей» в правильном падеже.
*/
public class Exercise_8 {

    /*Используется для определения случайного числа
    static Random random = new Random();*/

    public static void main(String[] args) {

        //Переменная в которой будет сохраняться слово «рублей» в правильном падеже.
        String rub = " рубль";

        //  Ввод числа для добавления к нему слова рублей
        System.out.println("Введите сумму в рублях: ");
        long amount = new Scanner(System.in).nextLong();

        //  Остаток от деления на 10
        int remainderOfDivisionByTen = (int) amount % 10;

        //Обрабатывает варианты оканчивающиеся на 11-14
        if ((amount > 10 && amount < 15) || (amount % 100 > 10 && amount % 100 < 15)) {
            rub = " рублей";
        }
        //Обрабатывает варианты оканчивающиеся на ноль, либо 5-9
        else if (remainderOfDivisionByTen == 0 || remainderOfDivisionByTen >= 5) {
            rub = " рублей";
        }
        //Обрабатывает варианты оканчивающиеся на 2-4
        else if (remainderOfDivisionByTen > 1) {
            rub = " рубля";
        }

        //Выводит вариант на консоль.
        System.out.println(amount + rub);
    }
}

