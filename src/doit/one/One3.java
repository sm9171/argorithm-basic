package doit.one;

public class One3 {
    public static void main(String[] args) {
        String a = "it is time to study";
        String arr[] = a.split(" ");
        String b = "";
        int max =Integer.MIN_VALUE;
        for (String s : arr) {
            if(max<s.length()){
                max=s.length();
                b=s;
            }
        }
        System.out.println(b);
    }
}
