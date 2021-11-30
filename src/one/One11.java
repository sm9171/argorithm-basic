package one;

public class One11 {
    public static void main(String[] args) {
        String str = "KSTTTSEEKFKKKDJJGG";
        One11 T = new One11();
        System.out.println(T.Soloution(str));
    }
    private String Soloution(String s) {
        String result ="";
        char c[] = s.toCharArray();
        char ch= c[0];
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (ch == c[i]) {
                count++;
            }else{
                if(count!=1){
                    result+=count;
                }
                result+=c[i];
                ch=c[i];
                count=1;
            }
        }


        return result;
    }
}
