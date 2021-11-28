package one;

public class One6 {
    public static void main(String[] args) {
        String str = "ksekkset";

        One6 T = new One6();

        System.out.println(T.Soroution(str));
    }

    private String Soroution(String str) {
        String result="";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==i) {
                result += str.charAt(i);
            }
        }

        return result;
    }
}
