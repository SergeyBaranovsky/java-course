package com.gmail.baranovsky0803.additional_tasks;

/*  Напишите программу печати таблицы перевода расстояний из дюймов
    в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */

public class Task_12 {

    //  Статическая переменная для хранения значения дюйма
    private static final double INCH_TO_CENTIMETER_MULTIPLIER = 2.54;

    public static void main(String[] args) {

        // Вывод таблицы
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + "(в дюймах) = " + (i * INCH_TO_CENTIMETER_MULTIPLIER) + "(в см)");
        }
    }

}
