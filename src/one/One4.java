package one;

import java.util.ArrayList;

public class One4 {
    public static void main(String[] args) {
        One4 T = new One4();
        String a = "3";
        String[] str = {"good","Time","Big"};
        int count = Integer.parseInt(a);


        for (String x : T.solution(count, str)) {
            System.out.println(x);
        }
    }

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x:str) {
            //리버스 함수사용
            // String tmp = new StringBuilder(x).reverse().toString();

            //배열 순서 봐꾸기
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }
}
