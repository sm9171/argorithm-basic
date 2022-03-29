package seven;

public class Seven4 {
    public static void main(String[] args) {
        int n = 10;
        Seven4 T = new Seven4();
        for (int i = 1; i <= n; i++) {
            System.out.println(T.DFS(i));
        }
    }
    private int DFS(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return DFS(n - 2) + DFS(n - 1);
        }
    }
}
