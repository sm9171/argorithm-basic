package doit.six;

import java.util.Arrays;

public class Six8 {
    public static void main(String[] args) {
        int n = 8;
        int m = 32;
        int[] arr = {23, 87, 65, 12, 57, 32, 99, 81};

        Six8 T = new Six8();
        System.out.println( T.solution(n,m,arr));
    }

    private int solution(int n, int m, int[] arr) {
        int result = 0;
        Arrays.sort(arr);
        int lt= 0;
        int rt = n - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                result = mid + 1;
                break;
            }
            if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return result;
    }
}
