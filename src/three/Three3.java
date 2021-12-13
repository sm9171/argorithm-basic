package three;


import java.util.ArrayList;
import java.util.Arrays;

public class Three3 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;

        int[] arr = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};

        Three3 T = new Three3();
        System.out.println(T.solution(n,k,arr));


    }
    private int solution(int n, int k , int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
