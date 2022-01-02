package six;

import java.util.Arrays;

public class Six5 {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {1, 2, 3, 2, 6, 2, 3, 5, 7};


        Six5 T = new Six5();
        System.out.println(T.solution(n, arr));
    }
    private String solution(int n,int[] arr) {
        String result = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i + 1]) {
                result = "D";
            }
        }
        return result;
    }
}
