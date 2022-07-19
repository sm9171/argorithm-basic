package doit.four;


import java.util.HashMap;

public class Four2 {
    public static void main(String[] args) {
        String a= "AbaAeCe";
        String b= "baeeACA";

        Four2 T = new Four2();
        System.out.print(T.solution(a,b));


    }
    private String solution(String a,String b) {
        String result ="YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : a.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        };
        for (char x : b.toCharArray()){
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            map.put(x, map.get(x) - 1);
        };
        return result;
    }
}
