package Homework_1;

/*  Определить число, полученное выписыванием в обратном порядке цифр
    любого 4-х значного натурального числа n
*/
public class Exercise_4 {
    public static void main(String[] args) {

        //Число используемое для реверса
        int number = 6548;
        //Строка будет сохранять реверсивные цифры number
        StringBuilder reverse = new StringBuilder();

        //метод содает реверсивную строку числа number
        for (int i = 0; i < 4; i++) {
            int a = number % 10;
            reverse.append(a);
            number /= 10;
        }

        //Метод выводит реверсивное число на консоль
        System.out.println(reverse);
    }
}
