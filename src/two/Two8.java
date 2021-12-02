package two;

public class Two8 {
    public static void main(String[] args) {
        int a = 5;
        int b[] = {87,89, 92, 100, 76};
        Two8 T = new Two8();
        for (int i = 0; i < a; i++) {
            System.out.print(T.solution(a,b)[i]+ " ");
        }

    }

    private int[] solution(int a, int[] b) {
        int result[] = new int[a];

        for (int i = 0; i < a; i++) {
            int cnt = 1;
            for (int j = 0; j < a; j++) {
                if (b[i] < b[j]) {
                    cnt++;
                }
            }
            result[i]=cnt;
        }
        return result;
    }
}
