package five;


import java.util.Stack;

public class Five5 {
    public static void main(String[] args) {
        String a =  "(((()(()()))(())()))(()())";
        Five5 T = new Five5();
        System.out.print(T.solution(a));


    }

    private int solution(String a) {
        int result = 0;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(') {
                stack.push('(');
            } else  {
                stack.pop();
                if (a.charAt(i - 1) == ')') {
                    result++;
                }else{
                    result+=stack.size();
                }
            }
        }
        return result;
    }
}
