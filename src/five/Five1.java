package five;

import java.util.Stack;

public class Five1 {
    public static void main(String[] args) {

        String a =  "(()(()))(()";

        Five1 T = new Five1();
        System.out.print(T.solution(a));


    }

    private String solution(String a) {
        String result = "YES";

        Stack<Character> stack = new Stack<>();
        for (char x : a.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else if (x == ')') {
                if (stack.isEmpty()) {
                    result = "NO";
                    break;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            result = "NO";
        }
        return result;
    }
}
