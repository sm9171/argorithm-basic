package solved.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//브루트포스 사용
public class bak_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 666;
        int count = 1;

        while (count != N) {
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
        br.close();
    }
}
