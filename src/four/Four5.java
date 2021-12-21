package four;

import java.util.Collections;
import java.util.TreeSet;

public class Four5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int[] arr = {13, 15, 34, 23, 45, 65, 33, 11, 26, 42};


        Four5 T = new Four5();
        System.out.println(T.solution(a, b, arr));

    }

    private int solution(int a, int b, int[] arr) {
        int result = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                for (int k = j + 1; k < a; k++) {
                    Tset.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }
        int cnt=0;
        for (int x : Tset) {
            cnt++;
            if (cnt == b) {
                result = x;
                break;
            }
        }
        return result;
    }
}
