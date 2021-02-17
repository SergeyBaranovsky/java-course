package Homework_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*  Имеется прямоугольное отверстие размерами a и b,
    определить, можно ли его полностью закрыть круглой картонкой радиусом r*/

public class Exercise_7 {

    //используется для ввода значений с консоли
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try{
            //заполняем данные с консоли
            double r = getR();
            double a = getA();
            double b = getB();

            //запуск метода решения задачи
            ifCircleBiggerThanRectangle(r,a,b);
        }
        //Ловим ошибку и выводим сообщение на консоль
        catch (InputMismatchException ex){
            System.out.println("Введен неверный формат данных");
        }
    }

    //Метод проверяет закроект ли картонный круг вырезанное прямоугольное отверстие
    public static void ifCircleBiggerThanRectangle(double r, double a, double b) {

        //ветвление проверки решения задачи
        if (r >= (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) / 2) {
            System.out.println("Круг картона накроет прямоугольное отверстие");
        } else {
            System.out.println("Круг картона не накроет прямоугольное отверстие");
        }
    }

    //Метод возвращает значение для радиуса круга
    public static double getR() {
        System.out.println("Введите значение для радиуса: ");
        return scanner.nextDouble();
    }

    //Метод возвращает значение для стороны а прямоугольника
    public static double getA() {
        System.out.println("Введите значение для стороны а: ");
        return scanner.nextDouble();
    }

    //Метод возвращает значение для стороны b прямоугольника
    public static double getB() {
        System.out.println("Введите значение для стороны b: ");
        return scanner.nextDouble();
    }
}
