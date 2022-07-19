package doit.six;

import java.util.Arrays;

public class Six9 {
    public static void main(String[] args) {
        int n = 9;
        int m = 3;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Six9 T = new Six9();
        System.out.println( T.solution(n,m,arr));
    }
    private int solution(int n, int m, int[] arr) {
        int result = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (rt + lt) / 2;
            if (count(arr, mid) <= m) {
                result = mid;
                rt = mid - 1;
            }else{
                lt = mid + 1;
            }
        }

        return result;
    }

    private int count(int arr[], int capacity) {
        int cnt = 1;
        int sum = 0;
        for (int x :arr) {
            if (x + sum > capacity) {
                cnt++;
                sum = x;
            }else{
                sum += x;
            }
        }
        return cnt;
    }
}
