package one;

public class One5 {
    public static void main(String[] args) {
        String str = "a#b!GE*T@S";

        One5 T = new One5();

        System.out.println(T.Soroution(str));

    }

    public String Soroution(String str) {
        String result;
        char[] c = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while (lt < rt) {
            if (!Character.isAlphabetic(c[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(c[rt])) {
                rt--;
            } else{
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        result = String.valueOf(c);
        return result;
    }
}
