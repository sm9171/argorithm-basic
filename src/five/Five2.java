package five;

import java.util.Stack;

public class Five2 {
    public static void main(String[] args) {

        String a =  "(A(BC)D)EF(G(H)(IJ)K)LM(N)";

        Five2 T = new Five2();
        System.out.print(T.solution(a));


    }

    private String solution(String a) {
        String result = "";

        Stack<Character> stack = new Stack<>();
        for (char x : a.toCharArray()) {
             if (x == ')') {
                while(stack.pop()!='(');
            }else{
                 stack.push(x);
             }
        }
        for (int i = 0; i <stack.size(); i++) {
            result += stack.get(i);
        }
        return result;
    }
}
