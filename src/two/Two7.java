package two;

public class Two7 {
    public static void main(String[] args) {
        int a = 10;
        int b[] = {1, 0, 1, 1, 1, 0, 0, 1, 1, 0};
        Two7 T = new Two7();
        System.out.println(T.solution(a,b));
    }

    private int solution(int a, int[] b) {
        int result = 0;
        int add =0;
        for (int i = 0; i < a; i++) {
            if(b[i]==1){
                add++;
                result+=add;
            }else{
                add=0;
            }
        }
        return result;
    }
}
