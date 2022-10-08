package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//boj_11399
public class solved_18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] arrHap = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < N; i++) {
            int insert_point = i;
            int insert_value = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    insert_point = j + 1;
                    break;
                }
                if (j == 0) {
                    insert_point = 0;
                }
            }
            for (int j = i; j > insert_point; j--) {
                arr[j] = arr[j - 1];
            }
            arr[insert_point] = insert_value;
        }
        arrHap[0] = arr[0];
        for (int i = 1; i < N; i++) {
            arrHap[i] = arrHap[i - 1] + arr[i];
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arrHap[i];
        }
        System.out.println(sum);
    }
}
