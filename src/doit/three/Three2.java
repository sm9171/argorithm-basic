package doit.three;


import java.util.ArrayList;
import java.util.Arrays;

public class Three2 {
    public static void main(String[] args) {
        int a = 5;
        int[] arrA = {1, 3, 9, 5, 2};
        int b = 5;
        int[] arrB = {3, 2, 5, 7, 8};

        Three2 T = new Three2();
        for (int w :T.solution(a,arrA, b,arrB)) {
            System.out.print(w+" ");
        }

    }
    private ArrayList<Integer> solution(int a , int[] arrA, int b , int[] arrB) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        int ai = 0;
        int bi = 0;

        while (ai < a && bi < b) {
            if (arrA[ai] == arrB[bi]) {
                result.add(arrA[ai++]);
                bi++;
            } else if (arrA[ai] < arrB[bi]) {
                ai++;
            } else {
                bi++;
            }
        }
        return result;
    }
}
