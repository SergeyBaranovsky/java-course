package com.gmail.baranovsky0803.games;

/*  написать игру крестики нолики (двумерный массив размерностью 3х3).
    Для этой задачи сделайте отдельную ветку

    1. Не используя классы и методы - все в методе main
    2. Не используя утильные классы (Arrays и Math)
    3. Игра должна продолжаться до тех пор, пока не будет выявлен победитель
    (три "О" или три "Х" в ряд или по диагонали) или пока не закончатся свободные клетки
 */

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static final int LENGTH = 3;
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //  Игровое поле
        /*   [ ] [ ] [ ]
         *   [ ] [ ] [ ]
         *   [ ] [ ] [ ]  */
        String[][] playingField = new String[LENGTH][LENGTH];


        String value; //  Значение X/O

        int playerChoice; // Инициализация переменной для выбора режимов игры
        int fieldNumber = 7;//  Используется для заполнения игрового массива 789/456/123
        int counter = 1;//  Счётчик ходов,триггер смены X/O, триггер для ничьей( counter == 0)

        boolean gameResult = true;// триггер выхода из цикла do-while

        System.out.println("***** XO-Game *****");
        System.out.println("dev by Baranovsky Sergey");

        //  Вывод игрового поля и правил игры на консоль
        System.out.println("\n***** Инструкция *****\n");
        System.out.println("1. Это твоё игровое поле.\n");

        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                playingField[i][j] = "[" + fieldNumber + "] ";
                fieldNumber++;
            }
            fieldNumber -= 6;
        }

        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                System.out.print(playingField[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n2. В игре используется стандартные правила игры Крестики - Нолики");
        System.out.println("3. Чтобы сделать ход введи с клавиатуры номер свободный ячейки");

        System.out.println("\nНо для начала выбери режим игры:");
        System.out.println("\tPvP режим --> введи 1 и жми Enter");
        System.out.println("\tPvE режим --> введи 2 и жми Enter");

        //  Выбор режима игры
        do {
            System.out.print("\nТвой выбор: ");
            playerChoice = scanner.nextInt();

        } while ((playerChoice < 1 || playerChoice > 2));

        //  Если режим игры против компьютера
        if (playerChoice == 2) {
            do {
                //  Если ходит игрок(   Игрок ходит вторым и играет ноликом)
                if (counter % 2 == 0) {
                    value = "[O] ";

                    //  Выбор поля в которое игрок хочет поставить нолик
                    do {
                        System.out.print("\nТвой ход: ");
                        playerChoice = scanner.nextInt();
                    } while (playerChoice < 1 || playerChoice > 9);

                    //  Если игровое поле не занято,то в него записывается ход игрока
                    //  Если занято,игрок повторяет свой выбор
                    switch (playerChoice) {
                        case 1:
                            if (!playingField[2][0].equals("[O] ") && !playingField[2][0].equals("[X] ")) {
                                playingField[2][0] = value;
                                counter++;
                            }
                            break;
                        case 2:
                            if (!playingField[2][1].equals("[O] ") && !playingField[2][1].equals("[X] ")) {
                                playingField[2][1] = value;
                                counter++;
                            }
                            break;
                        case 3:
                            if (!playingField[2][2].equals("[O] ") && !playingField[2][2].equals("[X] ")) {
                                playingField[2][2] = value;
                                counter++;
                            }
                            break;
                        case 4:
                            if (!playingField[1][0].equals("[O] ") && !playingField[1][0].equals("[X] ")) {
                                playingField[1][0] = value;
                                counter++;
                            }
                            break;
                        case 5:
                            if (!playingField[1][1].equals("[O] ") && !playingField[1][1].equals("[X] ")) {
                                playingField[1][1] = value;
                                counter++;
                            }
                            break;
                        case 6:
                            if (!playingField[1][2].equals("[O] ") && !playingField[1][2].equals("[X] ")) {
                                playingField[1][2] = value;
                                counter++;
                            }
                            break;
                        case 7:
                            if (!playingField[0][0].equals("[O] ") && !playingField[0][0].equals("[X] ")) {
                                playingField[0][0] = value;
                                counter++;
                            }
                            break;
                        case 8:
                            if (!playingField[0][1].equals("[O] ") && !playingField[0][1].equals("[X] ")) {
                                playingField[0][1] = value;
                                counter++;
                            }
                            break;
                        case 9:
                            if (!playingField[0][2].equals("[O] ") && !playingField[0][2].equals("[X] ")) {
                                playingField[0][2] = value;
                                counter++;
                            }
                            break;
                    }
                }
                // Если ход компьютера (компьютер ходит первым и играет Крестиком
                else {

                    System.out.println();
                    value = "[X] ";

                    //  Выбирается рандомное число от 0 до 8 для соответствующего хода
                    int randomValue = random.nextInt(8);

                    //  Если игровое поле не занято,то в него записывается ход компьютера
                    //  Если занято,компьютер повторяет свой выбор
                    switch (randomValue) {
                        case 0:
                            if (!playingField[2][0].equals("[X] ") && (!playingField[2][0].equals("[O] "))) {
                                playingField[2][0] = value;
                                counter++;
                            }
                            break;
                        case 1:
                            if (!playingField[2][1].equals("[X] ") && (!playingField[2][1].equals("[O] "))) {
                                playingField[2][1] = value;
                                counter++;
                            }
                            break;
                        case 2:
                            if (!playingField[2][2].equals("[X] ") && (!playingField[2][2].equals("[O] "))) {
                                playingField[2][2] = value;
                                counter++;
                            }
                            break;
                        case 3:
                            if (!playingField[1][0].equals("[X] ") && (!playingField[1][0].equals("[O] "))) {
                                playingField[1][0] = value;
                                counter++;
                            }
                            break;
                        case 4:
                            if (!playingField[1][1].equals("[X] ") && (!playingField[1][1].equals("[O] "))) {
                                playingField[1][1] = value;
                                counter++;
                            }
                            break;
                        case 5:
                            if (!playingField[1][2].equals("[X] ") && (!playingField[1][2].equals("[O] "))) {
                                playingField[1][2] = value;
                                counter++;
                            }
                            break;
                        case 6:
                            if (!playingField[0][0].equals("[X] ") && (!playingField[0][0].equals("[O] "))) {
                                playingField[0][0] = value;
                                counter++;
                            }
                            break;
                        case 7:
                            if (!playingField[0][1].equals("[X] ") && (!playingField[0][1].equals("[O] "))) {
                                playingField[0][1] = value;
                                counter++;
                            }
                            break;
                        case 8:
                            if (!playingField[0][2].equals("[X] ") && (!playingField[0][2].equals("[O] "))) {
                                playingField[0][2] = value;
                                counter++;
                            }
                            break;
                    }

                    //  Выводиться игровое поле на консоль
                    for (int i = 0; i < LENGTH; i++) {
                        for (int j = 0; j < LENGTH; j++) {
                            System.out.print(playingField[i][j]);
                        }
                        System.out.println();
                    }
                    //  Сообщение,что компьютер сделал свой ход
                    System.out.println("Компьютер сделал свой ход.");
                }
                // Проверка на победу у игроков
                if ((playingField[0][0].equals("[X] ") && playingField[0][1].equals("[X] ") && playingField[0][2].equals("[X] "))
                        || (playingField[1][0].equals("[X] ") && playingField[1][1].equals("[X] ") && playingField[1][2].equals("[X] "))
                        || (playingField[2][0].equals("[X] ") && playingField[2][1].equals("[X] ") && playingField[2][2].equals("[X] "))
                        || (playingField[0][0].equals("[X] ") && playingField[1][0].equals("[X] ") && playingField[2][0].equals("[X] "))
                        || (playingField[0][1].equals("[X] ") && playingField[1][1].equals("[X] ") && playingField[2][1].equals("[X] "))
                        || (playingField[0][2].equals("[X] ") && playingField[1][2].equals("[X] ") && playingField[2][2].equals("[X] "))
                        || (playingField[0][0].equals("[X] ") && playingField[1][1].equals("[X] ") && playingField[2][2].equals("[X] "))
                        || (playingField[0][2].equals("[X] ") && playingField[1][1].equals("[X] ") && playingField[2][0].equals("[X] "))) {

                    //  Вывод на консоль игрового поля
                    for (int i = 0; i < LENGTH; i++) {
                        for (int j = 0; j < LENGTH; j++) {
                            System.out.print(playingField[i][j]);
                            System.out.print(" ");
                        }
                        System.out.println();
                    }

                    //  Вывод сообщения о победе игрока
                    System.out.println("\nПобедил компьютер");

                    //  Переключение триггера на окончание игры
                    gameResult = false;

                } else if ((playingField[0][0].equals("[O] ") && playingField[0][1].equals("[O] ") && playingField[0][2].equals("[O] "))
                        || (playingField[1][0].equals("[O] ") && playingField[1][1].equals("[O] ") && playingField[1][2].equals("[O] "))
                        || (playingField[2][0].equals("[O] ") && playingField[2][1].equals("[O] ") && playingField[2][2].equals("[O] "))
                        || (playingField[0][0].equals("[O] ") && playingField[1][0].equals("[O] ") && playingField[2][0].equals("[O] "))
                        || (playingField[0][1].equals("[O] ") && playingField[1][1].equals("[O] ") && playingField[2][1].equals("[O] "))
                        || (playingField[0][2].equals("[O] ") && playingField[1][2].equals("[O] ") && playingField[2][2].equals("[O] "))
                        || (playingField[0][0].equals("[O] ") && playingField[1][1].equals("[O] ") && playingField[2][2].equals("[O] "))
                        || (playingField[0][2].equals("[O] ") && playingField[1][1].equals("[O] ") && playingField[2][0].equals("[O] "))) {

                    //  Вывод на консоль игрового поля
                    for (int i = 0; i < LENGTH; i++) {
                        for (int j = 0; j < LENGTH; j++) {
                            System.out.print(playingField[i][j]);
                            System.out.print(" ");
                        }
                        System.out.println();
                    }

                    //  Вывод сообщения о победе игрока
                    System.out.println("\nТы победил");

                    //  Переключение триггера на окончание игры
                    gameResult = false;

                } else if (counter == 9) {

                    //  Вывод на консоль игрового поля
                    for (int i = 0; i < LENGTH; i++) {
                        for (int j = 0; j < LENGTH; j++) {
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
        else {

            do {
                //  Проверяет чей сейчас ход
                value = counter % 2 == 0 ? "[O] " : "[X] ";

                //  Вывод игрового поля на консоль
                System.out.println("Игровое поле");
                for (int i = 0; i < LENGTH; i++) {
                    for (int j = 0; j < LENGTH; j++) {

                        System.out.print(playingField[i][j]);
                        System.out.print(" ");
                    }
                    System.out.println();
                }

                //  Вывод возможного хода для игрока
                System.out.println();
                System.out.println("Введи свободный номер  на игровом поле");

                //  Игрок делает ход
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
                        if (!playingField[2][0].equals("[O] ") && !playingField[2][0].equals("[X] ")) {
                            playingField[2][0] = value;
                            counter++;
                        }
                        break;
                    case 2:
                        if (!playingField[2][1].equals("[O] ") && !playingField[2][1].equals("[X] ")) {
                            playingField[2][1] = value;
                            counter++;
                        }
                        break;
                    case 3:
                        if (!playingField[2][2].equals("[O] ") && !playingField[2][2].equals("[X] ")) {
                            playingField[2][2] = value;
                            counter++;
                        }
                        break;
                    case 4:
                        if (!playingField[1][0].equals("[O] ") && !playingField[1][0].equals("[X] ")) {
                            playingField[1][0] = value;
                            counter++;
                        }
                        break;
                    case 5:
                        if (!playingField[1][1].equals("[O] ") && !playingField[1][1].equals("[X] ")) {
                            playingField[1][1] = value;
                            counter++;
                        }
                        break;
                    case 6:
                        if (!playingField[1][2].equals("[O] ") && !playingField[1][2].equals("[X] ")) {
                            playingField[1][2] = value;
                            counter++;
                        }
                        break;
                    case 7:
                        if (!playingField[0][0].equals("[O] ") && !playingField[0][0].equals("[X] ")) {
                            playingField[0][0] = value;
                            counter++;
                        }
                        break;
                    case 8:
                        if (!playingField[0][1].equals("[O] ") && !playingField[0][1].equals("[X] ")) {
                            playingField[0][1] = value;
                            counter++;
                        }
                        break;
                    case 9:
                        if (!playingField[0][2].equals("[O] ") && !playingField[0][2].equals("[X] ")) {
                            playingField[0][2] = value;
                            counter++;
                        }
                        break;
                }

                // Проверка на победу у игроков
                if ((playingField[0][0].equals("[X] ") && playingField[0][1].equals("[X]") && playingField[0][2].equals("[X]"))
                        || (playingField[1][0].equals("[X] ") && playingField[1][1].equals("[X] ") && playingField[1][2].equals("[X] "))
                        || (playingField[2][0].equals("[X] ") && playingField[2][1].equals("[X] ") && playingField[2][2].equals("[X] "))
                        || (playingField[0][0].equals("[X] ") && playingField[1][0].equals("[X] ") && playingField[2][0].equals("[X] "))
                        || (playingField[0][1].equals("[X] ") && playingField[1][1].equals("[X] ") && playingField[2][1].equals("[X] "))
                        || (playingField[0][2].equals("[X] ") && playingField[1][2].equals("[X] ") && playingField[2][2].equals("[X] "))
                        || (playingField[0][0].equals("[X] ") && playingField[1][1].equals("[X] ") && playingField[2][2].equals("[X] "))
                        || (playingField[0][2].equals("[X] ") && playingField[1][1].equals("[X] ") && playingField[2][0].equals("[X] "))) {

                    //  Вывод на консоль игрового поля
                    for (int i = 0; i < LENGTH; i++) {
                        for (int j = 0; j < LENGTH; j++) {
                            System.out.print(playingField[i][j]);
                            System.out.print(" ");
                        }
                        System.out.println();
                    }

                    //  Вывод сообщения о победе игрока
                    System.out.println("Победил игрок игравший Х - крестиком");

                    //  Переключение триггера на окончание игры
                    gameResult = false;

                } else if ((playingField[0][0].equals("[O] ") && playingField[0][1].equals("[O] ") && playingField[0][2].equals("[O] "))
                        || (playingField[1][0].equals("[O] ") && playingField[1][1].equals("[O] ") && playingField[1][2].equals("[O] "))
                        || (playingField[2][0].equals("[O] ") && playingField[2][1].equals("[O] ") && playingField[2][2].equals("[O] "))
                        || (playingField[0][0].equals("[O] ") && playingField[1][0].equals("[O] ") && playingField[2][0].equals("[O] "))
                        || (playingField[0][1].equals("[O] ") && playingField[1][1].equals("[O] ") && playingField[2][1].equals("[O] "))
                        || (playingField[0][2].equals("[O] ") && playingField[1][2].equals("[O] ") && playingField[2][2].equals("[O] "))
                        || (playingField[0][0].equals("[O] ") && playingField[1][1].equals("[O] ") && playingField[2][2].equals("[O] "))
                        || (playingField[0][2].equals("[O] ") && playingField[1][1].equals("[O] ") && playingField[2][0].equals("[O] "))) {

                    //  Вывод на консоль игрового поля
                    for (int i = 0; i < LENGTH; i++) {
                        for (int j = 0; j < LENGTH; j++) {
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
                    for (int i = 0; i < LENGTH; i++) {
                        for (int j = 0; j < LENGTH; j++) {
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
}