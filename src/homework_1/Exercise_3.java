package homework_1;

/*
 *   Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
 *   А) минут + секунд,
 *   В) часов + минут + секунд,
 *   С) дней + часов + минут + секунд,
 *   D) недель + дней + часов + минут + секунд
 */

import java.sql.SQLOutput;

public class Exercise_3 {
    public static void main(String[] args) {

        //  Общее количество секунд
        int total_sec = 4500;

        //  Остаток секунд после перевода в минуты
        int residue_sec = total_sec % 60;

        //  Общее количество минут в 4500 секундах
        int total_min = (total_sec - residue_sec) / 60;

        //  Остаток минут после перевода в часы
        int residue_min = total_min % 60;

        //  Общее количество часов в 4500 секунд
        int hour = (total_min - residue_min) / 60;

        // Остаток часов после перевода в дни
        int residue_hour = hour % 24;

        //  Общее количество дней в 4500 секунд
        int day = (hour - residue_hour) / 24;

        //  Остаток дней после перевода в недели:
        int residue_day = day % 7;

        //  Общее количество недель в 4500 секунд
        int week = day / 7;


        //Вывод результатов на консоль
        System.out.println("Общее количество секунд: " + total_sec);
        System.out.println("Общее количество минут: " + total_min + " секунд: " + residue_sec);
        System.out.println("Часов: " + hour + " Минут: " + residue_min + " Секунд: " + residue_sec);
        System.out.println("Неделя: " + week + " День: " + residue_day +
                " Час: " + residue_hour + " Минута: " + residue_min +
                " Секунда: " + residue_sec);

    }
}
