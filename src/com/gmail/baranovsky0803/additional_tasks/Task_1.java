package com.gmail.baranovsky0803.additional_tasks;

/*  В переменную записываем число. Надо вывести на экран сколько в этом числе цифр
    и положительное оно или отрицательное. Например, "это однозначное положительное число".
    Достаточно будет определить, является ли число однозначным, "двухзначным или трехзначным и более.
 */

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        //  Ввод числа с консоли
        System.out.print("Введите число: ");
        int number = new Scanner(System.in).nextInt();

        // Счетчик деления на 10
        int counter;

        if (number < 0) {
            //  Если число было отрицательным --> перевод в положительное
            number *= -1;
        }

        //  Цикл проводит деление number на 10
        if (number == 0) {
            counter = 1;
        } else {
            for (counter = 0; number > 0; counter++) {
                number /= 10;
            }
        }

        //  Вывод результата на консоль
        System.out.println("Это " + counter + "-значное число");

    }
}
