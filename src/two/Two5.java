package two;

public class Two5 {
    public static void main(String[] args) {
        int a = 20;
        Two5 T = new Two5();
        System.out.println(T.solution(a));
    }

    private int solution(int a) {
        int result =0;
        int[] ch = new int[a + 1];
        for (int i = 2; i <= a; i++) {
            if (ch[i] == 0) {
                result++;
                for (int j = i; j <= a; j = j + i) {
                    ch[j]=1;
                }
            }
        }
        return result;
    }
}
