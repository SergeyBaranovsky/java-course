package homework_3;

/*  Создать массив оценок произвольной длины, вывести максимальную и
    минимальную оценку, её (их) номера  */

import java.util.Arrays;
import java.util.Random;

public class Exercise_14 {

    // Используется для заполнения массива случайными оценками от 0 - 10
    static Random random = new Random();

    public static void main(String[] args) {

        //  Используется для инициализации длины массива
        int length = 10;

        //  Используется для хранения минимальной оценки из массива
        int minRating = 10;
        //  Используется для хранения максимальной оценки из массива
        int maxRating = 0;

        //  Используется для записи позиций минимальной оценки в массиве
        StringBuilder minPosition = new StringBuilder("Позиция(ии) минимальной оценки: ");
        //  Используется для записи позиций максимальной оценки в массиве
        StringBuilder maxPosition = new StringBuilder("Позиция(ии) максимальной оценки: ");


        //  Создается массив длиной length
        int[] arr = new int[length];

        //  Заполняем массив оценками
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 1;
        }

        //  Поиск минимальной и максимальной оценки в списке
        for (int j : arr) {
            //   Поиск максимальной оценки
            if (j > maxRating) {
                maxRating = j;
            }
            //  Поиск минимальной оценки
            if (j < minRating) {
                minRating = j;
            }
        }

        //  Добавление позиции для максимальной и минимальной оценки
        for (int i = 0; i < arr.length; i++) {
            //  Добавление позиции для максимальной оценки
            if (arr[i] == maxRating) {
                maxPosition.append(i).append(" ");
            }
            //  Добавление позиции для минимальной оценки
            if (arr[i] == minRating) {
                minPosition.append(i).append(" ");
            }
        }

        //  Вывод общего списка оценок
        System.out.println("Список оценок: " + Arrays.toString(arr));

        //  Вывод максимальной и минимальной оценки в массиве
        System.out.println("Максимальная оценка = " + maxRating + "." +
                "\nМинимальная оценка = " + minRating);

        //  Вывод позиции(ий) максимальной оценки
        System.out.println(maxPosition);

        //  Вывод позиции(ий) минимальной оценки
        System.out.println(minPosition);
    }
}

