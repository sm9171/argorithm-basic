package three;


public class Three5 {
    public static void main(String[] args) {
        int a= 15;

        Three5 T = new Three5();
        System.out.println(T.solution(a));


    }
    private int solution(int a) {
        int result=0;
        for (int i = 1; i <= a; i++) {
            int sum=0;
            for (int j = i; j <= a; j++) {
                sum+=j;
                if (sum == a) {
                    result++;
                    break;
                } else if (sum > a) {
                    break;
                }

            }
        }
        return result-1;
    }
}
