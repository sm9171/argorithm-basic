package two;

//timelimit
public class Two6 {
    public static void main(String[] args) {
        int a = 6;
        int b[] = {32, 55, 62, 20, 250, 370, 200, 30, 100};

        Two6 T = new Two6();
        System.out.println(T.solution(a,b));
    }

    private String solution(int a, int[] b) {
        String result = "";
        for (int i = 0; i < a; i++) {
            String str = b[i]+"";
            StringBuffer sb = new StringBuffer(str);
            String reversedStr = sb.reverse().toString();
            int reverseNum = Integer.parseInt(reversedStr);

        }
        return result;
    }

    private int primeNum(int num) {
        int result=0;

        return result;
    }
}
