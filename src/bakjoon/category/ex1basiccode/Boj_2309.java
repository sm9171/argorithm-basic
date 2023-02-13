package bakjoon.category.ex1basiccode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0, fake1 = 0, fake2 = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(sum - arr[i]-arr[j] == 100){
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
        }

        for(int i = 0; i<arr.length; i++) {
            if(i == fake1 || i == fake2)
                continue;
            System.out.println(arr[i]);
        }
    }
}
