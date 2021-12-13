package three;


public class Three4 {
    public static void main(String[] args) {
        int n = 8;
        int k = 6;

        int[] arr = {1, 2, 1, 3, 1, 1, 1, 2};

        Three4 T = new Three4();
        System.out.println(T.solution(n,k,arr));


    }
    private int solution(int n, int k , int[] arr) {
        int result=0;

        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum+=arr[j];
                if (sum == k) {
                    result++;
                } else if (sum > k) {
                    break;
                }
            }
        }
        return result;
    }
}
