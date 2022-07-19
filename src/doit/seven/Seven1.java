package doit.seven;

public class Seven1 {
    public static void main(String[] args) {
        int n = 3;


        Seven1 T = new Seven1();
        T.DFS(n);
    }
    private void DFS(int n) {
        if (n == 0) {
            return;
        }else{
            System.out.println(n);
            DFS(n-1);
        }

    }
}
