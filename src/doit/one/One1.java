package doit.one;

public class One1 {
    public static void main(String[] args) {
        String a = "Computercooler".toLowerCase();
        String b = "c".toLowerCase();
        int count =0;
        char c =b.charAt(0);
        for (char c1 : a.toCharArray()) {
            if (c1 == c) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

}
