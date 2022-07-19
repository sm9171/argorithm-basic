package doit.two;

public class Two9 {
    public static void main(String[] args) {
        int a = 5;
        int b[][] = {
                    {10, 13, 10, 12, 15},
                    {12, 39, 30, 23, 11},
                    {11, 25, 50, 53, 15},
                    {19, 27, 29, 37, 27},
                    {19, 13, 30, 13, 19}
        };
        Two9 T = new Two9();
        System.out.println(T.solution(a, b));
    }

    private int solution(int a, int[][] b) {
        int max = 0;
        int sum1,sum2;
        for (int i = 0; i < a; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < a; j++) {
                sum1+=b[i][j];
                sum2+=b[j][i];
            }
            max = Math.max(sum1, max);
            max = Math.max(sum2, max);
        };
        sum1 = sum2 =0;
        for (int i = 0; i < a; i++) {
            sum1 += b[i][i];
            sum2 += b[i][a-i-1];
        }
        max = Math.max(sum1, max);
        max = Math.max(sum2, max);
        return max;
    }
}
