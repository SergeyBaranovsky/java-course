package com.gmail.baranovsky0803.additional_tasks;

/*  Дано целое число. Если оно является положительным, то прибавить к нему 1.
    Если отрицательным, то вычесть из него 2.
    Если нулевым, то заменить его на 10. Вывести полученное число  */

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        //  Ввод числа с консоли
        System.out.println("Введите число: ");
        int number = new Scanner(System.in).nextInt();

        // Обработка решения задачи
        if (number > 0) {
            number += 1;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }

        // Вывод результата на консоль
        System.out.println("Число после обработки: " + number);
    }
}
