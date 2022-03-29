package six;

import java.util.Arrays;

public class Six10 {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        int[] arr = {1, 2, 8, 4, 9};
        Six10 T = new Six10();
        System.out.println( T.solution(n,m,arr));
    }
    private int solution(int n, int m, int[] arr) {
        int result = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while (lt <= rt) {
            int mid = (rt + lt) / 2;
            if (count(arr, mid) >= m) {
                result = mid;
                lt = mid + 1;
            }else{
                rt = mid - 1;
            }
        }

        return result;
    }

    private int count(int arr[], int dist) {
        int cnt = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
