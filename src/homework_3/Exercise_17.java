package homework_3;

/*  Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
    таким образом:
                    1 1 1 1 1
                    0 1 1 1 0
                    0 0 1 0 0
                    0 1 1 1 0
                    1 1 1 1 1   */

import java.util.Arrays;

public class Exercise_17 {
    public static void main(String[] args) {

        int[][] array = new int[5][5];

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

