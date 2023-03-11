package bakjoon.category.ex5queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10845 {
    private static int[] queue = new int[10001];
    private static int first = 0;
    private static int last = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
                case "front" :
                    sb.append(front()).append("\n");
                    break;
                case "back" :
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    private static void push(int x) {
        queue[last] = x;
        last++;
    }

    private static int pop() {
        if (last - first == 0) {
            return -1;
        } else {
            int num = queue[first];
            first++;
            return num;
        }
    }

    private static int size() {
        return last - first;
    }

    private static int empty() {
        if(last - first == 0) {
            return 1;
        }else {
            return 0;
        }
    }

    private static int front() {
        if (last - first == 0) {
            return -1;
        } else {
            return queue[first];
        }
    }

    private static int back() {
        if (last - first == 0) {
            return -1;
        } else {
            return queue[last - 1];
        }
    }
}
