package doit.three;


import java.util.ArrayList;

public class Three1 {
    public static void main(String[] args) {
        int a = 3;
        int[] arrA = {1, 3, 5};
        int b = 5;
        int[] arrB = {2, 3, 6, 7, 9};

        Three1 T = new Three1();
        for (int w :T.solution(a,arrA, b,arrB)) {
            System.out.print(w+" ");
        }

    }
    private ArrayList<Integer> solution(int a , int[] arrA, int b , int[] arrB) {
        ArrayList<Integer> result = new ArrayList<>();
        int ai = 0, bi = 0;
        while (ai < a && bi < b) {
            if (arrA[ai] < arrB[bi]) {
                result.add(arrA[ai++]);
            } else {
                result.add(arrB[bi++]);
            }
        }
        while (ai < a) {
            result.add(arrA[ai++]);
        }
        while (bi < b) {
            result.add(arrB[bi++]);
        }

        return result;
    }
}
