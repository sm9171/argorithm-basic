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
        int lt = Arrays.stream(arr).min().getAsInt();
        int rt = Arrays.stream(arr).max().getAsInt();

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
