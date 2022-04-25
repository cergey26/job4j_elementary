package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            for (int i = 0; i < board[index].length; i++) {
                    if (board[index][i] == 'X') {
                        result = true;
                        break;
                    }
            }
        }
        return result;
    }
}