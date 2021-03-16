package com.gmail.baranovsky0803.additional_tasks;

/*  Даны 3 целых числа. Найти количество положительных чисел в исходном наборе. */

import java.util.Scanner;

public class Task_4 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //  Длинна массива
        int length = 3;
        //  Переменная для хранения числа
        int number;
        //  Счетчик положительных чисел
        int counter = 0;

        //  Ввод данных с консоли
        for (int i = 0; i < length; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            number = scanner.nextInt();
            if (number > 0) {
                counter++;
            }
        }
        //  Вывод количества положительных чисел на консоль
        System.out.println("Количество положительных чисел: " + counter);
    }
}
