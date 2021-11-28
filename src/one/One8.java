package one;

public class One8 {
    public static void main(String[] args) {
        String str = "found7, time: study; Yduts; emit, 7Dnuof";
        One8 T = new One8();

        System.out.println(T.Soroution(str));
    }

    private String Soroution(String str) {
        String result="YES";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                result = "NO";
            }
        }

        return result;
    }
}
