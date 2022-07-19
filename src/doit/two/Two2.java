package doit.two;

public class Two2 {
    public static void main(String[] args) {
        int a = 8;
        int b[] = {130,135,148,140,145,150,150,153};

        Two2 T = new Two2();
        System.out.println(T.solution(a,b));
    }

    private int solution(int a, int[] b) {
        int result = 0;
        int min =0;
        for (int i = 0; i < a; i++) {
            if (min < b[i]) {
                min = b[i];
                result++;
            }
        }
        return result;
    }
}
