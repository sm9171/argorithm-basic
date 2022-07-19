package doit.five;


import java.util.LinkedList;
import java.util.Queue;

public class Five7 {
    public static void main(String[] args) {
        String a = "CBA";
        String b = "CBDAGE";

        Five7 T = new Five7();
        System.out.print(T.solution(a,b));


    }

    private String solution(String a,String b) {
        String result = "YES";

        Queue<Character> queue = new LinkedList<>();
        for (char x: a.toCharArray()  ) {
            queue.offer(x);
        }
        for (char x:b.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) {
                    result = "NO";
                }
            }
        }

        if (!queue.isEmpty()) {
            result = "NO";
        }
        return result;
    }
}
