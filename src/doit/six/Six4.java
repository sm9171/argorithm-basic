package doit.six;

public class Six4 {
    public static void main(String[] args) {
        int s = 5;
        int n = 9;
        int[] arr = {1, 2, 3, 2, 6, 2, 3, 5, 7};


        Six4 T = new Six4();
        for (int x: T.solution(s,n,arr)) {
            System.out.print(x+" ");
        }
    }
    private int[] solution(int s, int n,int[] arr) {
        int[] cache = new int[s];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }
            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }else{
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }

        }
        return cache;
    }
}
