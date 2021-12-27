package five;


import java.util.LinkedList;
import java.util.Queue;

public class Five6 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;

        Five6 T = new Five6();
        System.out.print(T.solution(a,b));


    }

    private int solution(int a,int b) {
        int result = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= a; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 1; i < b; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                result = queue.poll();
            }
        }
        return result;
    }
}
