package homework_2;

/*
 *   Дано любое натуральное 4-х значное число.
 *   Верно ли, что все цифры числа различны?
 * */

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {

        // Ввод любого целого числа
        System.out.print("Введите любое число: ");
        int number = new Scanner(System.in).nextInt();

        //  Копия введенного числа будет использоваться для заполнения массива чисел
        int copyNumber = number;

        //  Счетчик используется для определения длины массива чисел
        int counter = (number == 0) ? 1 : 0;
        while (number > 0) {
            number /= 10;
            counter++;
        }

        //  Массив чисел
        int[] arrayForNumbers = new int[counter];

        //  Заполняем массив чисел
        for (int i = 0; i < arrayForNumbers.length; i++) {
            arrayForNumbers[i] = copyNumber % 10;
            copyNumber /= 10;
        }
        //  сообщение обработки
        String result = "В введенном числе все числа различные";

        // Проверка числового массива  на совпадения
        for (int i = 0; i < arrayForNumbers.length - 1; i++) {
            for (int j = i + 1; j < arrayForNumbers.length; j++) {
                if (arrayForNumbers[i] == arrayForNumbers[j]) {
                    result = "В введенном числе все или некоторые числа одинаковые.";
                    break;
                }
            }
        }

        // Вывод результата
        System.out.println(result);

    }
}

