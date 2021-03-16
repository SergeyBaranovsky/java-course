package homework_2;

/*  Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию)*/

public class Exercise_10 {
    public static void main(String[] args) {

        //Сообщение приветствия
        System.out.println("Данная программ предназначена для подсчета" +
                " факториала чисел в границах от 10 до 15 ");

        /*  Переменная для сохранения факториала числа 9. */
        long factorialNumberTen = 1;

        /* Массив данных для факториала */
        int[] randomNumbers = {10, 11, 12, 13, 14, 15};

        /* Цикл высчитывает факториал числа 10 */
        for (int j = 1; j <= 10; j++) {
            factorialNumberTen *= j;
        }

        /*  Вывод результата на консоль */
        for (int randomNumber : randomNumbers) {
            if (randomNumber != 10) {
                factorialNumberTen *= randomNumber;
            }
            System.out.println("Факториал числа " + randomNumber + " = " + factorialNumberTen);
        }
    }
}


