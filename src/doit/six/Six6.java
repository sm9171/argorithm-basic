package doit.six;

import java.util.ArrayList;
import java.util.Arrays;

public class Six6 {
    public static void main(String[] args) {
        int n = 9;
        int[] arr = {120, 125, 152, 130, 135, 135, 143, 127, 160};


        Six6 T = new Six6();
        for (int x:T.solution(n, arr)) {
            System.out.print(x+ " ");

        }
    }
    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
