package com.gmail.baranovsky0803.additional_tasks;

/*  Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99   */

public class Task_14 {
    public static void main(String[] args) {

        //  Используется для хранения суммы
        int sum = 0;

        //  Расчет суммы
        for (int i = 1; i <= 99; i+=2) {
            sum += i;
        }

        //  Вывод суммы
        System.out.println(sum);
    }
}
