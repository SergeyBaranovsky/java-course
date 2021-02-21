package homework_3;

/*  Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
    таким образом:
                    1 1 1 1 1
                    0 1 1 1 0
                    0 0 1 0 0
                    0 1 1 1 0
                    1 1 1 1 1   */

import java.util.Arrays;
import java.util.Random;

public class Exercise_17 {

    static Random random = new Random();

    public static void main(String[] args) {

        //  Используется для длин массива
        int length = random.nextInt(20) + 1;

        int[][] array = new int[length][length];

        //  Заполнение массива данными по типу "бабочка"
        for (int i = 0; i < array.length; i++) {
            //  Заполнение первой половины массива
            if (i < (array.length - i)) {
                for (int j = i; j < array[i].length - i; j++) {
                    array[i][j] = 1;
                }
            }
            //  Заполнение второй половины массива
            if (i > (array.length / 2)) {
                for (int j = array[i].length - i - 1; j < i + 1; j++) {
                    array[i][j] = 1;
                }
            }
        }
        //  Вывод массива на экран
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
}

