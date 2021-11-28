package one;

public class One7 {
    public static void main(String[] args) {
        String str = "gooG";

        One7 T = new One7();

        System.out.println(T.Soroution(str));
    }

    private String Soroution(String str) {
        String result="YES";
        String a = str.toLowerCase();
        for (int i = 0; i < a.length()/2; i++) {
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                result = "NO";
            }
        }

        return result;
    }
}
