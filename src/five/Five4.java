package five;


import java.util.Stack;

public class Five4 {
    public static void main(String[] args) {
        String a =  "35+2*";

        Five4 T = new Five4();
        System.out.print(T.solution(a));


    }

    private int solution(String a) {
        int result = 0;

        Stack<Integer> stack = new Stack<>();
        for (char x:a.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int popA = stack.pop();
                int popB = stack.pop();
                switch (x){
                    case '-':
                        stack.push(popB - popA);
                        break;
                    case '+':
                        stack.push(popB + popA);
                        break;
                    case '*':
                        stack.push(popB * popA);
                        break;
                    case '/':
                        stack.push(popB / popA);
                        break;
                }
            }
        }
        result=stack.get(0);
        return result;
    }
}
