package solved.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bak_1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }else{
                String str = Integer.toString(n);
                String result = "yes";
                int half = str.length() / 2;
                for (int i = 0; i < half; i++) {
                    if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                        result = "no";
                    }
                }
                System.out.println(result);
            }
        }
        br.close();
    }
}
