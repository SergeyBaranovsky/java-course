package com.gmail.baranovsky0803.additional_tasks;

/*  Вычислить: 1+2+4+8+...+256 */

public class Task_10 {
    public static void main(String[] args) {

        int sum = 0;

        // Сложение
        for (int i = 1; i < 257; i *= 2) {
            sum += i;
            System.out.println("sum " + sum + " " + i);
        }
    }


}
