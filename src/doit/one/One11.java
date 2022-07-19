package doit.one;

public class One11 {
    public static void main(String[] args) {
        String str = "KSTTTSEEKFKKKDJJGG";
        One11 T = new One11();
        System.out.println(T.Soloution(str));
    }
    private String Soloution(String s) {
        String result ="";
        s=s+" ";
        int count = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
            }else{
                result+=s.charAt(i);
                if(count>1){
                    result+=count;
                }
                count=1;
            }
        }
        return result;
    }
}
