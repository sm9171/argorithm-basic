package doit.two;

public class Two1 {
    public static void main(String[] args) {

        int a = 6;
        int b[] = {7, 3, 9, 5, 6, 12};

        Two1 T = new Two1();
        System.out.println(T.solution(a,b));
    }

    private String solution(int num, int[] numArr) {
        String result ="";
        result += numArr[0]+" ";
        for (int i = 1; i < num; i++) {
            if (numArr[i-1] < numArr[i]) {
                result+=numArr[i]+" ";
            }
        }

        return result;
    }
}
