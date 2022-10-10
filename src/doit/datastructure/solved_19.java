package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//boj_11004
public class solved_19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr, 0, N - 1, K - 1);
        System.out.println(arr[K - 1]);
    }

    private static void quickSort(int[] arr, int S, int E, int K) {
        if (S < E) {
            int pivot = partition(arr, S, E);
            if (pivot == K) {
                return;
            } else if (K < pivot) {
                quickSort(arr, S, pivot - 1, K);
            }else{
                quickSort(arr, pivot + 1, E, K);
            }
        }
    }

    private static int partition(int[] arr, int S, int E) {
        int M = (S + E) / 2;
        swap(arr, S, M);
        int pivot = arr[S];
        int i = S;
        int j = E;
        while (i < j) {
            while (pivot < arr[j]) {
                j--;
            }
            while (i < j && pivot >= arr[i]) {
                i++;
            }
            swap(arr, i, j);
        }
        arr[S] = arr[i];
        arr[i] = pivot;
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
