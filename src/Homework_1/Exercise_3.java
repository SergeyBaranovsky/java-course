package Homework_1;

/*
 *   Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
 *   А) минут + секунд,
 *   В) часов + минут + секунд,
 *   С) дней + часов + минут + секунд,
 *   D) недель + дней + часов + минут + секунд
 */

public class Exercise_3 {
    public static void main(String[] args) {

        //общее количество секунд
        int total_sec = 4500;

        //Остаток секунд после перевода в минуты
        int residue_sec = total_sec % 60;

        //общее количество минут в 4500 секундах
        int min = (total_sec - residue_sec) / 60;

        //Остаток минут после перевода в часы
        int residue_min = min % 60;

        //общее количество часов в 4500 секунд
        int hour = (min - residue_min) / 60;

        //Вывод результатов на консоль
        System.out.println("Общее количество секунд: " + total_sec);
        System.out.println("Часов: " + hour + " Минут: " + residue_min + " Секунд: " + residue_sec);

    }
}
