package com.gmail.baranovsky0803.additional_tasks;

/*  Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
    Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника.
    Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
    Если хотя бы в одном случае отрезок окажется больше суммы двух других,
    то треугольника с такими сторонами не существует.  */

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        //  Ввод данных для сторон треугольника
        System.out.print("Введите значение для стороны А: ");
        int sideA = new Scanner(System.in).nextInt();
        System.out.print("Введите значение для стороны B: ");
        int sideB = new Scanner(System.in).nextInt();
        System.out.print("Введите значение для стороны C: ");
        int sideC = new Scanner(System.in).nextInt();

        // Проверка условий задачи и вывод результата на консоль
        if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB){
            System.out.println("Такой треугольник существует");
        }
        else {
            System.out.println("Такого треугольника не существует");
        }
    }
}
