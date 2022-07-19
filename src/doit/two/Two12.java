package doit.two;

public class Two12 {

    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c[][] = {
                {3, 4, 1, 2},
                {4, 3 ,2 ,1},
                {3, 1, 4, 2}
        };
        Two12 T = new Two12();
        System.out.println(T.solution(a, b,c));
    }

    private int solution(int a,int b ,int[][] c) {
        int answer = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                int cnt =0;
                for (int k = 0; k < b; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < a; s++) {
                        if (c[k][s] == i) {
                            pi=s;
                        }

                        if (c[k][s] == j) {
                            pj=s;
                        }
                    }
                    if (pi<pj) {
                        cnt++;
                    }
                }
                if (cnt == b) {
                    answer++;
                }

            }
        }
        return answer;
    }
}
