package doit.four;


import java.util.HashMap;

public class Four1 {
    public static void main(String[] args) {
        int a= 14;
        String b= "BACBACCACCBDEDE";

        Four1 T = new Four1();
        System.out.print(T.solution(a,b));


    }
    private char solution(int a,String b) {
        char result =' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : b.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        };

        int max = Integer.MIN_VALUE;
        for (char key:map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }
        return result;
    }
}
