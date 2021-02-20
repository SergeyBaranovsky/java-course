package homework_2;

/*  Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию)*/

public class Exercise_10 {
    public static void main(String[] args) {

        //Сообщение приветствия
        System.out.println("Данная программ предназначена для подсчета" +
                " факториала чисел в границах от 10 до 15 ");

        /*  Переменная для сохранения изменения факториала после каждой итерации. */
        long factorialNumber = 1;

        /* Массив данных для факториала */
        int[] randomNumbers = {10, 11, 12, 13, 14, 15};

        /* Цикл высчитывает факториалы чисел в промежутке от 10 - 15 */
        for (int randomNumber : randomNumbers) {
            for (int j = 1; j <= randomNumber; j++) {
                factorialNumber *= j;
            }

            /*  Вывод результата на консоль */
            System.out.println("Факториал числа " + randomNumber + " = " + factorialNumber);
            factorialNumber = 1;
        }
    }
}

