package six;

public class Six1 {
    public static void main(String[] args) {
        int n = 9;
        int[] arr = {3, 7, 1, 5, 4, 2, 9, 8, 6};


        Six1 T = new Six1();
        for (int x: T.solution(n,arr)) {
            System.out.print(x+" ");
        }
    }
    private int[] solution(int n,int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[minIndex]> arr[j]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }
}


