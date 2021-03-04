package com.gmail.baranovsky0803.games;

import java.util.Scanner;

/*  написать игру крестики нолики (двумерный массив размерностью 3х3).
    Для этой задачи сделайте отдельную ветку

    1. Не используя классы и методы - все в методе main
    2. Не используя утильные классы (Arrays и Math)
    3. Игра должна продолжаться до тех пор, пока не будет выявлен победитель
    (три "О" или три "Х" в ряд или по диагонали) или пока не закончатся свободные клетки
 */


public class TicTakToe {

    //  Длинна игрового поля
    static private final int LengthPlayingField = 3;

    public static void main(String[] args) {

        //   Результат игры после каждого хода.
        //   Триггер выхода из цикла игры
        boolean gameResult = true;

        /*  Пустой двумерный массив типа [3][3] char.
         *   В него буду записываться ходы игроков (Х, О)
         * */
        String[][] playingField = new String[LengthPlayingField][LengthPlayingField];

        //  Переменная для хода игрока( X/O )
        String value;

        //  Счетчик ходов.
        //  Если counter % 2 == 0 ход первого игрока (Х).
        //  Если counter % 2 != 0 ход второго игрока (О).
        int counter = 1;

        //  Переменная используется для инициализации игрового поля
        //  Инициализация начинается с верхнего ряда игрового поля.
        int numberOfField = 7;

        //  Инициализация игрового поля
        //  7 8 9
        //  4 5 6
        //  1 2 3
        for (int i = 0; i < LengthPlayingField; i++) {
            for (int j = 0; j < LengthPlayingField; j++) {
                playingField[i][j] = "[" + numberOfField + "]";
                numberOfField++;
            }
            numberOfField -= 6;
        }

        //  "Велосипед"
        do {

            //  Проверяет чей сейчас ход
            value = counter % 2 == 0 ? "O" : "X";

            //  Вывод игрового поля на консоль
            System.out.println("Игровое поле");
            for (int i = 0; i < LengthPlayingField; i++) {
                for (int j = 0; j < LengthPlayingField; j++) {

                    System.out.print(playingField[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }

            //  Вывод возможного хода для игрока
            System.out.println();
            System.out.println("Введи свободный номер  на игровом поле");


            //  Игрок делает ход
            int playerChoice;
            do {
                //  Вывод сообщение о ходе игрока
                System.out.println();
                System.out.print("\nВыберите свой ход (ходит игрок играющий за " + value + " ): ");

                //  Записывает в переменную выбор для хода игрока
                playerChoice = new Scanner(System.in).nextInt();

            } while (playerChoice < 1 || playerChoice > 9);


            //   В зависимости от выбранной позиции свободное поле помечается X/O
            switch (playerChoice) {

                case 1:
                    //  Если поле занято то игрок делает еще один ход
                    if (playingField[2][0].equals("[X]") || playingField[2][0].equals("[O]")) {
                        counter--;

                    } // Иначе в поле записывается Х/O
                    else {
                        playingField[2][0] = "[" + value + "]";
                    }
                    break;

                case 2:
                    if (playingField[2][1].equals("[X]") || playingField[2][1].equals("[O]")) {
                        counter--;

                    } else {
                        playingField[2][1] = "[" + value + "]";
                    }
                    break;

                case 3:
                    if (playingField[2][2].equals("[X]") || playingField[2][2].equals("[O]")) {
                        counter--;

                    } else {
                        playingField[2][2] = "[" + value + "]";
                    }
                    break;

                case 4:
                    if (playingField[1][0].equals("[X]") || playingField[1][0].equals("[O]")) {
                        counter--;

                    } else {
                        playingField[1][0] = "[" + value + "]";
                    }
                    break;

                case 5:
                    if (playingField[1][1].equals("[X]") || playingField[1][1].equals("[O]")) {
                        counter--;

                    } else {
                        playingField[1][1] = "[" + value + "]";
                    }
                    break;

                case 6:
                    if (playingField[1][2].equals("[X]") || playingField[1][2].equals("[O]")) {
                        counter--;

                    } else {
                        playingField[1][2] = "[" + value + "]";
                    }
                    break;
                case 7:
                    if (playingField[0][0].equals("[X]") || playingField[0][0].equals("[O]")) {
                        counter--;

                    } else {
                        playingField[0][0] = "[" + value + "]";
                    }
                    break;

                case 8:
                    if (playingField[0][1].equals("[X]") || playingField[0][1].equals("[O]")) {
                        counter--;

                    } else {
                        playingField[0][1] = "[" + value + "]";
                    }
                    break;

                case 9:
                    if (playingField[0][2].equals("[X]") || playingField[0][2].equals("[O]")) {
                        counter--;

                    } else {
                        playingField[0][2] = "[" + value + "]";
                    }
                    break;

            }

            //  Триггер перехода хода(если ячейка выбора была пустая --> переход хода)
            counter++;

            // Проверка на победу у игроков
            if ((playingField[0][0].equals("[X]") && playingField[0][1].equals("[X]") && playingField[0][2].equals("[X]"))
                    || (playingField[1][0].equals("[X]") && playingField[1][1].equals("[X]") && playingField[1][2].equals("[X]"))
                    || (playingField[2][0].equals("[X]") && playingField[2][1].equals("[X]") && playingField[2][2].equals("[X]"))
                    || (playingField[0][0].equals("[X]") && playingField[1][0].equals("[X]") && playingField[2][0].equals("[X]"))
                    || (playingField[0][1].equals("[X]") && playingField[1][1].equals("[X]") && playingField[2][1].equals("[X]"))
                    || (playingField[0][2].equals("[X]") && playingField[1][2].equals("[X]") && playingField[2][2].equals("[X]"))
                    || (playingField[0][0].equals("[X]") && playingField[1][1].equals("[X]") && playingField[2][2].equals("[X]"))
                    || (playingField[0][2].equals("[X]") && playingField[1][1].equals("[X]") && playingField[2][0].equals("[X]"))) {

                //  Вывод на консоль игрового поля
                for (int i = 0; i < LengthPlayingField; i++) {
                    for (int j = 0; j < LengthPlayingField; j++) {
                        System.out.print(playingField[i][j]);
                        System.out.print(" ");
                    }
                    System.out.println();
                }

                //  Вывод сообщения о победе игрока
                System.out.println("Победил игрок игравший Х - крестиком");

                //  Переключение триггера на окончание игры
                gameResult = false;

            } else if ((playingField[0][0].equals("[O]") && playingField[0][1].equals("[O]") && playingField[0][2].equals("[O]"))
                    || (playingField[1][0].equals("[O]") && playingField[1][1].equals("[O]") && playingField[1][2].equals("[O]"))
                    || (playingField[2][0].equals("[O]") && playingField[2][1].equals("[O]") && playingField[2][2].equals("[O]"))
                    || (playingField[0][0].equals("[O]") && playingField[1][0].equals("[O]") && playingField[2][0].equals("[O]"))
                    || (playingField[0][1].equals("[O]") && playingField[1][1].equals("[O]") && playingField[2][1].equals("[O]"))
                    || (playingField[0][2].equals("[O]") && playingField[1][2].equals("[O]") && playingField[2][2].equals("[O]"))
                    || (playingField[0][0].equals("[O]") && playingField[1][1].equals("[O]") && playingField[2][2].equals("[O]"))
                    || (playingField[0][2].equals("[O]") && playingField[1][1].equals("[O]") && playingField[2][0].equals("[O]"))) {

                //  Вывод на консоль игрового поля
                for (int i = 0; i < LengthPlayingField; i++) {
                    for (int j = 0; j < LengthPlayingField; j++) {
                        System.out.print(playingField[i][j]);
                        System.out.print(" ");
                    }
                    System.out.println();
                }

                //  Вывод сообщения о победе игрока
                System.out.println("Победил игрок игравший O - ноликом");

                //  Переключение триггера на окончание игры
                gameResult = false;

            } else if (counter > 9) {

                //  Вывод на консоль игрового поля
                for (int i = 0; i < LengthPlayingField; i++) {
                    for (int j = 0; j < LengthPlayingField; j++) {
                        System.out.print(playingField[i][j]);
                        System.out.print(" ");
                    }
                    System.out.println();
                }

                //  Вывод сообщения о ничьей на консоль
                System.out.println("\nНичья");

                //  Переключение триггера на окончание игры
                gameResult = false;

            }
        } while (gameResult);

    }
}
