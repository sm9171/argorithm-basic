package doit.three;


public class Three6 {
    public static void main(String[] args) {
        int a= 14;
        int b= 2;
        int[] arr = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};

        Three6 T = new Three6();
        System.out.println(T.solution(a,b,arr));


    }
    private int solution(int a,int b, int arr[]) {
        int result=0;
        int cnt = 0;
        int lt =0;
        for (int rt = 0; rt < a; rt++) {
            if (arr[rt] == 0) {
                cnt++;
            }
            while (cnt > b) {
                if (arr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            result = Math.max(result, rt - lt + 1);
        }
        return result;
    }
}
