package two;

public class Two11 {

    public static void main(String[] args) {
        int a = 5;
        int b[][] = {
                    {2, 3, 1, 7, 3},
                    {4, 1, 9, 6, 8},
                    {5, 5, 2, 4, 4},
                    {6, 5, 2, 6, 7},
                    {8, 4, 2, 2, 2}
        };
        Two11 T = new Two11();
        System.out.println(T.solution(a, b));
    }

    private int solution(int a, int[][] b) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a; i++) {
            int cnt=0;
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < 5; k++) {
                    if (b[i][k] == b[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max=cnt;
                answer=i+1;
            }
        }
        return answer;
    }
}
