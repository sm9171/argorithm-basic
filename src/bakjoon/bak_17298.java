package bakjoon;

import java.io.*;
import java.util.Stack;

public class bak_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] A = new int[n]; //수열 배열 생성
        int[] ans = new int[n]; //정답 배열 생성
        String[] str = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(str[i]);
        }

        Stack<Integer> myStack = new Stack<>();
        myStack.push(0); //처음에는 항상 스택이 비어 있으므로 최초 값을 push해 초기화
        for (int i = 0; i < n ; i++) {
            //스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
            while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
                ans[myStack.pop()] = A[i];
            }
            myStack.push(i);
        }
        while (!myStack.empty()) {
            ans[myStack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(ans[i]+ " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
