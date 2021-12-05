package two;

public class Two10 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        int a = 5;
        int b[][] = {
                    {5, 3, 7, 2, 3},
                    {3, 7, 1, 6, 1},
                    {7, 2, 5, 3, 4},
                    {4, 3, 6, 4, 1},
                    {8, 7, 3, 5, 2}
        };
        Two10 T = new Two10();
        System.out.println(T.solution(a, b));
    }

    private int solution(int a, int[][] b) {
        int answer = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if ( nx >= 0 && nx < a && ny >= 0 && ny < a&&b[nx][ny] >= b[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }

        }
        return answer;
    }
}
