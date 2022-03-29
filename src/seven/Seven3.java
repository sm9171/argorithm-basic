package seven;

public class Seven3 {
    public static void main(String[] args) {
        int n = 5;
        Seven3 T = new Seven3();
        System.out.println(T.DFS(n));
    }
    private int DFS(int n) {
        if (n == 1) {
            return 1;
        }else{
           return n * DFS(n - 1);
        }
    }
}
