package one;

public class One10 {
    public static void main(String[] args) {
        String str = "teachermode";
        String str2 = "e";
        char c = str2.charAt(0);
        One10 T = new One10();
        for (int i : T.Soloution(str,c)) {
            System.out.print(i+" ");
        }
    }
    private int[] Soloution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p=0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }
        p=1000;
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i) == t) {
                p=0;
            }else{
                p++;
                answer[i] = Math.min(p,answer[i]);
            }
        }
        return answer;
    }
}
