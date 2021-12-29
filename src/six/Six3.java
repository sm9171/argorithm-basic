package six;

public class Six3 {
    public static void main(String[] args) {
        int n = 9;
        int[] arr = {3, 7, 1, 5, 4, 2, 9, 8, 6};


        Six3 T = new Six3();
        for (int x: T.solution(n,arr)) {
            System.out.print(x+" ");
        }
    }
    private int[] solution(int n,int[] arr) {
        for (int i = 1; i < n; i++) {
            int target = arr[i];
            int j = i-1;
            while (j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
        return arr;
    }
}
