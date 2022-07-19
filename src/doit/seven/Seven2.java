package doit.seven;

public class Seven2 {
    public static void main(String[] args) {
        int n = 11;
        Seven2 T = new Seven2();
        T.DFS(n);
    }
    private void DFS(int n) {
        if (n == 0) {
            return;
        }else{
            System.out.println(n%2);
            DFS(n/2);
        }
    }
}
