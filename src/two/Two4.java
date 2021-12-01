package two;

public class Two4 {
    public static void main(String[] args) {
        int a = 10;

        Two4 T = new Two4();
        for(int x:T.solution(a)){
            System.out.print(x+" ");
        }

    }

    private int[] solution(int a) {
        int result[] = new int[a];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i < a; i++) {
            result[i] = result[i - 2] + result[i - 1];
        }
        return result;
    }
}
