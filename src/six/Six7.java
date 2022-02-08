package six;

import java.util.ArrayList;

public class Six7 {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = {
                {2, 7},
                {1, 3},
                {1, 2},
                {2, 5},
                {3, 6}};

        Six7 T = new Six7();
        for (int x:T.solution(n, arr)) {
            System.out.print(x+ " ");

        }
    }
    private ArrayList<Integer> solution(int n, int[][] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        return result;
    }
}
