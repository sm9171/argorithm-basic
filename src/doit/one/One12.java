package doit.one;

public class One12 {
    public static void main(String[] args) {
        String str1 = "4";
        String str2 = "#****###**#####**#####**##**";
        int a = Integer.parseInt(str1);
        One12 T = new One12();
        System.out.println(T.Soloution(a,str2));
    }
    private String Soloution(int a, String s) {
        String result ="";
        for (int i = 0; i < a; i++) {
            String tmp = s.substring(0,7).replace('#','1').replace('*','0');
            int pi = Integer.parseInt(tmp, 2);
            result+=(char)pi;
            s = s.substring(7);
        }
        return result;
    }
}
