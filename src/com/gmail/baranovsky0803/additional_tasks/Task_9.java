package com.gmail.baranovsky0803.additional_tasks;

/*  Одноклеточная амеба каждые 3 часа делится на 2 клетки.
    Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/

public class Task_9 {
    public static void main(String[] args) {
        // Одноклеточная амеба
        int amebaCount = 1;

        //  Вывод результата
        for (int i = 3; i < 25; i += 3) {
            amebaCount *= 2;
            System.out.println("Количество амеб - " + amebaCount +
                    " через " + i + " часа");
        }
    }

}

