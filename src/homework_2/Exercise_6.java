package homework_2;

/*Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.
*/

public class Exercise_6 {
    public static void main(String[] args) {

        int number = 6545;

        isThreeDigits(number);
        isTheLastNumberSeven(number);
        isEvenNumber(number);

    }

    //Меод проверяет трехзначное ли число
    public static void isThreeDigits(int number) {
        if (number == 0) {
            System.out.println("Вы ввели число 0");
        } else {

            //Переменная предназначена для подсчета количества делений числа
            int counter = 0;

            //Если число отрицательное --> меняем его на положительное
            if (number < 0) {
                number *= -1;
            }

            //цикл используется для подсета количества делений с послдующим
            //выводом сообщения, является ли число трехзначным или нет
            while (number > 0) {
                number /= 10;
                counter++;
            }
            if (counter != 3) {
                System.out.println("Число не трехзначное");
            } else {
                System.out.println("Число трехзначное");
            }

        }

    }

    //Метод проверяет оканчивается ли число number на 7
    public static void isTheLastNumberSeven(int number) {
        if (number % 10 == 7) {
            System.out.println("Да, последняя цифра 7");
        } else {
            System.out.println("Нет,последняя цифра не 7");
        }
    }

    //Метод проверяет число на четность
    public static void isEvenNumber(int number) {
        if (number % 2 == 0 && number != 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное либо равно нулю");
        }
    }
}
