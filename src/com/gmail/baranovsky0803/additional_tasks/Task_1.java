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

        //  Переменна для хранения значения числа ( положительное/отрицательное )
        String result = "";

        //  Проверка на +/- число
        if (number > 0) {
            result = "положительное";
        } else if (number < 0) {

            //  Если число было отрицательным --> перевод в положительное
            number *= -1;
            result = "отрицательное";
        }

        //  Вывод результата на консоль
        if (number == 0) {
            System.out.println("Это 1-значное число");
        } else {
            //  Цикл проводит деление number на 10
            for (counter = 0; number > 0; counter++) {
                number /= 10;
            }
            //  Вывод результата на консоль
            System.out.println("Это " + counter + "-значное " + result + " число");
        }


        /*    Цикл деления числа number на 10 и увеличение счетчика деления
        if (number != 0) {
            do {
                number /= 10;
                counter++;
            } while (number > 0);
        }

        // Вывод результата на консоль в зависимости от счетчика
        switch (counter) {
            case (0), (1) -> System.out.println("Это " + result + " однозначное число");
            case (2) -> System.out.println("Это " + result + " двухзначное число");
            case (3) -> System.out.println("Это " + result + " трехзначное число");
            case (4) -> System.out.println("Это " + result + " четырехзначное число");
            case (5) -> System.out.println("Это " + result + " пятизначное число");
            case (6) -> System.out.println("Это " + result + " шестизначное число");
            case (7) -> System.out.println("Это " + result + " семизначное число");
            case (8) -> System.out.println("Это " + result + " восьмизначное число");
            case (9) -> System.out.println("Это " + result + " девятизначное число");
            case (10) -> System.out.println("Это " + result + " десятизначное число");
        }   */
    }
}
