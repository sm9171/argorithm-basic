package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//bak_2018
public class solved_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int lt = 1;
        int rt = 1;
        int count = 1;
        int sum = 1;
        while (rt != n) {
            if (sum == n) {
                count++;
                rt++;
                sum += rt;
            } else if (sum > n) {
                sum -= lt;
                lt++;
            } else {
                rt++;
                sum += rt;
            }
        }
        System.out.println(count);
    }
}
