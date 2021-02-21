package com.gmail.baranovsky0803.additional_tasks;

/*  В переменную записываете количество программистов.
В зависимости от количества программистов необходимо вывести правильно окончание.
 Например: • 2 программиста • 1 программист • 10 программистов • и т.д.
 */

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        //  Ввод данных с консоли
        int amountDev = new Scanner(System.in).nextInt();
        String result = "программист";

        //  Обработка вывода результата
        if (amountDev % 10 > 1 && amountDev % 10 <= 4) {
            result = "программиста";
        } else if ((amountDev % 10 > 4 && amountDev % 10 < 9)
                || amountDev == 0) {
            result = "программистов";
        }
        if ((amountDev % 100 > 10 && amountDev % 100 < 20)) {
            result = "программистов";
        }

        //  Вывод результата на консоль
        System.out.println("" + amountDev + " " + result);


    }
}
