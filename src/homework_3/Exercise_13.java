package homework_3;

import java.util.Arrays;
import java.util.Random;

//  Создать последовательность случайных чисел, найти и вывести наибольшее из них.

public class Exercise_13 {

    static Random random = new Random();

    public static void main(String[] args) {

        //  Переменная для длины массива
        int length = 10;

        //  Создаем новый массив длинной length
        int[] arr = new int[length];

        //  Метод заполняет массив данными
        initArray(arr);

        //  Вывод массива на консоль
        System.out.println(Arrays.toString(arr));

        //Поиск самого большого элемента в массиве и вывод его на консоль
        int maxElement = findMaxElement(arr);
        System.out.println("Самое большое число в массиве - " + maxElement);


    }

    //  Метод возвращает самый большой элемент массива
    public static int findMaxElement(int[] arr) {

        int maxElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(maxElement<arr[i]){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    //  Метод заполняет массив числами в пределах 25
    public static void initArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }
    }
}

