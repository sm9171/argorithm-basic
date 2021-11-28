package one;

public class One10 {
    public static void main(String[] args) {
        String str = "teachermode e";
        One10 T = new One10();
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
