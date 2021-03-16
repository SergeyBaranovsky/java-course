package homework_3;

/*  Создать массив, заполнить его случайными элементами, распечатать,
    перевернуть, и снова распечатать (при переворачивании нежелательно создавать
    еще один массив)    */

import java.util.Arrays;
import java.util.Random;

public class Exercise_15 {

    // Используется для генерации рандомных значений
    static Random random = new Random();

    public static void main(String[] args) {

        //  Используется для инициализации длины массива
        int length = 11;

        //  Создание массива длиной length
        int[] arr = new int[length];

        //   Заполнение массива рандомными числами
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = random.nextInt(25)+1;
        }

        //  Вывод массива на консоль
        System.out.println(Arrays.toString(arr));

        // Реверс массива
        for (int i = 0; i < (arr.length)/2; i++) {
            int temp = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = temp;
        }

        //  Вызов массива на консоль после реверса
        System.out.println(Arrays.toString(arr));

    }
}
