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
    public static void main(String[] args) {

        //  Игровое поле 3х3
        String[][] gameField = new String[3][3];

        //  Инкремент для инициализации номера игровой ячейки
        int numberField = 7;

        //  Нумерация игрового поля
        //  [7][8][9]
        //  [4][5][6]
        //  [1][2][3]
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameField[i][j] = "[" + numberField + "]";
                numberField++;
            }
            numberField -= 6;
        }

        //  Вывод меню выбора режима игры
        System.out.println("Выбери режим игры");
        System.out.println("1. PvP mode");
        System.out.println("2. PvE mode");

        //  Хранит значения режима игры
        int scannerResult;
        do {
            //  Инициализация режима игры
            System.out.print("Твой выбор: ");
            scannerResult = new Scanner(System.in).nextInt();
        } while (scannerResult < 1 || scannerResult > 2);

        //  Счетчик ходов
        int counter = 1;
        //  Хранит значения(Х или О)
        char playerValue;
        //  Хранит значения игровой ячейки,куда игрок сделал свой ход
        int playerChoice;
        //  Триггер игры
        boolean gameResult = true;

        do {
            //  Вывод игрового поля на консоль
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(gameField[i][j]);
                }
                System.out.println();
            }

            //  В зависимости от счетчика меняет значения (Х либо О)
            playerValue = counter % 2 == 0 ? 'O' : 'X';

            if (scannerResult == 1) {
                System.out.print("Ход игрока который играет за " + playerValue);
                playerChoice = new Scanner(System.in).nextInt();
            } else {
                if (counter % 2 == 0) {
                    playerChoice = new Random().nextInt(9) + 1;
                    System.out.println("Компьютер сделал свой ход");
                } else {
                    System.out.print("Твой ход игрок( " + playerValue + " ): ");
                    playerChoice = new Scanner(System.in).nextInt();
                }
            }
            //  В зависимости от выбранной ячейки для хода игрока происходит запись значения,
            //  а если ячейка занята,то игрок делает еще один ход
            switch (playerChoice) {
                case 1:
                    if (gameField[2][0].equals("[X]") || gameField[2][0].equals("[O]")) {
                        break;
                    }
                    gameField[2][0] = "[" + playerValue + "]";
                    counter++;
                    break;
                case 2:
                    if (gameField[2][1].equals("[X]") || gameField[2][1].equals("[O]")) {
                        break;
                    }
                    gameField[2][1] = "[" + playerValue + "]";
                    counter++;
                    break;
                case 3:
                    if (gameField[2][2].equals("[X]") || gameField[2][2].equals("[O]")) {
                        break;
                    }
                    gameField[2][2] = "[" + playerValue + "]";
                    counter++;
                    break;
                case 4:
                    if (gameField[1][0].equals("[X]") || gameField[1][0].equals("[O]")) {
                        break;
                    }
                    gameField[1][0] = "[" + playerValue + "]";
                    counter++;
                    break;
                case 5:
                    if (gameField[1][1].equals("[X]") || gameField[1][1].equals("[O]")) {
                        break;
                    }
                    gameField[1][1] = "[" + playerValue + "]";
                    counter++;
                    break;
                case 6:
                    if (gameField[1][2].equals("[X]") || gameField[1][2].equals("[O]")) {
                        break;
                    }
                    gameField[1][2] = "[" + playerValue + "]";
                    counter++;
                    break;
                case 7:
                    if (gameField[0][0].equals("[X]") || gameField[0][0].equals("[O]")) {
                        break;
                    }
                    gameField[0][0] = "[" + playerValue + "]";
                    counter++;
                    break;
                case 8:
                    if (gameField[0][1].equals("[X]") || gameField[0][1].equals("[O]")) {
                        break;
                    }
                    gameField[0][1] = "[" + playerValue + "]";
                    counter++;
                    break;
                case 9:
                    if (gameField[0][2].equals("[X]") || gameField[0][2].equals("[O]")) {
                        break;
                    }
                    gameField[0][2] = "[" + playerValue + "]";
                    counter++;
                    break;
                default:
                    System.out.println("Введи число от 1 - 9 ");
            }
            // Проверка комбинаций выигрыша по диагонали
            for (int i = 1; i < 2; i++) {
                for (int j = 1; j < 2; j++) {
                    if ((!gameField[i][j].equals(gameField[i - 1][j - 1]) || !gameField[i][j].equals(gameField[i + 1][j + 1]))
                            && (!gameField[i][j].equals(gameField[i + 1][j - 1]) || !gameField[i][j].equals(gameField[i - 1][j + 1]))) {
                        continue;
                    }
                    System.out.println("Winner " + playerValue);
                    gameResult = false;
                    break;
                }
            }
            // Проверка комбинаций выигрыша по горизонтали
            for (int i = 0; i < 2; i++) {
                for (int j = 1; j < 2; j++) {
                    if (gameField[i][j].equals(gameField[i][j - 1])
                            && gameField[i][j].equals(gameField[i][j + 1])) {
                        System.out.println("Winner " + playerValue);
                        gameResult = false;
                        break;
                    }
                }
            }
            // Проверка комбинаций выигрыша по вертикали
            for (int i = 1; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (gameField[i][j].equals(gameField[i - 1][j])
                            && gameField[i][j].equals(gameField[i + 1][j])) {
                        System.out.println("Winner " + playerValue);
                        gameResult = false;
                        break;
                    }
                }
            }
            //  Если сделано 9 результативных ходов
            if (counter > 9) {
                System.out.println("Ничья");
                gameResult = false;
            }

        }
        while (gameResult);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(gameField[i][j]);
            }
            System.out.println();
        }
    }
}