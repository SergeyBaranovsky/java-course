package homework_2;

/*Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.
*/

public class Exercise_6 {
    public static void main(String[] args) {

        int number = 0;

        isThreeDigits(number);
        isTheLastNumberSeven(number);
        isEvenNumber(number);

    }

    //Метод проверяет трехзначное ли число
    public static void isThreeDigits(int number) {

        //Если число отрицательное --> меняем его на положительное
        if (number < 0) {
            number *= -1;
        }

        //  Выводит сообщение, является ли число трехзначным или нет

        if (number>99 && number<1000) {
            System.out.println("Число трехзначное");
        } else {
            System.out.println("Число не трехзначное");
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
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное либо равно нулю");
        }
    }
}
