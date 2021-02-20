package homework_3;

/*  Определите сумму элементов одномерного массива, расположенных между
    минимальным и максимальным значениями. */

import java.util.Arrays;
import java.util.Random;

public class Exercise_16 {

    public static void main(String[] args) {

        //  Используется для длинны массива
        int length = 10;
        //  Сохраняет позицию максимального числа в массиве
        int maxPosition = 0;
        //  Сохраняет позицию минимального числа в массиве
        int minPosition = 0;

        //  Создание нового массива
        int[] array = new int[length];

        // Инициализация массива
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(15);
        }

        // Используется для хранения значения минимального числа массива
        int minNumber = array[0];
        // Используется для хранения значения максимального числа массива
        int maxNumber = array[0];

        // Поиск минимального и максимального элементов массива
        for (int element : array) {
            //  Минимальный элемент
            if (minNumber > element) {
                minNumber = element;
            }
            //  максимальный элемент
            if (maxNumber < element) {
                maxNumber = element;
            }
        }

        // Определяет позицию максимального числа
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNumber) {
                maxPosition = i;
                break;
            }
        }

        // Определяет позицию минимального числа
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minNumber) {
                minPosition = i;
                break;
            }
        }

        /* Используется для хранения значения суммы элементов одномерного массива,
           расположенных между минимальным и максимальным значениями */
        int sum = 0;

        // Расчет суммы(если минимальное число находиться в массиве раньше,чем максимальное число )
        if (minPosition < maxPosition) {
            for (int i = minPosition + 1; i < maxPosition; i++) {
                sum += array[i];
            }
        }
        // Расчет суммы(если максимальное число находиться в массиве раньше,чем минимальное число )
        else if (maxPosition < minPosition) {
            for (int i = maxPosition + 1; i < minPosition; i++) {
                sum += array[i];
            }
        }


        System.out.println(Arrays.toString(array));
        System.out.println("Максимальное число в массиве: " + maxNumber);
        System.out.println("Минимальное число в массиве: " + minNumber);
        System.out.println("Позиция максимального числа в массиве: " + maxPosition);
        System.out.println("Позиция минимального числа в массиве: " + minPosition);
        System.out.println("Сумма элементов одномерного массива, расположенных между" +
                " минимальным и максимальным значениями: " + sum);
    }
}

