package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//bak_11720
public class solved_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        String strNum = br.readLine();
        for (int i = 0; i < N; i++) {
            result += Integer.parseInt(String.valueOf(strNum.charAt(i)));
        }
        System.out.println(result);
    }
}
