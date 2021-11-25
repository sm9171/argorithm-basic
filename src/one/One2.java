package one;

public class One2 {
    public static void main(String[] args) {
        String a = "StuDY";
        String b = "";
        for (char x : a.toCharArray()) {
            if (Character.isUpperCase(x)) {
                b += Character.toLowerCase(x);
            } else {
                b += Character.toUpperCase(x);
            }
        }
        System.out.println("b = " + b);
    }
}
