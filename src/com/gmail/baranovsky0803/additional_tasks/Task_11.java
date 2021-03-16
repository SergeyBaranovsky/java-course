package com.gmail.baranovsky0803.additional_tasks;

/*  Составьте программу, вычисляющую A*B, не пользуясь операцией умножения. */

import java.util.Scanner;

public class Task_11 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //  Ввод данных с консоли
        System.out.println("Введите число A: ");
        int numberA = scanner.nextInt();
        System.out.println("Введите число B: ");
        int numberB = scanner.nextInt();

        //  Используется для результата умножения
        int result = 0;

        for (int i = 0; i < numberB; i++) {
            result += numberA;
        }

        System.out.println("Результат " + result);
    }
}
