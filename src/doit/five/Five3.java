package doit.five;


import java.util.Stack;

public class Five3 {
    public static void main(String[] args) {
        int a =  5;
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}};
        int b = 8;
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        Five3 T = new Five3();
        System.out.print(T.solution(board, moves));


    }

    private int solution(int[][] board, int[] moves) {
        int result = 0;

        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i <board.length ; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        result += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }


        return result;
    }
}
