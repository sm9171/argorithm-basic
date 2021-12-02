package two;

public class Two6 {
    public static void main(String[] args) {
        int a = 9;
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
            if (primeNum(reverseNum)) {
                System.out.print(reverseNum+" ");
            }
        }
        return result;
    }

    private boolean primeNum(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num%i==0) return false;
        }
        return true;
    }
}
