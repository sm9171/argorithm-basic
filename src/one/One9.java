package one;

public class One9 {
    public static void main(String[] args) {
        String str = "g0en2T0s8eSoft";
        One9 T = new One9();
        System.out.println(T.Soloution(str));
    }
    private int Soloution(String str) {
        String result="";
        char c[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(c[i])) {
                result += c[i];
            }
        }
        return Integer.parseInt(result);
    }
}
