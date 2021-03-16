package com.gmail.baranovsky0803.additional_tasks;

/*  Начав тренировки, спортсмен в первый день пробежал 10 км.
    Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
    Какой суммарный путь пробежит спортсмен за 7 дней?  */

public class Task_8 {
    public static void main(String[] args) {

        // Дистанция
        double distance = 10;

        //  Увеличение дистанции на 10%
        for (int i = 0; i < 7; i++) {
            distance += distance * 0.1;
        }

        //  Вывод результата на консоль
        System.out.printf("Дистанция - %.2f", distance);
    }
}
