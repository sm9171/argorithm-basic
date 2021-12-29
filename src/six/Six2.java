package six;

public class Six2 {
    public static void main(String[] args) {
        int n = 9;
        int[] arr = {3, 7, 1, 5, 4, 2, 9, 8, 6};


        Six2 T = new Six2();
        for (int x: T.solution(n,arr)) {
            System.out.print(x+" ");
        }
    }
    private int[] solution(int n,int[] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
