package two;

public class Two3 {
    public static void main(String[] args) {
        int a = 5;
        int b[] = {2,3,3,1,3};
        int c[] = {1,1,2,2,3};

        Two3 T = new Two3();
        for (int i = 0; i < a; i++) {
            System.out.println(T.solution(b[i],c[i]));
        }
    }

    private String solution(int a, int b) {
        String result = "";
        if (a == b) {
            result = "D";
        } else if (a == 1 && b == 3) {
            result = "A";
        } else if (a == 2 && b == 1) {
            result = "A";
        } else if (a == 3 && b == 2) {
            result = "A";
        } else {
            result = "B";
        }
        return result;
    }
}
