package doit.five;


import java.util.LinkedList;
import java.util.Queue;

class Person {

    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Five8 {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int[] arr = {60, 50, 70, 80, 90};

        Five8 T = new Five8();
        System.out.print(T.solution(n,k,arr));


    }

    private int solution(int n, int k, int[] arr) {
        int result = 1;

        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i <arr.length ; i++) {
            queue.offer(new Person(i, arr[i]));
        }
        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person x:queue) {
                if (x.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                if (tmp.id != k) {
                    result++;
                } else {
                    break;
                }
            }
        }
        return result;
    }
}
