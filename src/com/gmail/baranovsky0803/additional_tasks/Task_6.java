package com.gmail.baranovsky0803.additional_tasks;

/*  Даны 2 числа. Вывести большее из них */

import java.util.Scanner;

public class Task_6 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //  Ввод данных с консоли
        System.out.println("Введите число 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int number2 = scanner.nextInt();

        //  Выборка большего числа
        int result = (number1 > number2) ? number1 : number2;

        //  Вывод результата
        System.out.println("Результат: " + result);

    }
}
